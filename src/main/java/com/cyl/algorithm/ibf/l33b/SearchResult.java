package com.cyl.algorithm.ibf.l33b;

public class SearchResult {
	private boolean result;
	private int index;

	public SearchResult(boolean result, int index) {
		this.result = result;
		this.index = index;
	}

	public boolean getResult() {
		return result;
	}

	public int getIndex() {
		return index;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
