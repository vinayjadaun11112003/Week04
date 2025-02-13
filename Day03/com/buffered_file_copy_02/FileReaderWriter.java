package Day03.com.buffered_file_copy_02;

import java.io.*;
import java.util.Arrays;
//FileReaderWriter --> This class is created for the copy file without buffer and with buffer.
class FileReaderWriter {
    //Method to copy file without using bytes buffer.
    public void copyFile(String sourceFile, String destinationFile) {
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

    //Method to copy files with the use of bytes buffer.
    public void copyFileBuffered(String sourceFile, String destinationFile) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile))) {

            byte[] buffer = new byte[4096];
            System.out.println(Arrays.toString(buffer));
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("Buffered file copy completed.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Source file not found.");
        } catch (IOException e) {
            System.out.println("Error: An IO exception occurred.");
            e.printStackTrace();
        }
    }
}