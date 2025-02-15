package com.validate_ssn_number_15;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//ValidateSSN --> This class is created for the validation of SSN.
public class ValidateSSN {
    //color string to give the color string.
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    //method which return bool after the validation of SSN.
    public static boolean check(String regex,String input){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean match = matcher.find();
        return match;
    }

    //Main method to control the flow of code.
    public static void main(String[] args){
        boolean flag = true;
        String regex = "[0-9]+{3}-[0-9]+{2}-[0-9]+{4}";
        System.out.println(ANSI_CYAN+"SSN NUMBER VALIDATION SYSTEM(if you want to exit the program type 'exit')"+ANSI_RESET);
        while(flag) {
            Scanner input = new Scanner(System.in);
            System.out.print(ANSI_WHITE+"Enter the SSN NUMBER : "+ANSI_RESET);
            String userInput = input.nextLine();
            if(userInput.equals("exit")){
                flag = false;
                System.out.println(ANSI_WHITE+"Exiting the program..."+ANSI_RESET);
            }else{
                if(check(regex,userInput)){
                    System.out.println(ANSI_GREEN+"VALID SSN NUMBER"+ANSI_RESET);
                }else{
                    System.out.println(ANSI_RED+"NOT A VALID SSN NUMBER"+ANSI_RESET);
                }

            }
        }

    }
}

