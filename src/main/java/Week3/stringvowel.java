package src.main.java.Week3;

import java.util.Arrays;

import java.util.Arrays;
import java.util.List;

public class stringvowel {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cat", "dog", "elephant"};

//        List<String> vowelStrings = Arrays.asList(strings);

        Arrays.stream(strings)
                .filter(s -> s.matches(".[aeiouAEIOU]."))
                .forEach(s -> System.out.println(s + " has " + countVowels(s) + " vowels"));
    }


    private static int countVowels(String str) {
        return str.replaceAll("(?i)[^aeiouAEIOU]", "").length();
    }

}