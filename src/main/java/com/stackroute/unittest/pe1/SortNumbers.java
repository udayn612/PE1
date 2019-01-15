package com.stackroute.unittest.pe1;

import java.util.Scanner;


/*
Write a program which accepts a number as input from user and perform the following:
a. sort the number in non-increasing order
b. after sorting sum all the even numbers, the sum should be greater than 15 .
c. if sum is more than 15,then print output as true or false.
Input  : 234534
Output : Sorted number in non-increasing order : 544332
 */

public class SortNumbers {

    public  static int lengthofinput(int n)
    {
        int s,i=0;

        for (i = 0; n > 0; n = n / 10, i++)
        {
            s = n % 10;
        }
            return i;
    }

    public static int[] conversiontoarray(int n) {
            int arrlength=lengthofinput(n);
        int[] arr = new int[arrlength];
        int s, i;
        for (i = 0; n > 0; n = n / 10, i++) {
            s = n % 10;
            arr[i] = s;

            for (int k = 0; k < i - 1; k++) {
                for (int j = 0; j < i - k - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

        }
        return arr;
    }

    public String sortnumbers(int n)
    {
        int arr[]= conversiontoarray(n);

        String st="";

            for(int k=0;k<arr.length;k++){
                st=st+arr[k];

            }

        return st;
    }

    public long add(int n) {
        int arr[]=conversiontoarray(n);
        long sum=0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i]%2==0)
                sum+=arr[i];
        }
        return sum;
    }

    public boolean check(int n) {
        long sum=add(n);
        if(sum>15)
            return true;
        else
            return false;
    }
}