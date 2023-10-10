package ru.markina.homework.lesson3.model;

import ru.markina.homework.lesson3.exception.WrongDataException;

public record FullName(String surname, String name, String middleName) {

    private static final String NAME_PATTERN = "^[a-zA-Zа-яА-Я]*$";

    public FullName(final String surname, final String name, final String middleName) {
        this.surname = validText(surname, "Неверная фамилия");
        this.name = validText(name, "Неверное имя");
        this.middleName = validText(middleName, "Неверное отчество");
    }

    private String validText(String text, String error) {
        if (text.matches(NAME_PATTERN)) {
            return text.substring(0, 1).toUpperCase() + text.substring(1);
        } else {
            throw new WrongDataException(error);
        }
    }
}
