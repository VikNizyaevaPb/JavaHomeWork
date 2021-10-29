package com.pb.nizyaeva.hw4;
import java.util.Scanner;
public class CapitalLetter {

    static void function() {
        String sentence;
        Scanner scan = new Scanner(System.in);
        sentence=scan.nextLine();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++)
        {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        sentence = String.join(" ", words);
        System.out.println(sentence);
        }

    public static void main (String[]args) {
        System.out.println("Введите фразу:");
        function();
    }
}
