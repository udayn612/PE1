package com.stackroute.unittest.pe1;

import java.util.Scanner;

/*
Create a program that accepts a word as input and checks for each single character letter in the word whether it is a consonant or vowel.
Condition:
    a. Print an error message if the input is not a letter
    b. If the input having more than one letter, print the required output
          (Vowel or Consonant) for each letter
Input : p
Output : Consonant
Input : ap
Output : Vowel Consonant
 */

public class VowelConsonentCheck {
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
}