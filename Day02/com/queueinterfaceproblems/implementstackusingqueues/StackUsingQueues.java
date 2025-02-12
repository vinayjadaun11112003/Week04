package com.queueinterfaceproblems.implementstackusingqueues;
import java.util.*;

//Class to implement a stack using two queues.

public class StackUsingQueues {
	private Queue<Integer> queue1;
	private Queue<Integer> queue2;

	// Constructor to initialize the queues
	public StackUsingQueues() {
		queue1 = new LinkedList<>();
		queue2 = new LinkedList<>();
	}

// Pushes an element onto the stack.

	public void push(int data) {
		queue1.add(data);
	}

    // Removes and returns the top element from the stack.

	public int pop() {
		while (queue1.size() > 1) {
			queue2.add(queue1.remove());
		}
		int popped = queue1.remove();
		Queue<Integer> temp = queue1;
		queue1 = queue2;
		queue2 = temp;
		return popped;
	}
}