package com.validate_credit_card_number_11;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//ValidateCreditCard --> This class is created for the validation of credit card.
public class ValidateCreditCard {
    //color string to give colors to the string.
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    //method which return bool after the validation of credit card.
    public static boolean check(String regex,String input){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean match = matcher.find();
        return match;
    }

    //Main method to control the flow of code.
    public static void main(String[] args){
        boolean flag = true;
        String regex = "^4[0-9]+{15}$";
        String regex2 = "^5[0-9]+{15}$";
        System.out.println(ANSI_CYAN+"CREDIT CARD VALIDATION SYSTEM(if you want to exit the program type 'exit')"+ANSI_RESET);
        while(flag) {
            Scanner input = new Scanner(System.in);
            System.out.print(ANSI_WHITE+"Enter the CREDIT CARD NUMBER : "+ANSI_RESET);
            String userInput = input.nextLine();
            if(userInput.equals("exit")){
                flag = false;
                System.out.println(ANSI_WHITE+"Exiting the program..."+ANSI_RESET);
            }else{
                if(check(regex,userInput)){
                    System.out.println(ANSI_GREEN+"VALID VISA CREDIT CARD"+ANSI_RESET);
                }
                else if(check(regex2,userInput)){
                    System.out.println(ANSI_GREEN+"VALID MASTERCARD CREDIT CARD"+ANSI_RESET);
                }
                else{
                    System.out.println(ANSI_RED+"NOT A VALID IP ADDRESS"+ANSI_RESET);
                }

            }
        }

    }
}



