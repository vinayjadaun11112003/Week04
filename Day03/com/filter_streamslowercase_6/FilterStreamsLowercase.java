package Day03.com.filter_streamslowercase_6;

import java.io.*;
//FilterStreamsLowercase --> This class is created for the conversion of the source file.
public class FilterStreamsLowercase {
    //Main method to control the flow of control.
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\HP\\Documents\\Capgemini\\CG-Training\\Week04\\Day03\\com\\filter_streamLowerCase_06_Files\\source.txt";
        String outputFile = "C:\\Users\\HP\\Documents\\Capgemini\\CG-Training\\Week04\\Day03\\com\\filter_streamLowerCase_06_Files\\destination.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            System.out.println("File successfully converted to lowercase and written to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error: An IO exception occurred.");
            e.printStackTrace();
        }
    }
}
