package ru.markina.homework.lesson3.util;

import ru.markina.homework.lesson3.dto.PersonData;

import java.io.FileWriter;
import java.io.IOException;

public class PersonDataFile {

    private final PersonData person;

    public PersonDataFile(final PersonData person) {
        this.person = person;
    }

    public void writeToFile() {
        try (FileWriter fileWriter = new FileWriter(person.fullName().surname() + ".txt", true)){
            fileWriter.write(String.format("<%s><%s><%s><%s><%s><%s>\n", person.fullName().surname(),
                    person.fullName().name(), person.fullName().middleName(), person.birthDate().getValue(),
                    person.phoneNumber().value(), person.sex()));
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
