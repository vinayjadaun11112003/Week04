package com.try_with_resources_05;
import java.io.*;
//TryWithResources --> This class is made for trying reading a file without closing by the use of Try-With-Resources.
public class TryWithResources {
    //Method to read file without closing the resources
    public static void readFile(){
        String filepath = "C:\\Users\\HP\\Documents\\Capgemini\\CG-Training\\Week04\\Day04\\com\\compile_time_exception_files_01\\data.txt.txt";
         try(BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(filepath)))){
             int line;
             byte[] arr;
             while((line=bf.read())!=-1){
                 System.out.print((char)line);
             }
         }catch(IOException e){
             System.out.println("Error Reading File");
         }
    }
    //Main method to control the flow of code.
    public static void main(String[] args){
        //Calling readFile method to read file without closing the resources
        TryWithResources.readFile();
    }

}
