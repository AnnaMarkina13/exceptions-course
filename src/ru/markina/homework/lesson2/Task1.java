package ru.markina.homework.lesson2;

import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class Task1 {
    public static void main(String[] args) {
        System.out.println(tryParseFloatNumber("Введите дробное число (для отделения дробной части используйте точку): "));
    }

    public static float tryParseFloatNumber(String message) {
        System.out.println(message);
        var inputLine = new Scanner(System.in).nextLine();
        try {
            return Float.parseFloat(inputLine);
        } catch (NumberFormatException e) {
            return tryParseFloatNumber(message);
        }
    }
}