import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main { 
    /*
Given two strings, string and pattern, the task is to find the smallest substring in string containing all characters of pattern.

Examples:

Input: string = “this is a test string”, pattern = “tist”
Output: “t stri”
Explanation: “t stri” contains all the characters of pattern.


Input: string = “geeksforgeeks”, pattern = “ork”
Output: “ksfor”

when nothing is found
return empty or null
*/
    public static void main(String[] args) {
        String inputString = "this is a test string";
        String pattern = "tist";
        StringBuilder strArray = new StringBuilder(inputString);
        StringBuilder strPattern = new StringBuilder(pattern);
        int first = 0;
        int last = 0;
        int size = 0;//last - fist

        System.out.println(checkPattern(inputString,pattern));
        /*for(int cursor = 0;cursor < strArray.length();cursor++){
            for(int subCursor =0; subCursor < strPattern.length();subCursor++){
                if(strArray.charAt(cursor) == strPattern.charAt(subCursor)){
                    if(first == 0){
                        first = cursor;
                    }
                }
                if(strArray.charAt(cursor) == strPattern.charAt(t)){
                    first = cursor;
                }
            }
        }*/
        //return "";

    }

    public static boolean checkPattern(String input, String pattern){
        StringBuilder strArray = new StringBuilder(input);
        StringBuilder strPattern = new StringBuilder(pattern);
        int position = 0;
        for(int cursor = 0;cursor < input.length();cursor++){
            if(strArray.charAt(cursor) == strPattern.charAt(position)){
                if(position < strPattern.length())
                    position++;
                if(position == strPattern.length()){
                    return true;
                }
            }
        }
        return false;
    }
}
