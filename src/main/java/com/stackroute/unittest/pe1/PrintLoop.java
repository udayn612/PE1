package com.stackroute.unittest.pe1;


import java.util.Scanner;

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
//1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
//    1 2 2 3 3 3 4 4 4 4 5 5 5 5 5

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        PrintLoop qs = new PrintLoop();
        System.out.println(qs.generatenumbers(n));
    }
}