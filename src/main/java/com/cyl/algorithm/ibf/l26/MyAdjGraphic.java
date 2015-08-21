package com.cyl.algorithm.ibf.l26;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

	public int getFirstNeighbor(int v) {
		if (v < 0 || v >= vertices.size()) {
			throw new IllegalArgumentException("v参数越界错误！");
		}
		for (int col = 0; col < this.vertices.size(); col++) {
			if (this.edges[v][col] > 0) {
				return col;
			}
		}
		return -1;
	}

	public int getNextNeighbor(int v1, int v2) {
		if ((v1 < 0 || v1 >= vertices.size())
				|| (v2 < 0 || v2 >= vertices.size())) {
			throw new IllegalArgumentException("v1或者v2参数越界错误！");
		}
		for (int col = v2 + 1; col < this.vertices.size(); col++) {
			if (this.edges[v1][col] > 0) {
				return col;
			}
		}
		return -1;
	}

	private void depthFirstSearch(int v, boolean[] visited, Visit vs) {
		// 连通图以v为初始结点序号、访问操作为vs的深度优先遍历
		// 数组visited标记了相应结点是否已访问过，0表示未访问，1表示已访问
		vs.print(getValueOfVertex(v));// 访问该结点
		visited[v] = true;// 置已访问标记
		int w = getFirstNeighbor(v);// 取第一个邻接结点
		while (w != -1) {
			// 当链接结点存在时循环
			if (!visited[w]) {
				depthFirstSearch(w, visited, vs);
			}
			w = getNextNeighbor(v, w);
		}
	}

	public void depthFirstSearch(Visit v) {
		boolean[] visited = new boolean[this.vertices.size()];
		for (int i = 0; i < visited.length; i++) {
			visited[i] = false;
		}
		depthFirstSearch(0, visited, v);
	}

	private void broadFirstSearch(int v, boolean[] visited, Visit vs) {
		int u, w;
		Queue<Integer> queue = new LinkedList<Integer>();
		vs.print(getValueOfVertex(v));// 访问该结点
		visited[v] = true;// 置已访问标记
		queue.add(new Integer(v));
		while (!queue.isEmpty()) {
			u = queue.remove().intValue();
			w = getFirstNeighbor(u);
			while (w != -1) {
				if (!visited[w]) {
					vs.print(getValueOfVertex(w));
					visited[w] = true;
					queue.add(new Integer(w));
				}
				w = getNextNeighbor(u, w);
			}
		}
	}

	public void broadFirstSearch(Visit v) {
		boolean[] visited = new boolean[this.vertices.size()];
		for (int i = 0; i < visited.length; i++) {
			visited[i] = false;
		}
		broadFirstSearch(0, visited, v);
	}
}
