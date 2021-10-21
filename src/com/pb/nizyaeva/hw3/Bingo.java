package com.pb.nizyaeva.hw3;
import java.util.Random;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(11);
        System.out.println("Угадайте задуманное число!");
        System.out.println("Для выхода из программы введите '-7'.");
        System.out.println("Введите число в интервале от 0 до 100");
        int attempt = 0;
        final int MAX_ATTEMPT = 10000;
        while (attempt < MAX_ATTEMPT) {
            attempt++;
            Scanner scan = new Scanner(System.in);
            int y;
             y = scan.nextInt();

            if (x>y & y!=-7){
                System.out.println("Задуманное число больше");
                System.out.println("Попробуйте еще раз:");}

            if(x<y){
                System.out.println("Задуманное число меньше");
                System.out.println("Попробуйте еще раз:");}


            if (y == -7) {
                break;
            }

            if (x!=y) {
                continue;
            }
            System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
            break;
                   }
        System.out.println("Конец игры!");
    }
}
