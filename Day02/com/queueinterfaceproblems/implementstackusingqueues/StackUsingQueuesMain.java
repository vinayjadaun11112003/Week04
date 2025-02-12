package com.queueinterfaceproblems.implementstackusingqueues;

public class StackUsingQueuesMain {

	public static void main(String[] args) {
		StackUsingQueues stack = new StackUsingQueues();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println("Popped: " + stack.pop()); // Expected output: 3
	}
}
