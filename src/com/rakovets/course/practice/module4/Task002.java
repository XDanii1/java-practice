package com.rakovets.course.practice.module4;

import java.util.Scanner;

/**
 * Разработать программу для табличного процессора:
 * Программа генерирует номера строк при создании таблицы.
 * Известно:
 *
 * @param rows количество строк в таблице
 * @param headerRowEnable имеет ли таблица строку-заголовок 'true'/'false', если имеет то для первой строки не нужно
 *                        генерировать номер
 * @return номера строк, где каждый номер на новой строке
 */
public class Task002 {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
        Scanner scanner = new Scanner(System.in);

        // Код необходимый для тестирования, не изменять
        int rows = (args.length != 2) ? scanner.nextInt() : Integer.parseInt(args[0]);
        boolean headerRowEnable = (args.length != 2) ? scanner.nextBoolean() : Boolean.parseBoolean(args[1]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        String result = new String();
        for (int i = 1; i <= rows; i++) {
            if (headerRowEnable) {
                System.out.println();
                i--;
                rows--;
                headerRowEnable = false;
            } else {
                result += (i);
                if (rows != i) {
                    result += ("\n");
                }
            }
        }
        System.out.print(result);
    }
}