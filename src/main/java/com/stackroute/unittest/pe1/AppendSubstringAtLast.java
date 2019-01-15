package com.stackroute.unittest.pe1;

import java.util.Scanner;

/*
Write a program for the following condition:
Given 2 inputs , where input1 is string and input 2 is integer value,
the last n characters should repeat n number of times in the output String.
Input1:            Stackroute
Input2:            5
Output1:           Stackrouterouterouterouterouteroute
 */

public class AppendSubstringAtLast {

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

}
