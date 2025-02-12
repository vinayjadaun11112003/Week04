package com.mapinterfaceproblems.wordfrequencycounter;

import java.io.IOException;
import java.util.HashMap;

//Class to test the WordFrequencyCounter.

public class WordFrequencyCounterMain {

// Main method to execute the word frequency counter.

	public static void main(String[] args) {

		// Defining the path of the text file to be processed
		String filePath = "sample.txt"; // Replace with actual file path

		try {
			// Calling the countWordFrequency method and storing the result in a HashMap
			HashMap<String, Integer> wordFrequency = WordFrequencyCounter.countWordFrequency(filePath);

			// Printing the word frequency map
			System.out.println(wordFrequency);

		} catch (IOException e) {
			// Handling exceptions if file reading fails
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}

