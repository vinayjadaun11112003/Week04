package Day03.com.data_stream_conversion_07;
import java.io.*;
//DataStreamsStudent --> This class is created for the purpose of converting and reconverting, java object to the data stream and back to the java object.
public class DataStreamsStudent {
    //Final path of the file
    private static final String FILE_NAME = "C:\\Users\\HP\\Documents\\Capgemini\\CG-Training\\Week04\\Day03\\com\\data_stream_conversion_07_files\\datastreamoutput.txt";

    //Method to write the object data to file.
    public static void writeStudentData(Student student) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            dos.writeInt(student.rollNumber);
            dos.writeUTF(student.name);
            dos.writeFloat(student.gpa);
            System.out.println("Student data written successfully.");
        } catch (IOException e) {
            System.out.println("Error: IOException occurred while writing student data.");
            e.printStackTrace();
        }
    }

    //Method to read the data from the file.
    public static void readStudentData() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            float gpa = dis.readFloat();
            System.out.println("Retrieved Student Data: ");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        } catch (IOException e) {
            System.out.println("Error: IOException occurred while reading student data.");
            e.printStackTrace();
        }
    }

    //Main method to control the flow of code.
    public static void main(String[] args) {
        Student student = new Student(101, "vinay jadaun", 3.8f);
        writeStudentData(student);
        readStudentData();
    }
}
