package santhiya.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(9);
		list.add(4);
		System.out.println(list);
		System.out.println(santhiyatest(list));
	}

	static List<Integer> santhiyatest(List<Integer> list) {
		Collections.sort(list);
		Collections.reverse(list);
		//System.out.println(list);
		if (list.size()==1) {
			return list;
		}
		int diff = list.get(0) - list.get(1);
		if (diff < 0) {
			diff = diff * -1;
		}
		if (diff == 0) {
			return santhiyatest(list.subList(2, list.size()));
		}

		if (diff > 0) {
			ArrayList<Integer> newList = new ArrayList<>();
			newList.add(diff);
			newList.addAll(list.subList(2, list.size()));
			Collections.sort(newList);
			Collections.reverse(newList);
			return santhiyatest(newList);
		}
		
		return null;
	}
}
