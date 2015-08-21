package com.cyl.algorithm.ibf.l36;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GreedyTest {
	public static List<Car> cars = new ArrayList<Car>();

	public static void greedySelect(List<Things> thingsList) {
		Car car = new Car();
		Integer middleTime = thingsList.get(0).getEndTime();
		car.addThing(thingsList.get(0));
		thingsList.remove(0);
		cars.add(car);

		Iterator<Things> iterator = thingsList.iterator();
		while (iterator.hasNext()) {
			Things things = iterator.next();
			if (middleTime <= things.getStartTime()) {
				middleTime = things.getEndTime();
				car.addThing(things);
				iterator.remove();
			}
		}
		// 递归
		if (thingsList.size() != 0) {
			greedySelect(thingsList);
		}

	}

	public static void main(String[] args) {
		ArrayList<Things> thingsList = new ArrayList<Things>(); // 用来装快件的，无序
		/****** 输入了11批快件 ****/
		Things thing8 = new Things("派件8", 8, 11);
		thingsList.add(thing8);
		Things thing9 = new Things("派件9", 8, 12);
		thingsList.add(thing9);
		Things thing10 = new Things("派件10", 2, 13);
		thingsList.add(thing10);
		Things thing11 = new Things("派件11", 12, 14);
		thingsList.add(thing11);
		Things thing1 = new Things("派件1", 1, 4);
		thingsList.add(thing1);
		Things thing2 = new Things("派件2", 3, 5);
		thingsList.add(thing2);
		Things thing3 = new Things("派件3", 0, 6);
		thingsList.add(thing3);
		Things thing4 = new Things("派件4", 5, 7);
		thingsList.add(thing4);
		Things thing5 = new Things("派件5", 3, 8);
		thingsList.add(thing5);
		Things thing6 = new Things("派件6", 5, 9);
		thingsList.add(thing6);
		Things thing7 = new Things("派件7", 6, 10);
		thingsList.add(thing7);
		/*** 给所有派件按结束时间递增排好序 ***/
		System.out.print("排序前：");
		for (Things t : thingsList) {
			System.out.print(t.getName() + ":" + t.getStartTime() + "-"
					+ t.getEndTime() + ",");
		}
		Sort.sortByEndTime(thingsList, 0, thingsList.size() - 1);
		System.out.print("\r\n排序后：");
		for (Things t : thingsList) {
			System.out.print(t.getName() + ":" + t.getStartTime() + "-"
					+ t.getEndTime() + ",");
		}

		greedySelect(thingsList); // 进行贪心算法
		System.out.println("\r\n最少需要" + cars.size() + "辆车");
		int i = 1;
		for (Car car : cars) {
			System.out.println("第" + i + "辆车装的派件有:");
			for (Things t : car.getThingsList()) {
				System.out.print(t.getName() + ",");
			}
			System.out.println("\r\n");
			i++;
		}
	}

}
