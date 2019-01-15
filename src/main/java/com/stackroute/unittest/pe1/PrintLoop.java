package com.stackroute.unittest.pe1;


import java.util.Scanner;

/*
Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6       6 6 . . . nth iteration.
 Input: 5
 Output : 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
 */

public class PrintLoop {

    public String generatenumbers(int n)
    {

        String str2 = "";

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                str2 += i;
            }
        }
        return str2;
    }
}