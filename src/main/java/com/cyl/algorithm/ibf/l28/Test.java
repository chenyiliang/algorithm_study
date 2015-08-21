package com.cyl.algorithm.ibf.l28;

import com.cyl.algorithm.ibf.l26.MyAdjGraphic;
import com.cyl.algorithm.ibf.l26.Weight;




public class Test {
	static final int maxVertices = 100;
	
	public static void main(String[] args) {
		MyAdjGraphic g = new MyAdjGraphic(maxVertices);
	    
		Object[] vertices = {new Character('A'),new Character('B'),new Character('C'),
				new Character('D'),new Character('E'),new Character('F')};
		
		Weight[] weight = {new Weight(0,2,5),new Weight(0,3,30),new Weight(1,0,2),
				new Weight(1,4,8),new Weight(2,1,15),new Weight(2,5,7),new Weight(4,3,4),
				new Weight(5,3,10),new Weight(5,4,18)};
	
	    int n = 6;
	    int e = 9;
	    
	    try
	    {
	    	Weight.createAdjGraphic(g, vertices, n, weight, e);
	    	int[] distance = new int[n];
	    	int[] path = new int[n];
	    	Dijkstra.dijkstra(g, 0, distance, path);
	    	
	    	System.out.println("从顶点A到其他各顶点的最短距离为：");
			for(int i = 1; i < n; i ++)
			{
				System.out.println("到顶点" + g.getValueOfVertex(i) + "的最短距离为：" + distance[i]);
			}	
			System.out.println("从顶点A到其他各顶点的前一顶点分别为：");
			for(int i = 0; i < n; i ++)
			{
				if(path[i] != -1)
				{
					System.out.println("到顶点" + g.getValueOfVertex(i) + "的前一顶点为：" + g.getValueOfVertex(path[i]));
		        }
			}
	    }
	    catch(Exception ex)
	    {
	    	ex.printStackTrace();
	    }
	}

}
