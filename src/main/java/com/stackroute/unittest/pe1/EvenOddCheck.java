package com.stackroute.unittest.pe1;


import java.util.Scanner;


/*
Write a program which accepts an integer number as input from the user and perform the following conditional checks:
a. Print Tom if number is odd and exists between 20 to 30
b. Print Jerry, if number is even and exists between 20 and 30
 */

public class EvenOddCheck {


    public String isoddeven(long n)
    {
        if ((n % 2 == 1) && (n > 20) && (n < 30)) {       /*If number is odd and exists between 20 to 30 */
            return "Tom";
        }
        else if(n % 2 == 0 && n > 20 && n < 30)
        {
            return "Jerry";
        }
        else
        {
            return "Invalid Input and the number should be between 20 and thirty";
        }


    }

}