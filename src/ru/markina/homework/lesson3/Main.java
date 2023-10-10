package ru.markina.homework.lesson3;

import ru.markina.homework.lesson3.dto.PersonData;
import ru.markina.homework.lesson3.model.BirthDate;
import ru.markina.homework.lesson3.model.FullName;
import ru.markina.homework.lesson3.model.PhoneNumber;
import ru.markina.homework.lesson3.model.Sex;
import ru.markina.homework.lesson3.util.InfoParser;
import ru.markina.homework.lesson3.util.PersonDataFile;

public class Main {
    public static void main(String[] args) {

        var infoParser = new InfoParser("Введите через пробел следующую информацию: " +
                "Фамилия | Имя | Отчество | Дата рождения (в формате dd.mm.yyyy) | Номер телефона | Пол (f или m) ");

        final var fullName = new FullName(infoParser.at(0), infoParser.at(1), infoParser.at(2));
        final var birthDate = new BirthDate(infoParser.at(3));
        final var phoneNumber = new PhoneNumber(infoParser.at(4));
        final var sex = Sex.fromText(infoParser.at(5));

        var person = new PersonData(fullName, birthDate, phoneNumber, sex);

        var personDataFile = new PersonDataFile(person);
        personDataFile.writeToFile();
    }
}
