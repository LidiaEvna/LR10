package com.company;
import java.util.*;
class Main {
    public static void main(String[] args) {
        String str1 = "Утро добрым не бывает";

        String[] words1 = str1.split(" ");
        System.out.println("Самое длинное слово: " + maxLengthWord(words1));
    }
    private static String maxLengthWord(String[] p) {
        for (int m = 0; m < p.length; m++) {
            p[m] = p[m].toLowerCase();
        }
        Arrays.sort(p);
        int len = 0;
        String longest = "";
        for (String string : p) {
            if (string.length() > len) {
                len = string.length();
                longest = string;
            }
        }
        return longest;
    }
}