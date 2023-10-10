package ru.markina.homework.lesson3.dto;

import ru.markina.homework.lesson3.model.BirthDate;
import ru.markina.homework.lesson3.model.FullName;
import ru.markina.homework.lesson3.model.PhoneNumber;
import ru.markina.homework.lesson3.model.Sex;

public record PersonData(FullName fullName, BirthDate birthDate, PhoneNumber phoneNumber, Sex sex) {

}

