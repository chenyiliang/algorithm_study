package com.cyl.algorithm.ibf.l36;

import java.util.ArrayList;
import java.util.List;

public class Car {
	private List<Things> thingsList = new ArrayList<Things>();

	public List<Things> getThingsList() {
		return thingsList;
	}

	public void setThingsList(List<Things> thingsList) {
		this.thingsList = thingsList;
	}

	// 车子跑一趟, 返回跑了多少趟，包括此趟
	public Integer addThing(Things thing) {
		this.thingsList.add(thing);
		return thingsList.size();
	}
}
