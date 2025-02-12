package com.queueinterfaceproblems.circularbuffersimulation;
//Class to test the CircularBuffer implementation.

public class CircularBufferMain {

//Main method to demonstrate CircularBuffer functionality.

	public static void main(String[] args) {
		CircularBuffer circularBuffer = new CircularBuffer(3);

		circularBuffer.insert(1);
		circularBuffer.insert(2);
		circularBuffer.insert(3);
		circularBuffer.insert(4);

		int[] bufferState = circularBuffer.getBuffer();

		for (int num : bufferState) {
			System.out.print(num + " ");
		}
	}
}
