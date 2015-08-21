package com.cyl.algorithm.ibf.l25;

public class Test {

	public static void main(String[] args) {
		int n = 5;// 5个结点
		int e = 5;// 5条边

		MyAdjGraphic g = new MyAdjGraphic(n);
		Object[] vertices = { new Character('A'), new Character('B'),
				new Character('C'), new Character('D'), new Character('E') };

		Weight[] weights = { new Weight(0, 1, 10), new Weight(0, 4, 20),
				new Weight(2, 1, 40), new Weight(1, 3, 30),
				new Weight(3, 2, 50) };

		Weight.createAdjGraphic(g, vertices, n, weights, e);
		g.print();
		// g.deleteEdges(0, 4);
		// g.print();
	}
}
