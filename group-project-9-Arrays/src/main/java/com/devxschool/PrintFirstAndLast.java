package com.devxschool;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstAndLast {
    public static void main(String[] args) {
        /**
         * Given an array of String, iterate through each word
         * Print first and last letters of each element in a separate line
         */

        Scanner scanner = new Scanner(System.in);
        String[] words = {scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};

        printLetters(words);
    }

    public static void printLetters(String[] words) {
        //TODO IMPLEMENT THIS METHOD
        String start;
        String end;
        for(int i = 0; i < words.length;i++){
            start = words[i].substring(0, 1);
            end = words[i].substring(words[i].length()-1);
            System.out.println(start);
            System.out.println(end);

        }

    }
}
