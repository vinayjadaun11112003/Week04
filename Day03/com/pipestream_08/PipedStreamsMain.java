package Day03.com.pipestream_08;

import java.io.*;
//PipedStreamsMain to control the execution.
public class PipedStreamsMain {
    public static void main(String[] args) {
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream();

        try {
            pipedOutputStream.connect(pipedInputStream);

            // Create and start the writer and reader threads
            Thread writerThread = new PipedWriterThread(pipedOutputStream);
            Thread readerThread = new PipedReaderThread(pipedInputStream);

            writerThread.start();
            readerThread.start();

            // Wait for threads to finish
            writerThread.join();
            readerThread.join();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
