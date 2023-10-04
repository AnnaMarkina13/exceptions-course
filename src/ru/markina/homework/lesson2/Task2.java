package ru.markina.homework.lesson2;

public class Task2 {
    public static void main(String[] args) {
        divideArrayElement(new int[] {1, 45, 33, 21, 12, -4, 0, 34, 36}, 0);
    }

    public static void divideArrayElement(int[] intArray, int d) {
        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
