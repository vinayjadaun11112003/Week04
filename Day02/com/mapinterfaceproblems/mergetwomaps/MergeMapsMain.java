package com.mapinterfaceproblems.mergetwomaps;

import java.util.HashMap;

//Class to test the MergeMaps functionality.

public class MergeMapsMain {

	// Main method to merge two maps and display the result.

	public static void main(String[] args) {

		// Creating first sample HashMap
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("A", 1);
		map1.put("B", 2);

		// Creating second sample HashMap
		HashMap<String, Integer> map2 = new HashMap<>();
		map2.put("B", 3);
		map2.put("C", 4);

		// Calling the merge method and storing the result
		HashMap<String, Integer> mergedResult = MergeMaps.merge(map1, map2);

		// Printing the merged HashMap
		System.out.println(mergedResult);
	}
}
