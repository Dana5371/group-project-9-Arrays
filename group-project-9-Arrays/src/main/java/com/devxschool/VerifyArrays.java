package com.devxschool;

import java.util.Objects;
import java.util.Scanner;

public class VerifyArrays {
    public static void main(String[] args) {
        /**
         * Write a program that checks if the given two arrays are equal
         *
         * Values and indexes must match.
         * must be case-sensitive
         *
         * EX:
         * String[] arr1 = new String[]{"A", "B", "C"};
         * String[] arr2 = new String[]{"A", "B", "C"}
         *
         * true
         *
         * EX2:
         * String[] arr2 = new String[]{"A", "B", "C"};
         * String[] arr3 = new String[]{"B", "B", "A"};
         *
         * false
         */
        Scanner sc = new Scanner(System.in);
        String str1[] = {sc.nextLine(), sc.nextLine(), sc.nextLine()};
        String str2[] = {sc.nextLine(), sc.nextLine(), sc.nextLine()};

        //TODO WRITE YOUR CODE HERE
        System.out.println(areEqual(str1, str2));

    }

    public static boolean areEqual(String[] arr1, String[] arr2) {
        //TODO IMPLEMENT THIS METHOD
        int res = 0;
        for (int i = 0, j = 0; i < arr1.length && j < arr2.length; i++, j++){
            if(Objects.equals(arr1[i], arr2[j])){
                res+=1;
            }else {
                res = res;
            }
        }
            if(res >= 3 ){
                return true;
            }
            return false;
    }
}
