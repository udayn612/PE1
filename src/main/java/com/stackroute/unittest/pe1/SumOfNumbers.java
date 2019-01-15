package com.stackroute.unittest.pe1;


import java.util.Scanner;

public class SumOfNumbers {

    public long sum(String s)
    {
        int sum = 0;
        String [] numbers = s.split(" ");
        int i=0;
        while (i<numbers.length) {
            sum +=Integer.parseInt(numbers[i]);
            i++;
        }
        return sum;

    }

}


