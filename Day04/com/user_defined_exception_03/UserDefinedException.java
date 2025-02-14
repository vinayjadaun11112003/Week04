package com.user_defined_exception_03;
import java.util.Scanner;
//InvalidAgeException --> Custum Exception Class extending Exception.
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

//UserDefinedException --> Created for checking the age and if invalid it will throw user defined exception.
public class UserDefinedException {
    public static void validateAge(int age){
        try{
            if(age<18) throw new InvalidAgeException("Invalid Age Exception Occurred.. Kindly check the age before entering ");
            else {
                System.out.println("Access Granted");
            }
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }

    //Main method to control the flow of code.
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Age : ");
        int age = input.nextInt();
        UserDefinedException.validateAge(age);
    }

}
