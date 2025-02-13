package Day03.com.pipestream_08;
import java.io.*;
//PipedReaderThread extending thread class
class PipedReaderThread extends Thread {
    private PipedInputStream pipedInputStream;

    public PipedReaderThread(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    //Thread method
    @Override
    public void run() {
        try {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = pipedInputStream.read(buffer)) != -1) {
                System.out.println("Reader thread: Data received: " + new String(buffer, 0, bytesRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
