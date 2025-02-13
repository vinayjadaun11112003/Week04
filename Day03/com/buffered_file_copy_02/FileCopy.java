package Day03.com.buffered_file_copy_02;
//FileCopy --> This class is created for copying with or without buffered file.
public class FileCopy {
    //Main method to control the execution of the program
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\HP\\Documents\\Capgemini\\CG-Training\\Week04\\Day03\\com\\buffer_file_copy_02_files\\source.txt";
        String destinationFile = "C:\\Users\\HP\\Documents\\Capgemini\\CG-Training\\Week04\\Day03\\com\\buffer_file_copy_02_files\\buffereddestination.txt";
        String bufferedDestinationFile = "C:\\Users\\HP\\Documents\\Capgemini\\CG-Training\\Week04\\Day03\\com\\buffer_file_copy_02_files\\unbuffereddestination.txt";

        FileReaderWriter fileReaderWriter = new FileReaderWriter();

        long startTime = System.nanoTime();
        fileReaderWriter.copyFile(sourceFile, destinationFile);
        long endTime = System.nanoTime();
        System.out.println("Unbuffered copy time: " + (endTime - startTime) / 1_000_000 + " ms");

        startTime = System.nanoTime();
        fileReaderWriter.copyFileBuffered(sourceFile, bufferedDestinationFile);
        endTime = System.nanoTime();
        System.out.println("Buffered copy time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}

