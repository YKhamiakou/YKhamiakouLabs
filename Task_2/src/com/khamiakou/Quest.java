package com.khamiakou;

/**
 * Laboratory task 2. Child class, that describes a shooter game.
 */
public class Quest extends Game {
    /**
     * Fields
     */
    // person's age
    private final int age;

    /**
     * Default constructor
     */
    public Quest() {
        super();
        this.age = 0;
    }

    /**
     * Full constructor
     *
     * @param name
     *            - game's name
     * @param release
     *            - release year
     * @param rating
     *            - games's rating
     * @param os
     *            - operation system
     * @param age
     *            - person's age
     */
    public Quest(final String name, final int release, final int rating, final String os,
            final int age) {
        super(name, release, rating, os);
        this.age = age;
    }

    /**
     * Constructor with only 2 parameters
     *
     * @param os
     *            - operation system
     * @param name
     *            - game's name
     */
    public Quest(final String name, final String os) {
        super(name, os);
        this.age = 0;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Prints game's name
     */
    @Override
    public void naming() {
        System.out.println("Game's name is '" + this.getName() + "', it is a shooter");
    }

    /*
     * Return all the information
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Quest [name=" + this.getName() + ", оs=" + this.getOs() + ", rating="
                + this.getRating() + ", release=" + this.getRelease() + ", age=" + this.age + "]";
    }

}
