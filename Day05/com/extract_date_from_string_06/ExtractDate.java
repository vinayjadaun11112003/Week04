package com.extract_date_from_string_06;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//ExtractDate --> This method is created for the extraction of dates from the strings.
public class ExtractDate {
    //color string to give color to the strings.
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    //method which return arraylist of type string after extraction of dates from the string.
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
        String regex = "[0-9]+{2}/[0-9]+{2}/[0-9]+{2}";
        System.out.println(ANSI_CYAN+"EXTRACT DATE FROM STRING SYSTEM(if you want to exit the program type 'exit')"+ANSI_RESET);
        while(flag) {
            Scanner input = new Scanner(System.in);
            System.out.print(ANSI_WHITE+"Enter the String Containing Date : "+ANSI_RESET);
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



