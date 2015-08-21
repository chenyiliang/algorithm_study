package com.cyl.algorithm.ibf.l26;

public class Weight {
	int row;
	int col;
	int weight;

	public Weight(int row, int col, int weight) {
		this.row = row;
		this.col = col;
		this.weight = weight;
	}

	public static void createAdjGraphic(MyAdjGraphic g, Object[] vertices,
			int n, Weight[] weights, int e) {
		// 初始化节点
		for (int i = 0; i < n; i++) {
			g.insertVertex(vertices[i]);
		}

		// 初始化所有的边
		for (int i = 0; i < e; i++) {
			g.insertEdges(weights[i].row, weights[i].col, weights[i].weight);
		}
	}
}
