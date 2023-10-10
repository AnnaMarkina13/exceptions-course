package ru.markina.homework.lesson3.util;

import java.util.Scanner;

public class InfoParser {

    private final String[] inputData;

    public InfoParser(final String message) {
        this.inputData = getClientData(message);
    }

    private String[] getClientData(String message) {
        System.out.println(message);
        var inputData = new Scanner(System.in).nextLine().split(" ");
        validate(inputData);
        return inputData;
    }

    private static void validate(String[] data) {
        if (data.length < 6) {
            throw new IllegalArgumentException("Вы ввели меньше данных, чем нужно!");
        } else if (data.length > 6) {
            throw new IllegalArgumentException("Вы ввели больше данных, чем нужно!");
        }
    }

    public String at(int index) {
        return inputData[index];
    }
}
