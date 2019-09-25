package com.lambton;


public class LambtonStringTools
{
    String reverseString(String Str)
    {

        String string1=Str;
        String reverse=" ";
        for (int i = (string1.length()) - 1; i >= 0; i--)
        {
            reverse= reverse +string1.charAt(i);

        }
        return reverse;


    }

}
