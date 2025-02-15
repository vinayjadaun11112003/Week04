package com.get_repeating_values_14;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//ExtractRepeatingWord --> The class is created for the removal of repeating word in a string.
public class ExtractRepeatingWord {

    //Color set of java to add color in the string.
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    //method which return arraylist of string type of repeating word in a input string.
    public static ArrayList<String> extract(String regex, String input){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        ArrayList<String> st = new ArrayList<>();
        Map<String,Integer> hp = new HashMap<>();
        while(matcher.find()){
            hp.put(matcher.group(), hp.getOrDefault(matcher.group(),0)+1);
        }
        for(Map.Entry<String,Integer> entry : hp.entrySet()){
            if(entry.getValue()>1){
                st.add(entry.getKey());
            }
        }
        return st;

    }
    //Main method to control the flow of program.
    public static void main(String[] args){
        boolean flag = true;
        String regex = "\\b\\w+\\b";
        System.out.println(ANSI_CYAN+"EXTRACT EMAIL FROM STRING SYSTEM(if you want to exit the program type 'exit')"+ANSI_RESET);
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

