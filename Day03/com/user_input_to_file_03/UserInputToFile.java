package Day03.com.user_input_to_file_03;

import java.io.*;
//UserInputToFile --> This Class is created for the use of to store data input by the user to the file.
public class UserInputToFile {
    //Main method to control the flow of code.
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("C:\\Users\\HP\\Documents\\Capgemini\\CG-Training\\Week04\\Day03\\com\\user_input_file_03_file\\userinputfile_03.txt")) {

            System.out.print("Enter your name: ");
            String name = reader.readLine();
            System.out.print("Enter your age: ");
            String age = reader.readLine();
            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");

            System.out.println("User data saved successfully to user_data.txt.");
        } catch (IOException e) {
            System.out.println("Error: An IO exception occurred while reading input or writing to file.");
            e.printStackTrace();
        }
    }
}

