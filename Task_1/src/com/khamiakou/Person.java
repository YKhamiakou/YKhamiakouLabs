package com.khamiakou;

/**
 * Laboratory work 1. Contains an application, that describe a person.
 */
public class Person {
    /**
     * Fields
     */
    private final String fio;
    private final int    age;
    private final String gender;

    /**
     * Simple constructor
     *
     * @param fio
     *            - person's surname
     * @param age
     *            - person's age
     * @param gender
     *            - person's gender. Use "male" or "female"
     */
    public Person(final String fio, final int age, final String gender) {
        this.fio = fio;
        this.age = age;
        this.gender = gender;
    }

    /**
     * Gets average age of Person[]
     *
     * @param array
     *            - Person[] array
     * @return - average age
     */
    public int averageAge(final Person[] array) {
        final int arrayLn = array.length;
        int result = 0;
        // counting average age
        for (final Person element : array) {
            result += element.getAge();
        }
        result /= arrayLn;
        return result;
    }

    /**
     * Gets person's age
     *
     * @return - person's age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Gets person's surname
     *
     * @return - person's surname
     */
    public String getFio() {
        return this.fio;
    }

    /**
     * Gets person's gender
     *
     * @return - person's gender
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * Gets number of males in Person[]
     *
     * @param array
     *            - Person[] array
     * @return - number of males
     */
    public int numberOfMales(final Person[] array) {
        int result = 0;
        final String male = "male";
        // counting number of male
        for (final Person element : array) {
            if (male.equalsIgnoreCase(element.getGender())) {
                result++;
            }
        }
        return result;
    }

}
