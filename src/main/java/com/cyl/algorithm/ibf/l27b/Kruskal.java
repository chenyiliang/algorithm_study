package com.cyl.algorithm.ibf.l27b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Kruskal {
	private int[][] table;
	private HashSet<Integer> vertices;// 存放卡鲁斯卡尔算法中已经涉及到的顶点名称
	private ArrayList<Edge> resultEdges;
	private ArrayList<Edge> initEdges;
	private int numberOfVertice;

	public Kruskal(int[][] table) {
		this.vertices = new HashSet<Integer>();
		this.resultEdges = new ArrayList<Edge>();
		this.initEdges = new ArrayList<Edge>();
		this.numberOfVertice = table.length;
		this.table = table;
		createEdges();
	}

	/** 克鲁斯卡尔算法 */
	public void kruskal() {
		int timer = 1;
		sortInitEdges(initEdges);
		// 这个while完毕之后还差最后一条边
		while (timer <= this.numberOfVertice - 1) {
			// 最小生成树的边数等于顶点数-1
			Edge curEdge = initEdges.get(0);
			// 判断是否构成环
			if (vertices.contains(curEdge.getLeftV())
					&& vertices.contains(curEdge.getRightV())) {
				// 构成环
				initEdges.remove(0);
				timer++;
			} else {
				// 不构成环
				resultEdges.add(curEdge);
				vertices.add(curEdge.getLeftV());
				vertices.add(curEdge.getRightV());
				initEdges.remove(0);
				timer++;
			}
		}
	}

	/** 找到最后一个边，这个边跨越两个连通子树 */
	public Edge findTheLastEdgeInVfromResultEdges() {
		ArrayList<Integer> setA = new ArrayList<Integer>();// 存放子树1的顶点
		ArrayList<Integer> setB = new ArrayList<Integer>();// 存放子树2的顶点
		ArrayList<Edge> tempEdges = new ArrayList<Edge>();// 临时在两子树间构架边

		setA.add(resultEdges.get(0).getLeftV());// 子树1初始化
		setA.add(resultEdges.get(0).getRightV());// 子树1初始化
		for (int i = 0; i < resultEdges.size(); i++) {
			// 遍历前面棵子树的所有边
			Edge edge = resultEdges.get(i);// 获得当前遍历的边的引用
			if (setA.contains(edge.getLeftV())
					|| setA.contains(edge.getRightV())) {
				setA.add(resultEdges.get(i).getLeftV());// 如果当前边的两顶点有任何一个存在于setA
				setA.add(resultEdges.get(i).getRightV());// 即将两顶点放入setA
			} else {
				setB.add(resultEdges.get(i).getLeftV());// 否则放入到setB
				setB.add(resultEdges.get(i).getRightV());
			}
		}
		for (int i = 0; i < setA.size(); i++) {
			// 按照table建临时的边（这些边跨越setA setB）
			for (int j = 0; j < setB.size(); j++) {
				if (table[setA.get(i)][setB.get(j)] > 0) {
					tempEdges.add(new Edge(setA.get(i), table[setA.get(i)][setB
							.get(j)], setB.get(j)));
				}
			}
		}
		Collections.sort(tempEdges);// 根据权值非递减排序
		return tempEdges.get(0);// 返回全职最小的边的引用
	}

	/** 打印边的集合 */
	public void printEdge(ArrayList<Edge> edges) {
		Iterator<Edge> it = edges.iterator();
		while (it.hasNext()) {
			Edge edge = it.next();
			System.out.println(edge);
		}
	}

	/** 对边根据权值非递减排序 */
	public void sortInitEdges(ArrayList<Edge> edges) {
		Collections.sort(edges);
	}

	/** 创建所有边 */
	// 左下三角没有遍历到
	public void createEdges() {
		for (int i = 0; i < table.length; i++) {
			for (int j = i; j < table[i].length; j++)
				if (table[i][j] > 0)
					initEdges.add(new Edge(i, table[i][j], j));
		}
	}

	/** 打印图信息 */
	public void printtable() {
		System.out.println("");
		System.out.println("图的信息：");
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				System.out.printf("%3d", table[i][j]);
			}
			System.out.print("\n");
		}
	}

	public void showResult() {
		System.out.println("最小生成树由下列边组成：");
		System.out.println("顶点    权值     顶点");
		printEdge(resultEdges);
		printtable();
	}

}
