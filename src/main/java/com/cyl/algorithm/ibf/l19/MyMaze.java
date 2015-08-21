package com.cyl.algorithm.ibf.l19;

public class MyMaze {
	private static int startPosI;
	private static int startPosJ;
	private static int endPosI;
	private static int endPosJ;

	public static void setStart(int startPosI, int startPosJ) {
		MyMaze.startPosI = startPosI;
		MyMaze.startPosJ = startPosJ;
	}

	public static void setEnd(int endPosI, int endPosJ) {
		MyMaze.endPosI = endPosI;
		MyMaze.endPosJ = endPosJ;
	}

	// i,j入口
	public static void visited(int[][] cell, int i, int j) {
		cell[i][j] = 1;
		if (i == endPosI && j == endPosJ) {
			System.out.println("找到一条通路：");
			for (int m = 0; m < cell.length; m++) {
				for (int n = 0; n < cell[0].length; n++) {
					if (cell[m][n] == 2) {
						System.out.print("2");
					} else if (cell[m][n] == 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}

		// 向左找
		if (cell[i][j - 1] == 0) {
			visited(cell, i, j - 1);
		}

		// 向右找
		if (cell[i][j + 1] == 0) {
			visited(cell, i, j + 1);
		}
		// 上
		if (cell[i - 1][j] == 0) {
			visited(cell, i - 1, j);
		}
		// 下
		if (cell[i + 1][j] == 0) {
			visited(cell, i + 1, j);
		}

		cell[i][j] = 0;

	}

	public static void main(String[] args) {
		MyMaze.setStart(1, 1);
		MyMaze.setEnd(7, 7);
		visited(Maze.mazeArray, 1, 1);
	}

}
