package com.mapinterfaceproblems.invertamap;

import java.util.HashMap;
import java.util.List;
public class InvertMapMain {


	//Class to test the InvertMap functionality.

		public static void main(String[] args) {

			// Creating a sample HashMap with Key-Value pairs
			HashMap<String, Integer> sampleMap = new HashMap<>();
			sampleMap.put("A", 1);
			sampleMap.put("B", 2);
			sampleMap.put("C", 1);

			// Calling the invert method and storing the result
			HashMap<Integer, List<String>> inverted = InvertMap.invert(sampleMap);

			// Printing the inverted map
			System.out.println(inverted);
		}
	}

