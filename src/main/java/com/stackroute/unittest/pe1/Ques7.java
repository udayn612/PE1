package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class Ques7 {

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



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        Ques7 qs = new Ques7();
        System.out.println(qs.sortnumbers(n));
        System.out.println(qs.add(n));
        System.out.println(qs.check(n));
    }
}