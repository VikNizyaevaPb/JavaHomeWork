package com.pb.nizyaeva.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Введите целое число:");
        x = scan.nextInt();
        if (x >= 0 && x <= 14) {
            System.out.print("Число попадает в промежуток [0-14]");
        }
        if (x >= 15 && x <= 35) {
            System.out.print("Число попадает в промежуток [15-35]");
        }
        if (x >= 35 && x <= 60) {
            System.out.print("Число попадает в промежуток [35-60]");
        }
        if (x >= 61 && x <= 100) {
            System.out.print("Число попадает в промежуток [61-100]"); }
        if (x >= 0 != x <= 100) {
                System.out.print("Число не попадает в промежутки [0-14][15-35][35-60][61-100]");
            }
        }
    }
