package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = (int) (Math.random()*100) + 1;
        int userNum, counter = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Угадайте число от 1 до 100");
        do{
            counter++;
            System.out.println("Ваша попытка номер " + counter);
            userNum = input.nextInt();
            //int diff = Math.abs(num - userNum);
            if(num>userNum)
                System.out.println("Целевое число БОЛЬШЕ");
            else if (num<userNum)
                System.out.println("Целевое число МЕНЬШЕ");
            else
                System.out.println("УСПЕХ!");
        }
        while (num!=userNum);
    }
}
