package com.extract_programming_language_name_12;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//ExtractProgrammingName --> This class is created for the extraction of programming langauge name from the string.
public class ExtractProgrammingName {

    //Color string to give colors to the string.
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    //method which return the arraylist of type string after the extraction of programming language name from the string.
    public static ArrayList<String> extract(String regex, String input){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        ArrayList<String> st = new ArrayList<>();
        while(matcher.find()){
            st.add(matcher.group());
        }
        return st;

    }

    //Main method to control the flow of code.
    public static void main(String[] args){
        boolean flag = true;
        String regex = "java|python|c\\+\\+";
        System.out.println(ANSI_CYAN+"EXTRACT PROGRAMMING LANGUAGE NAME SYSTEM(if you want to exit the program type 'exit')"+ANSI_RESET);
        while(flag) {
            Scanner input = new Scanner(System.in);
            System.out.print(ANSI_WHITE+"Enter the String : "+ANSI_RESET);
            String userInput = input.nextLine();
            if(userInput.equals("exit")){
                flag = false;
                System.out.println(ANSI_WHITE+"Exiting the program..."+ANSI_RESET);
            }else{
                ArrayList<String> ans = extract(regex,userInput);
                for(String a : ans){
                    System.out.println(ANSI_CYAN+a+ANSI_RESET);
                }
            }
        }

    }
}


