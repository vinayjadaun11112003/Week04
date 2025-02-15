package com.replace_badwords_with_star_09;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//ReplaceBadWords --> This class is created for the replacement of the bad word from the string.
public class ReplaceBadWords {

    //color string to give color to the string.
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    //method which return the string after replacing the word.
    public static String replace(String userInput,String regex, String replacement){
        return userInput.replaceAll(regex,replacement);
    }

    //Main method to control the flow of code.
    public static void main(String[] args){
        boolean flag = true;
        String regex = "damn|stupid";
        System.out.println(ANSI_CYAN+"REMOVE BAD WORD FROM STRING SYSTEM(if you want to exit the program type 'exit')"+ANSI_RESET);
        while(flag) {
            Scanner input = new Scanner(System.in);
            System.out.print(ANSI_WHITE+"Enter the String : "+ANSI_RESET);
            String userInput = input.nextLine();
            if(userInput.equals("exit")){
                flag = false;
                System.out.println(ANSI_WHITE+"Exiting the program..."+ANSI_RESET);
            }else{
                System.out.print("Replaced with single space String : ");
                System.out.println(ANSI_GREEN+replace(userInput,regex,"*****")+ANSI_RESET);
            }
        }

    }
}



