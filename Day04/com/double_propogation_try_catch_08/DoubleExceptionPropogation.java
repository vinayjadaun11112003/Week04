package com.double_propogation_try_catch_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//DoubleExceptionPropogation --> This class is created for the overview of the double method level propogation of the exception.
public class DoubleExceptionPropogation {
    //Method to perform division and if any exception exist it will display message.
    public static void division1() throws ArithmeticException, IOException {

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Please Enter First Number : ");
            String a = bf.readLine();
            System.out.print("Please Enter Second Number : ");
            String b = bf.readLine();
            int c;
            int d;
            c = Integer.parseInt(a);
            d = Integer.parseInt(b);

            if(d==0) throw new ArithmeticException("ArithmeticException Exception... Please Enter valid value to perform Division method 01");
            System.out.println("Division value : " + c/d);


    }

    //Method 02 will acccept the exception from method 01 and throw back to the main method
    public static void division2() throws ArithmeticException{
        try{
            DoubleExceptionPropogation.division1();
        }catch(Exception e){
            System.out.println(e.getMessage());
            throw new ArithmeticException("Arthimatic exception catched in the method 2");
        }
    }

    //Main method will accept the propogated exception here
    public static void main(String[] args){
        System.out.println("METHOD PROPOGATION");
        try{
            DoubleExceptionPropogation.division2();
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Catching the exception in the main method");
        }

    }
}
