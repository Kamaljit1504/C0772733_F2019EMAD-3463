package com.lambton;


import sun.awt.image.IntegerComponentRaster;

public class LambtonStringTools {

    String reverseString(String Str) {


        String string1 = Str;

        String reverse = " ";
        for (int i = (string1.length()) - 1; i >= 0; i--) {
            reverse = reverse + string1.charAt(i);


        }
        return reverse;

    }

    int binaryTODecimal(String num) {
        String binaryString = num;
        int decimal = Integer.parseInt(binaryString, 2);
        return decimal;
    }


    String initials(String name) {

        String First = name.substring(0, 5);
        String Mid = name.substring(First.length() + 1, 10);
        String SurName = name.substring(Mid.length() + 1);
        char a = name.charAt(0);
        char b = Mid.charAt(0);
        String initalName = First.concat(Mid);
        String S3 = initalName.concat(SurName);
        String S4 = String.valueOf(First.charAt(0)).concat(String.valueOf(Mid.charAt(0)));
        String S5 = S4.concat(SurName);
        return S5;

    }

    String replaceSubString(String s1, String s2, String s3)
    {
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        s1 = s1.replace("the", "that");
        return s1;
    }

 char mostFrequentword(String SSS)
 {
     int count=0;

     for(int i=0;i<SSS.length();i++)
     {
         char[] a=SSS.toCharArray();
         if()
     }
 }






}










