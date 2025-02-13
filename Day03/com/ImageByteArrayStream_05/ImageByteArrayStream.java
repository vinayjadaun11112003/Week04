package Day03.com.ImageByteArrayStream_05;

import java.io.*;
import java.nio.file.Files;
//ImageByteArrayStream --> This class is created for the copy of one jpt to other location.
public class ImageByteArrayStream {
    //Main method to control the execution of the program.
    public static void main(String[] args) {
        String inputImagePath = "C:\\Users\\HP\\Documents\\Capgemini\\CG-Training\\Week04\\Day03\\com\\imageByteArrayStream_05_files\\source.jpg";
        String outputImagePath = "C:\\Users\\HP\\Documents\\Capgemini\\CG-Training\\Week04\\Day03\\com\\imageByteArrayStream_05_files\\output.jpg";

        try {
            // Read image file into a byte array
            byte[] imageBytes = Files.readAllBytes(new File(inputImagePath).toPath());

            // Convert byte array to image file
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            // Write output image file
            Files.write(new File(outputImagePath).toPath(), baos.toByteArray());

            System.out.println("Image successfully converted to byte array and written back to file.");
        } catch (IOException e) {
            System.out.println("Error: An IO exception occurred.");
            e.printStackTrace();
        }
    }
}
