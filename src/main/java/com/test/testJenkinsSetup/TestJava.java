package com.test.testJenkinsSetup;

import java.io.BufferedReader;

public class TestJava {
    static int NO_OF_CHARS = 256;

    public static boolean anagram(char s[], char t[]) {
        int asd1[] = new int[NO_OF_CHARS];
        int psd1[] = new int[NO_OF_CHARS];
        for (int i = 0; i < s.length && i < t.length; i++) {
            asd1[s[i]]++;
            psd1[t[i]]++;

            if (s.length != t.length)
                return false;
            for (int i1 = 0; i1 < NO_OF_CHARS; i1++)
                if (s[i1] != t[i1])
                    return false;
        }
        return true;
    }

    /* Driver code*/
    public static void main(String args[])
    {
        char str1[] = ("geeksforgeeks").toCharArray();
        char str2[] = ("forgeeksgeeks").toCharArray();

        if (anagram(str1, str2))
            System.out.println("The two strings are"
                    + "anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }
}





