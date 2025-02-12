package com.queueinterfaceproblems.generatebinarynumbersusingqueue;
import java.util.*;

//Class to generate the first N binary numbers using a queue.

public class BinaryNumbersQueue {

// Generates the first N binary numbers.

	public static List<String> generateBinaryNumbers(int n) {
		// Create a queue to store binary numbers
		Queue<String> queue = new LinkedList<>();

		// Create a list to store the results
		List<String> binaryNumbers = new ArrayList<>();

		// Add the first binary number
		queue.add("1");

		// Generate binary numbers up to N
		for (int i = 0; i < n; i++) {
			// Remove the front element from the queue
			String current = queue.remove();

			// Add it to the result list
			binaryNumbers.add(current);

			// Generate the next two binary numbers and add them to the queue
			queue.add(current + "0");
			queue.add(current + "1");
		}

		// Return the generated binary numbers
		return binaryNumbers;
	}
}