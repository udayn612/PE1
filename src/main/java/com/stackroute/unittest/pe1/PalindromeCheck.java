package com.stackroute.unittest.pe1;
import java.util.Scanner;


/*
Write a program which accepts a number as input and check whether the given number is palindrome or not If it is a palindrome then
a. Add all the even numbers and check whether the sum is more than 25.
b. Print success and failure messages for all 3 conditions
Input : 2468642
Output : 2468642 is palindrome and the sum of even numbers is greater than 25
Input: 12345
Output: 12345 is not palindrome
Input: 12345654321
Output : 12345654321 is palindrome and sum of even numbers is less than 25
*/

public class PalindromeCheck {
    public boolean palindrome(long n) {
        long s;  /*Sum variable */
        long num = n;
        for (s = 0; n > 0; n = n / 10) {
            s = s * 10;
            s = s + n % 10;
        }
        if (s == num) {
            return true; /*If reversed number is equal to original number*/
        } else {
            return false; /*If reversed number is not equal to original number*/
        }

    }

    public long evenNumberSum(long n) {
        long s; /*Sum variable */
        for (s = 0; n > 0; n = n / 10) {
            long num = n % 10;
            if (num % 2 == 0) {  /*If number is even */
                s += num;
            }
        }
        return s;
    }
}
