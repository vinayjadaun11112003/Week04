package com.setinterfaceproblems.findsubsets;
import java.util.*;

public class FindSubsetsMain {

	public static void main(String[] args) {
		// Create two sets for subset checking
		Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

		// Check if set1 is a subset of set2
		boolean result = FindSubsets.isSubset(set1, set2);

		// Print the result
		System.out.println("Is set1 a subset of set2? " + result); // Expected output: true
	}
}
