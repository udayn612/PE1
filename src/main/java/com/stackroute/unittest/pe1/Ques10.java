package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class Ques10 {

    public String generateatlast(int n, String s)
    {

        StringBuilder sb=new StringBuilder();
        sb.append(s);
        String lastnchar="";
        if(s.length()>n)
        {
            lastnchar=s.substring(s.length()-n);
        }
        else
        {
            lastnchar=s;
        }
        for(int i=0;i<n;i++)
        {
            sb.append(lastnchar);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner ob =new Scanner(System.in);
        System.out.println("Enter the String");
        String s = ob.next();
        System.out.println("Enter the number");
        int n=ob.nextInt();

        Ques10 qs= new Ques10();
        System.out.println(qs.generateatlast(n,s));

    }
}
