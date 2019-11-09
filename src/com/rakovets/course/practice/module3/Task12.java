package com.rakovets.course.practice.module3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Разработать программу для сайта посвященного астрологии:
 * Которая выводит знак зодиака и названия года по китайскому календарю, если известно:
 *
 * @param day   - число дня рождения
 * @param month - месяц дня рождения
 * @param year  - год дня рождения
 * @return 'Zodiac Sign: {0}. Chinese Zodiac: {1}', где {0} - знак зодиака, {1} - год зодиака
 */
public class Task12 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int day = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[0]);
        int month = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[1]);
        int year = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[2]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        System.out.print("Zodiac Sign: ");
        if ((month == 1 && day >= 21) || (month == 2 && day <= 19)) {
            System.out.print("Water-Bearer");
        } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
            System.out.print("Fishes");
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
            System.out.print("Ram");
        } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
            System.out.print("Bull");
        } else if ((month == 5 && day >= 22) || (month == 6 && day <= 21)) {
            System.out.print("Twins");
        } else if ((month == 6 && day >= 22) || (month == 7 && day <= 22)) {
            System.out.print("Crab");
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 21)) {
            System.out.print("Lion");
        } else if ((month == 8 && day >= 22) || (month == 9 && day <= 23)) {
            System.out.print("Maiden");
        } else if ((month == 9 && day >= 24) || (month == 10 && day <= 23)) {
            System.out.print("Scales");
        } else if ((month == 10 && day >= 24) || (month == 11 && day <= 22)) {
            System.out.print("Scorpion");
        } else if ((month == 11 && day >= 23) || (month == 12 && day <= 22)) {
            System.out.print("Archer");
        } else {
            System.out.print("Sea-Goat");
        }
        System.out.print(". Chinese Zodiac: ");
        switch (year % 12) {
            case 0:
                System.out.print("Monkey");
                break;
            case 1:
                System.out.print("Rooster");
                break;
            case 2:
                System.out.print("Dog");
                break;
            case 3:
                System.out.print("Pig");
                break;
            case 4:
                System.out.print("Rat");
                break;
            case 5:
                System.out.print("Ox");
                break;
            case 6:
                System.out.print("Tiger");
                break;
            case 7:
                System.out.print("Rabbit");
                break;
            case 8:
                System.out.print("Dragon");
                break;
            case 9:
                System.out.print("Snake");
                break;
            case 10:
                System.out.print("Horse");
                break;
            case 11:
                System.out.print("Ram");
                break;
        }
    }
}