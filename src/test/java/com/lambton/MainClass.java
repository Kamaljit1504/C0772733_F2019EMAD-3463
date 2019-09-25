package com.lambton;

import java.sql.SQLOutput;

public class MainClass
{
    public static void main(String[] args) {
        LambtonStringTools lst = new LambtonStringTools();


        System.out.println(lst.reverseString("Lambton"));
        System.out.println(lst.binaryTODecimal("1000"));
        lst.initials("Kamal",
                "jeet","Soni");
        System.out.println( lst.initials("Kamal",
                "jeet","Soni"));

    }
}
