package com.stackroute.unittest.pe1;


import java.util.Scanner;

public class Ques2 {


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


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = scanner.nextLong();

        Ques2 qs = new Ques2();

        System.out.println(qs.isoddeven(n));


    }
}