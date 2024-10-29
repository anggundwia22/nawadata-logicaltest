package com.enigma;

import java.util.Scanner;

public class SortCharacter {

    public static void sortCharByType() {
        System.out.println("Input one line of words (S): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase().replace(" ", "");
        char[] chars = input.toCharArray();
        String vowel = "";
        String consonant = "";

        for (char c : chars) {
            if (isVowel(c)) {
                vowel += c;
            } else {
                consonant += c;
            }
        }

        System.out.println("Vowel Characters :");
        System.out.println(sortAndGroupChar(vowel));
        System.out.println("Consonant Characters :");
        System.out.println(sortAndGroupChar(consonant));
    }

    public static boolean isVowel(Character c) {
        return c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o';
    }

    public static String sortAndGroupChar(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (str.contains(String.valueOf(chars[i])) && !sb.toString().contains(String.valueOf(chars[i]))) {
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[j] == chars[i]) {
                        sb.append(chars[j]);
                    }
                }
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}