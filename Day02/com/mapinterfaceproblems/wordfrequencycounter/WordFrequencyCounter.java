package com.mapinterfaceproblems.wordfrequencycounter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

//Class to count the frequency of each word in a text file.

public class WordFrequencyCounter {

	// Method to count word occurrences from a given text file.

	public static HashMap<String, Integer> countWordFrequency(String filePath) throws IOException {

		// Creating a HashMap to store words and their frequency
		HashMap<String, Integer> wordCountMap = new HashMap<>();

		// Creating a BufferedReader to read the file
		BufferedReader reader = new BufferedReader(new FileReader(filePath));

		// Variable to hold each line from the file
		String line;

		// Reading the file line by line
		while ((line = reader.readLine()) != null) {

			// Removing punctuation and converting to lowercase
			line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();

			// Splitting the line into words based on spaces
			String[] words = line.split("\\s+");

			// Iterating through each word in the line
			for (String word : words) {

				// Checking if the word is already in the map, updating its count, else adding with count 1
				wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
			}
		}

		// Closing the reader to free resources
		reader.close();

		// Returning the HashMap containing word frequencies
		return wordCountMap;
	}
}