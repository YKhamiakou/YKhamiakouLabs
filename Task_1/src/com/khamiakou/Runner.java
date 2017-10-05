package com.khamiakou;

import java.util.Scanner;

/**
 * Runner for class Person.
 */

public class Runner {
    /**
     * Fields
     */
    private static final int NUM_PEOPLE = 10;

    /**
     * Main method
     *
     * @param args
     *            - parameter for main
     */
    public static void main(final String[] args) {
        final Person[] array = new Person[Runner.NUM_PEOPLE];
        final Scanner scan = new Scanner(System.in);
        // add information
        for (int i = 0; i < Runner.NUM_PEOPLE; i++) {
            System.out.printf("Person %d of %d%n", i + 1, Runner.NUM_PEOPLE);
            // add surname
            System.out.print("Enter surname: ");
            final String fio = scan.next();
            // add age
            System.out.print("Enter age: ");
            final int age = scan.nextInt();
            // add gender
            System.out.print("Enter gender: ");
            final String gender = scan.next();
            // using constructor
            array[i] = new Person(fio, age, gender);
        }
        // closing scanner
        scan.close();
        // calling averageAge
        System.out.printf("Average age: %d%n", array[0].averageAge(array));
        // calling numberOfMales
        System.out.printf("Number of males: %d%n", array[0].numberOfMales(array));
    }

}
