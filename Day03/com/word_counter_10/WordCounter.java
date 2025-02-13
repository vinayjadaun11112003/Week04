package Day03.com.word_counter_10;
import java.io.*;
import java.nio.file.*;
import java.util.*;
//WordCounter --> This class is made for counting word in the files
public class WordCounter {
    //Main method to control the execution of the program.
    public static void main(String[] args) {
        //filepath
        String filePath = "C:\\Users\\HP\\Documents\\Capgemini\\CG-Training\\Week04\\Day03\\com\\word_counter_10_file\\exampleforwordcounter.txt";

        //wordcounter map to store count of each word
        Map<String, Integer> wordCountMap = new HashMap<>();

        //creating bufferReader for reading the file
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words based on non-word characters
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.toLowerCase();  // Convert to lowercase for case-insensitive counting
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            //Sorting the words by frequency in descending order
            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
            sortedWords.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

            //Displaying the top 5 most frequent words
            System.out.println("Top 5 most frequent words:");
            int count = 0;
            for (Map.Entry<String, Integer> entry : sortedWords) {
                if (count >= 5) break;
                System.out.println(entry.getKey() + ": " + entry.getValue());
                count++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

