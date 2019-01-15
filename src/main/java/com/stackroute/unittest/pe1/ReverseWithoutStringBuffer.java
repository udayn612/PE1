package com.stackroute.unittest.pe1;

import java.util.Scanner;

/*
Write a program to reverse any string without using String Buffer.
Input : london
Output : nodnol
 */

public class ReverseWithoutStringBuffer {


    public String reverseString(String str1)
    {
        String str2 = "";

        for (int i=str1.length()-1; i>=0; i--) {
            str2 += str1.charAt(i);
        }
        return str2;
    }
}


