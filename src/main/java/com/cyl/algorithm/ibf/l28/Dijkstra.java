package com.cyl.algorithm.ibf.l28;

import com.cyl.algorithm.ibf.l26.MyAdjGraphic;

public class Dijkstra {
	private static final int maxWeight = 9999;
	
	//v0:起始点，distance:每次保存最短距离的数组，path：经过的节点数值
	public static void dijkstra(MyAdjGraphic g, int v0, int[] distance,
			int[] path) {
		int n = g.getNumOfVertices();// 节点数量
		int[] s = new int[n];// 标示结点是否已被访问的数组
		int minDis;// 每次找到的最短路径
		int u = 0;// 下一次最短路径对应的结点的下标

		for (int i = 0; i < n; i++) {
			distance[i] = g.getWeightOfEdges(v0, i);
			s[i] = 0;// 未访问
			if (i != v0 && distance[i] < maxWeight) {
				path[i] = v0;
			} else {
				path[i] = -1;
			}
		}
		s[0] = 1;// 标记为已访问
		for (int i = 1; i < n; i++) {
			minDis = maxWeight;
			for (int j = 0; j < n; j++) {
				if (distance[j] != -1) {// 说明有边存在
					// 结点未访问，并且小于当前最小路径
					if (s[j] == 0 && distance[j] < minDis) {
						u = j;
						minDis = distance[j];
					}
				}
			}

			if (minDis == maxWeight) {
				return;
			}

			s[u] = 1;// 标记为已访问

			for (int j = 0; j < n; j++) {
				if (g.getWeightOfEdges(u, j) != -1) {// 有边存在
					if (distance[j] == -1) {// 未访问过
						if (s[j] == 0 && g.getWeightOfEdges(u, j) < maxWeight) {
							distance[j] = distance[u]
									+ g.getWeightOfEdges(u, j);
							path[j] = u;
						}
					} else {
						if (s[j] == 0
								&& g.getWeightOfEdges(u, j) < maxWeight
								&& distance[u] + g.getWeightOfEdges(u, j) < distance[j]) {
							distance[j] = distance[u]
									+ g.getWeightOfEdges(u, j);
							path[j] = u;
						}
					}
				}

			}
		}
	}
}
