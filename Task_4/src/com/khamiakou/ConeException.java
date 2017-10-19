package com.khamiakou;

/**
 * Task 3. Exception for cone calculating.
 */
public class ConeException extends Exception {
    /**
     * serialVersion
     */
    private static final long serialVersionUID = 1L;
    /**
     * Fields
     */
    // hight or radius of a cone
    private final int         number;

    /**
     * Exception method
     *
     * @param message
     *            - description of an exception
     * @param number
     *            - hight or radius of a cone
     */
    public ConeException(final String message, final int number) {
        super(message);
        this.number = number;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return this.number;
    }

}
