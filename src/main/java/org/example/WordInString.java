package org.example;

public class WordInString {

    public static void main(String[] args) {

        String words = "My hobby is very interesting";

        String[] splitWords = words.split("[\\s ]");
        System.out.println(splitWords.length);

    }
}
