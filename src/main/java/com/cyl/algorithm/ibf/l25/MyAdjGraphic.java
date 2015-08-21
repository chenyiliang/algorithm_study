package com.cyl.algorithm.ibf.l25;

import java.util.ArrayList;

public class MyAdjGraphic {
	static final int maxWeight = -1;// 没有边，权值为-1
	ArrayList<Object> vertices = new ArrayList<Object>();// 存放节点的集合
	int[][] edges;// 领接矩阵的二维数组
	int numOfEdges;// 边的数量

	public MyAdjGraphic(int n) {
		this.edges = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					edges[i][j] = 0;
				} else {
					edges[i][j] = maxWeight;
				}
			}
		}
		numOfEdges = 0;
	}

	// 返回边的数量
	public int getNumOfEdges() {
		return this.numOfEdges;
	}

	// 返回节点的数量
	public int getNumOfVertices() {
		return this.vertices.size();
	}

	// 返回节点的值
	public Object getValueOfVertex(int index) {
		return this.vertices.get(index);
	}

	// 获得某条边的权值
	public int getWeightOfEdges(int v1, int v2) {
		if ((v1 < 0 || v1 >= vertices.size())
				|| (v2 < 0 || v2 >= vertices.size())) {
			throw new IllegalArgumentException("v1或者v2参数越界错误！");
		}
		return this.edges[v1][v2];
	}

	public void insertVertex(Object obj) {
		this.vertices.add(obj);
	}

	public void insertEdges(int v1, int v2, int weight) {
		if ((v1 < 0 || v1 >= vertices.size())
				|| (v2 < 0 || v2 >= vertices.size())) {
			throw new IllegalArgumentException("v1或者v2参数越界错误！");
		}

		this.edges[v1][v2] = weight;
		this.numOfEdges++;
	}

	// 删除某条边
	public void deleteEdges(int v1, int v2) {
		if ((v1 < 0 || v1 >= vertices.size())
				|| (v2 < 0 || v2 >= vertices.size())) {
			throw new IllegalArgumentException("v1或者v2参数越界错误！");
		}
		if (v1 == v2 || this.edges[v1][v2] == maxWeight) {
			throw new IllegalArgumentException("变不存在！");
		}

		this.edges[v1][v2] = maxWeight;
		this.numOfEdges--;
	}

	public void print() {
		for (int i = 0; i < this.edges.length; i++) {
			for (int j = 0; j < this.edges[i].length; j++) {
				System.out.print(edges[i][j] + " ");
			}
			System.out.println();
		}
	}
}
