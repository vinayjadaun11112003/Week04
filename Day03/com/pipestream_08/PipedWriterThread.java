package Day03.com.pipestream_08;
import java.io.*;
//PipedWriterThread exteds thread class.
class PipedWriterThread extends Thread {
    private PipedOutputStream pipedOutputStream;

    public PipedWriterThread(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    //overiding thread method.
    @Override
    public void run() {
        try {
            String data = "Hello from the Writer thread!";
            pipedOutputStream.write(data.getBytes());
            pipedOutputStream.flush();
            System.out.println("Writer thread: Data written to pipe.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

