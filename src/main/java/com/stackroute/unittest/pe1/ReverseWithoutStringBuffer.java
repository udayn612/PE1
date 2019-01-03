package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class ReverseWithoutStringBuffer {


    public String reversestring(String str1)
    {
        String str2 = "";

        for (int i=str1.length()-1; i>=0; i--) {
            str2 += str1.charAt(i);
        }
        return str2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str=sc.next();

        ReverseWithoutStringBuffer qs= new ReverseWithoutStringBuffer();

        System.out.println(qs.reversestring(str));

    }

}


