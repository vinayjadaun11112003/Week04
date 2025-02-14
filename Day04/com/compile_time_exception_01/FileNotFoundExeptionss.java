package com.compile_time_exception_01;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//FileNotFoundExeptions --> This class will read a file and if path not exist it will throw and error.
public class FileNotFoundExeptionss extends Throwable {
    //Method to read the file if exist otherwise throw an error.
    public static void checkException(String path){
        try(FileReader fileReader = new FileReader(path)){
            int a;
            while((a=fileReader.read())!=-1){
                System.out.print((char)a);
            }

        }catch(FileNotFoundException e){
            System.out.println("FileNotFoundException Occurred !.. \nKindly check the file path, may be its not exist at the location");
        } catch (IOException e) {
            System.out.println("Input/Output Resource problem found");
        }
    }
    //Main method to control the flow of code.
    public static void main(String[] args){
        //Calling static method to check exception which will read the file if exist other wise throws error.
        FileNotFoundExeptionss.checkException("C:\\Users\\HP\\Document\\Capgemini\\CG-Training\\Week04\\Day04\\com\\compile_time_exception_files_01\\data.txt.txt");
    }

}
