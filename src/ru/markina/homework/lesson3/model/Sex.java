package ru.markina.homework.lesson3.model;

import ru.markina.homework.lesson3.exception.WrongDataException;

public enum Sex {

    FEMALE,
    MALE;

    public static Sex fromText(String sex) {
        if (sex.equalsIgnoreCase("m")) {
           return MALE;
        } else if (sex.equalsIgnoreCase("f")) {
            return FEMALE;
        } else {
            throw new WrongDataException("Неверно указан пол.");
        }
    }
}
