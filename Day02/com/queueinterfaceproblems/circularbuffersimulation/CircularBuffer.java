package com.queueinterfaceproblems.circularbuffersimulation;

   //Class to implement a circular buffer (fixed-size queue) using an array.

public class CircularBuffer {

	// Array to store buffer elements

	private int[] buffer;


	private int capacity;

	//Points to the front element in the buffer

	private int front;

	//Points to the rear position where a new element will be inserted

	private int rear;

    // Current number of elements in the buffer

	private int size;

	//Constructor to initialize the circular buffer with a fixed size.

	public CircularBuffer(int capacity) {
		this.capacity = capacity;
		this.buffer = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

//If the buffer is full, it overwrites the oldest element.

	public void insert(int value) {
		rear = (rear + 1) % capacity;

		buffer[rear] = value;

		if (size < capacity) {
			size++;
		} else {
			front = (front + 1) % capacity;
		}
	}

    //Retrieves all elements from the buffer in their current order.

	public int[] getBuffer() {
		int[] result = new int[size];

		int index = front;

		for (int i = 0; i < size; i++) {
			result[i] = buffer[index];

			index = (index + 1) % capacity;
		}

		return result;
	}
}

