package com.cyl.algorithm.ibf.l27;

import com.cyl.algorithm.ibf.l26.MyAdjGraphic;
import com.cyl.algorithm.ibf.l26.Weight;

public class Test {

	static final int maxVertices = 100;

	public static void main(String[] args) {
		MyAdjGraphic g = new MyAdjGraphic(maxVertices);
		Object[] vertices = { new Character('A'), new Character('B'),
				new Character('C'), new Character('D'), new Character('E'),
				new Character('F'), new Character('G') };
		Weight[] weight = { new Weight(0, 1, 50), new Weight(1, 0, 50),
				new Weight(0, 2, 60), new Weight(2, 0, 60),
				new Weight(1, 3, 65), new Weight(3, 1, 65),
				new Weight(1, 4, 40), new Weight(4, 1, 40),
				new Weight(2, 3, 52), new Weight(3, 2, 52),
				new Weight(2, 6, 45), new Weight(6, 2, 45),
				new Weight(3, 4, 50), new Weight(4, 3, 50),
				new Weight(3, 5, 30), new Weight(5, 3, 30),
				new Weight(3, 6, 42), new Weight(6, 3, 42),
				new Weight(4, 5, 70), new Weight(5, 4, 70) };
		int n = 7, e = 20;

		try {
			Weight.createAdjGraphic(g, vertices, n, weight, e);
			MinSpanTree[] closeVertex = new MinSpanTree[7];
			Prim.prim(g, closeVertex);

			System.out.println("初始节点:" + closeVertex[0].vertex);
			for (int i = 1; i < n; i++) {
				System.out.println("节点:" + closeVertex[i].vertex + " 权值"
						+ closeVertex[i].weight);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
