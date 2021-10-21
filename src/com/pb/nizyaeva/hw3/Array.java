package com.pb.nizyaeva.hw3;

import java.util.Scanner;
import java.util.Arrays;

public class Array {


    public static void main(String[] args) {
        //int n;
        int[] array = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 10 целых чисел массива ");
        //n= scan.nextInt();
        for (int i=0; i<10;i++)
        {
            array[i]= scan.nextInt();
        }
        System.out.println("Элементы массива:");
        for (int i=0; i<10;i++)
        {
            System.out.println(array[i]);
        }
        int sum = 0;
        for (int i=0; i<10;i++)

        {


            sum=sum+array[i];

        }
        System.out.println("Сумма всех элементов массива:");
        System.out.println(sum);
        int number = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i]>0)
                number = number+array[i];
        }

        System.out.println("количество положительных элементов массива:");
        System.out.println(number);

        boolean Sort = false;
        int Change;
        while(!Sort) {
            Sort = true;
            for (int i = 0; i < 9; i++) {
                if(array[i] > array[i+1]){
                    Sort = false;

                    Change = array[i];
                    array[i] = array [i+1];
                    array[i+1] = Change;
                }
            }
        }
        System.out.println("Элементы массива после сорировки пузырьком:");
        System.out.println(Arrays.toString(array));
    }
}