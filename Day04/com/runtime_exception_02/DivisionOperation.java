package com.runtime_exception_02;
import java.io.*;
import java.util.InputMismatchException;

//DivisionOperation --> This class is created for the checking of run time exception.
public class DivisionOperation {
    //Method to perform division and if any exception exist it will display message.
    public static void division(){
        try{
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Please Enter First Number : ");
            String a = bf.readLine();
            System.out.print("Please Enter Second Number : ");
            String b = bf.readLine();
            int c;
            int d;
            try{
                c = Integer.parseInt(a);
                d = Integer.parseInt(b);
            }catch(Exception e){
                throw new InputMismatchException("InputMismatchException Exception... Please Enter valid Input");
            }
            if(d==0) throw new ArithmeticException("ArithmeticException Exception... Please Enter valid value to perform Division");
            System.out.println("Division value : " + c/d);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println("Input/Output exception occurred");
        }catch(InputMismatchException e) {
            System.out.println(e.getMessage());
        }

    }
    //Main method to control the flow of code.
    public static void main(String[] args){
        //Calling division static method to check Run-Time Exception
        System.out.println("Run Time Exception Program");
        DivisionOperation.division();
    }

}
