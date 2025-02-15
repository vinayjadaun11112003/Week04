package com.replace_multiple_space_with_single_space_08;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//ReplaceSpaces --> This class is created for the replacemnt of spaces
public class ReplaceSpaces {
    //color string to give color to the string.
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    //method which return the replaced spaces after replacement.
    public static String replace(String userInput,String regex, String replacement){
         return userInput.replaceAll(regex,replacement);

    }

    //main method to control the flow of code.
    public static void main(String[] args){
        boolean flag = true;
        String regex = " +";
        System.out.println(ANSI_CYAN+"REPLACE SPACES IN STRING SYSTEM(if you want to exit the program type 'exit')"+ANSI_RESET);
        while(flag) {
            Scanner input = new Scanner(System.in);
            System.out.print(ANSI_WHITE+"Enter the String : "+ANSI_RESET);
            String userInput = input.nextLine();
            if(userInput.equals("exit")){
                flag = false;
                System.out.println(ANSI_WHITE+"Exiting the program..."+ANSI_RESET);
            }else{
                System.out.print("Replaced with single space String : ");
                System.out.println(ANSI_GREEN+replace(userInput,regex," ")+ANSI_RESET);
            }
        }

    }
}


