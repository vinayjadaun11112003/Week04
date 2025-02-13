package Day03.com.filecopy_01;

import java.io.*;
//FileCopy --> class to control the execution of code
public class FileCopy {
    //main method to control and copy paste files
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\HP\\Documents\\Capgemini\\CG-Training\\Week04\\Day03\\com\\filecopy_01_files\\source.txt";
        String destinationFile = "C:\\Users\\HP\\Documents\\Capgemini\\CG-Training\\Week04\\Day03\\com\\filecopy_01_files\\destination.txt";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int byteContent;
            while ((byteContent = fis.read()) != -1) {
                fos.write(byteContent);
            }
            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Source file not found.");
        } catch (IOException e) {
            System.out.println("Error: An IO exception occurred.");
            e.printStackTrace();
        }
    }
}

