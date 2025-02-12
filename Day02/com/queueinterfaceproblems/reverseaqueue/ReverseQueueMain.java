package com.queueinterfaceproblems.reverseaqueue;

import java.util.*;

public class ReverseQueueMain {

	public static void main(String[] args) {
		// Create a queue and add elements
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);

		// Reverse the queue
		Queue<Integer> reversedQueue = ReverseQueue.reverse(queue);

		// Print the reversed queue
		System.out.println("Reversed Queue: " + reversedQueue); // Expected output: [30, 20, 10]
	}
}
