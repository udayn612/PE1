package com.stackroute.unittest.pe1;
import java.util.Scanner;

public class Ques1 {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Ques1 qs=new Ques1();
        long n = scanner.nextLong();
        if (qs.palindrome(n)) {  /*If number is palindrome */
            System.out.println("Given number is palindrome");
        } else {
            System.out.println("Given number is not a palindrome");
        }

        System.out.println(qs.evenNumberSum(n));

    }
}
