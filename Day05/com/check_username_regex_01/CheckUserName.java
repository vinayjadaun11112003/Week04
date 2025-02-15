package com.check_username_regex_01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckUserName {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static boolean check(String regex,String input){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean match = matcher.find();
        return match;
    }
    public static void main(String[] args){
        boolean flag = true;
        String regex = "^[a-zA-Z]+_[0-9]+{5,15}$";
        System.out.println(ANSI_CYAN+"USER NAME VALIDATION SYSTEM(if you want to exit the program type 'exit')"+ANSI_RESET);
        while(flag) {
            Scanner input = new Scanner(System.in);
            System.out.print(ANSI_WHITE+"Enter the User Name : "+ANSI_RESET);
            String userInput = input.nextLine();
            if(userInput.equals("exit")){
                flag = false;
                System.out.println(ANSI_WHITE+"Exiting the program..."+ANSI_RESET);
            }else{
                if(check(regex,userInput)){
                        System.out.println(ANSI_GREEN+"VALID USER NAME"+ANSI_RESET);
                }else{
                    System.out.println(ANSI_RED+"NOT A VALID USER NAME"+ANSI_RESET);
                }

            }
        }

    }
}
