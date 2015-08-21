package com.cyl.algorithm.ibf.l27;

import com.cyl.algorithm.ibf.l26.MyAdjGraphic;

public class Prim {
	public static final int MAXWEIGHT = 9999;

	public static void prim(MyAdjGraphic g, MinSpanTree[] closeVertex) {
		int n = g.getNumOfVertices();// 获得节点数量
		int[] lowCost = new int[n];// 存储某一边的权值，而后标记是否被访问
		int k = 0;
		int minCost;

		// 初始化closeVertex数组
		for (int i = 0; i < n; i++) {
			lowCost[i] = g.getWeightOfEdges(0, i);
		}

		MinSpanTree temp = new MinSpanTree();
		temp.vertex = g.getValueOfVertex(0);
		closeVertex[0] = temp;
		lowCost[0] = -2;// 标记为已访问（0节点自己与自己的边）

		for (int i = 1; i < n; i++) {
			minCost = MAXWEIGHT;
			for (int j = 1; j < n; j++) {
				// 从lowCost中取最小的值赋予minCost
				if (lowCost[j] < minCost && lowCost[j] > 0) {
					minCost = lowCost[j];
					k = j;
				}
			}
			// k表示最小权值路径的指向的下一节点序号
			// 这个循环结束后，minCost就是当前lowCost数组中的最小值

			MinSpanTree curr = new MinSpanTree();
			curr.vertex = g.getValueOfVertex(k);
			curr.weight = minCost;
			closeVertex[i] = curr;
			lowCost[k] = -2;// 标记为已访问

			for (int j = 1; j < n; j++) {
				if (g.getWeightOfEdges(k, j) > 0) {
					if (lowCost[j] == -1) {
						// -1表示没有边
						lowCost[j] = g.getWeightOfEdges(k, j);
					} else {
						if (g.getWeightOfEdges(k, j) < lowCost[j]
								&& lowCost[j] != -2) {
							lowCost[j] = g.getWeightOfEdges(k, j);
						}
					}
				}
			}
		}
	}
}
