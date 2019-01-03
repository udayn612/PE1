package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class Ques3 {
    public  boolean isvowelconsonent(String str) {
        int l = str.length();
        int found=0;

        for(int i = 0; i<l; i++) {
            if((str.charAt(i)=='a') || (str.charAt(i)=='e') || (str.charAt(i)=='i') || (str.charAt(i)=='o')
                    || (str.charAt(i)=='u')) {              /*If letter is vowel */
                continue;
            } else{                                          /*If letter is consonant */
                found=1;
            }
        }

        if(found==0)
            return true;
        else
            return false;

    }

    public  boolean ischaracter(String str)
    {
        int l = str.length();
        int found=0;
        for(int i = 0; i<l; i++) {
            if( !(( (str.charAt(i)>64) && (str.charAt(i)<91) ) ||
                    ( (str.charAt(i)>96) && (str.charAt(i)<123) )  ) ) {  /*If character is not a letter */

                found=1;
            }
        }

        if(found==0)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = scanner.nextLine();
        Ques3 qs=new Ques3();
        if(qs.isvowelconsonent(str))
        {
            System.out.println("Everthing is vowel");
        }
        else
        {
            System.out.println("Everything is not vowel");
        }
        if( qs.ischaracter(str)){
            System.out.println("the entered string is all characters");
        }
       else{
            System.out.println("please enter valid input(only characters)");
        }
    }
}