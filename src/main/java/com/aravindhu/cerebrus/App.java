package com.aravindhu.cerebrus;

/**
 * Hello world!
 *
 */
public class App 
{
    private int abc;

    private static String ip = "127.0.0.1";

    public static void main( String[] args )
    {
        String[] field = {"a", "b", "c", "s", "e"};

        String s = "";
        for (int i = 0; i < field.length; ++i) {
            s = s + field[i];
        }

        System.out.println(ip);
    }
}
