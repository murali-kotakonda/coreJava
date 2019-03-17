package ds.collections.HashMapEx2;

import java.util.ArrayList;

import java.util.Collections;

import java.util.HashMap;

import java.util.HashSet;

import java.util.List;

import java.util.Map;

import java.util.Scanner;

import java.util.Set;

import java.util.TreeMap;

class WordCount2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("apple");
		list.add("ball");
		list.add("cat");
		list.add("dog");
		list.add("ball");
		list.add("cat");
		list.add("apple");
		list.add("apple");
		list.add("apple");
		System.out.println("\nExample 2 - Count all with frequency");
		Set<String> uniqueSet = new HashSet<String>(list);
		for (String temp : uniqueSet) {
			System.out.println(temp + ": " + Collections.frequency(list, temp));
		}

		System.out.println("\nExample 3 - Count all with Map");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String temp : list) {

			Integer count = map.get(temp);

			map.put(temp, (count == null) ? 1 : count + 1);

		}

		printMap(map);

		System.out.println("\nSorted Map");

		Map<String, Integer> treeMap = new TreeMap<String, Integer>(map);

		printMap(treeMap);
	}

	public static void printMap(Map<String, Integer> map) {

		for (Map.Entry<String, Integer> entry : map.entrySet()) {

			System.out.println("Key : " + entry.getKey() + " -Value : "

			+ entry.getValue());

		}

	}

}
