package com.rakovets.course.practice.module4;

import java.util.Scanner;

/**
 * Разработать программу для табличного процессора:
 * Программа генерирует номера строк при создании таблицы.
 * Известно:
 *
 * @param rows количество строк в таблице
 * @return номера строк, где каждый номер на новой строке
 */
public class Task001 {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
        Scanner scanner = new Scanner(System.in);

        // Код необходимый для тестирования, не изменять
        int rows = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        String result = new String();
        for (int i = 1; i <= rows; i++) {
            if (rows != i) {
                System.out.print(i + "\n");
            } else {
                System.out.print(i);
            }
        }
    }
}