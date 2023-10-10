package ru.markina.homework.lesson3.model;

import ru.markina.homework.lesson3.exception.WrongDataException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BirthDate {

    private final LocalDate value;

    public BirthDate(final String value) {
        this.value = validBirthDate(value);
    }

    private LocalDate validBirthDate(String birthDate) {
        final LocalDate result;
        try {
            result = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (RuntimeException e) {
            throw new WrongDataException("Неверный формат даты рождения.");
        }
        if (result.isAfter(LocalDate.now())) {
            throw new WrongDataException("Дата рождения не может быть в будущем");
        }
        return result;
    }

    public LocalDate getValue() {
        return value;
    }
}
