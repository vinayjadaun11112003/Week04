package Day03.com.serialization_04;
import java.util.*;
import java.io.*;
//EmployeeSerialization --> This class created for the serialization and deserialization purpose.
public class EmployeeSerialization {
    private static final String FILE_NAME = "C:\\Users\\HP\\Documents\\Capgemini\\CG-Training\\Week04\\Day03\\com\\serialization_04_files\\ser.txt";

    //Method to convert java object to byte streams
    public static void serializeEmployees(List<Employee> employees) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("Employees serialized successfully.");
        } catch (IOException e) {
            System.out.println("Error: IOException occurred during serialization.");
            e.printStackTrace();
        }
    }

    //converting the byte stream to the java objects.
    public static List<Employee> deserializeEmployees() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Employee>) ois.readObject();
        } catch (IOException e) {
            System.out.println("Error: IOException occurred during deserialization.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Error: ClassNotFoundException occurred during deserialization.");
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    //Main method to control the flow of execution.
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "HR", 50000));
        employees.add(new Employee(2, "Bob", "IT", 60000));
        employees.add(new Employee(3, "Charlie", "Finance", 70000));

        serializeEmployees(employees);

        List<Employee> deserializedEmployees = deserializeEmployees();
        System.out.println("Deserialized Employees:");
        for (Employee emp : deserializedEmployees) {
            System.out.println(emp);
        }
    }
}