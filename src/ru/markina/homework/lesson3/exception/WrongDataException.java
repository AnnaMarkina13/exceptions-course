package ru.markina.homework.lesson3.exception;

public class WrongDataException extends RuntimeException {
    public WrongDataException(final String s) {
        System.err.println(s);
    }
}
