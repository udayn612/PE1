package com.stackroute.unittest.pe1;


import java.util.Scanner;

/*
Write a program that takes a character from the user as input and determines whether the character entered is a capital letter, a small case letter, a digit or a special symbol and display appropriately.
Input:  A
Output:  Capital letter
 */

public class CapitalSmallDigitSpecial {

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

    }
