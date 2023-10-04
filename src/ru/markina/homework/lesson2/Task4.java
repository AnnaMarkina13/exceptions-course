package ru.markina.homework.lesson2;

import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

public class Task4 {
    public static void main(String[] args) throws Exception {
        checkInputLine("Введите любые символы: ");
    }

    public static void checkInputLine(String message) throws Exception {
        System.out.println(message);
        var line = new Scanner(System.in).nextLine();
        if (line.isEmpty()) {
            throw new Exception("Пустые строки вводить нельзя");
        }
        System.out.printf("Вы ввели: %s", line);
    }
}
