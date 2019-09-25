package com.lambton;


import sun.awt.image.IntegerComponentRaster;

public class LambtonStringTools
{

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

                  String initials(String name)
                  {
                      String S1=name.substring(0);
                      char a=name.charAt(0);
                      char b;

                      String S2=name.substring(S1.length()+1);
                      
                      String S3;
                      return  S1;

                  }

}











