package ru.markina.homework.lesson3.model;

import ru.markina.homework.lesson3.exception.WrongDataException;

public record PhoneNumber(String value) {

    public PhoneNumber(final String value) {
        this.value = validPhoneNumber(value);
    }

    private String validPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("[0-9]+")) {
            return phoneNumber;
        } else {
            throw new WrongDataException("Неверный номер телефона");
        }
    }
}
