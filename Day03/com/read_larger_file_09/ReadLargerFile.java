package Day03.com.read_larger_file_09;

import java.io.*;
import java.nio.file.*;
//ReadLargerFile --> This class is created to read large file data.
public class ReadLargerFile {

    //Main method to control the flow of code.
    public static void main(String[] args) {
        String filePath = "C:\\Users\\HP\\Documents\\Capgemini\\CG-Training\\Week04\\Day03\\com\\filter_streamLowerCase_06_Files\\source.txt";  // Specify the path to your large file

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
