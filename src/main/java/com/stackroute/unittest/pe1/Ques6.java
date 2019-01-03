package com.stackroute.unittest.pe1;


import java.util.Scanner;

public class Ques6 {

    public String check(char c) {
        if (Character.isUpperCase(c)) {
            return "Capital letter";
        } else if (Character.isLowerCase(c)) {
            return "Lower case letter";
        } else if (Character.isDigit(c)) {
           return "Digit";
        } else {
            return "Special Character";
        }
    }



        public static void main(String args[])
        {
            System.out.println("Enter the character you want to check");
            Scanner ob =new Scanner(System.in);
            char c=ob.next().charAt(0);
            Ques6 qs=new Ques6();
            System.out.println(qs.check(c));
        }

    }
