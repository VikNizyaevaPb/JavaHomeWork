package com.pb.nizyaeva.hw4;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {


    static void function() {
        String str1;
        String str2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите фразу");
        str1 = scan.nextLine();
        System.out.println("Введите анаграмму");
        str2 = scan.nextLine();
        String newstr1 = str1.replaceAll("[^\\p{L}\\p{N}]+", "");
        String newstr2 = str2.replaceAll("[^\\p{L}\\p{N}]+", "");
        char[] chArray1 = newstr1.toCharArray();
        char[] chArray2 = newstr2.toCharArray();
        Arrays.sort(chArray1);
        Arrays.sort(chArray2);

                if (Arrays.equals(chArray1, chArray2))
                    System.out.println("Это анаграмма");
                else
                    System.out.println("Это не анаграмма");


    }
    public static void main(String[] args) {
    function();
    }

}













