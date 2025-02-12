package com.queueinterfaceproblems.generatebinarynumbersusingqueue;

import java.util.*;

public class BinaryNumbersQueueMain {

	public static void main(String[] args) {
		// Number of binary numbers to generate
		int n = 5;

		// Generate binary numbers
		List<String> binaryNumbers = BinaryNumbersQueue.generateBinaryNumbers(n);

		// Print the generated binary numbers
		System.out.println("Binary Numbers: " + binaryNumbers); // Expected output: ["1", "10", "11", "100", "101"]
	}
}
