package com.khamiakou;

/**
 * Laboratory task 2. Parent class, that describes a game.
 */
public class Game {
    /**
     * Fields
     */
    // game's name
    private final String name;
    // year of release
    private final int    release;
    // game's rating
    private final int    rating;
    // operation system
    private final String os;

    /**
     * Default constructor
     */
    public Game() {
        this.name = "";
        this.os = "";
        this.rating = 0;
        this.release = 0;
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
     */
    public Game(final String name, final int release, final int rating, final String os) {
        this.name = name;
        this.release = release;
        this.rating = rating;
        this.os = os;
    }

    /**
     * Constructor with only 2 parameters
     *
     * @param name
     *            - game's name
     * @param os
     *            - operation system
     */
    public Game(final String name, final String os) {
        this.name = name;
        this.os = os;
        this.rating = 0;
        this.release = 0;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return the os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return this.rating;
    }

    /**
     * @return the release
     */
    public int getRelease() {
        return this.release;
    }

    /**
     * Prints game's name
     */
    public void naming() {
        System.out.println("Game's name is '" + this.name + "'");
    }

    /*
     * Return all the information
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Game [name=" + this.name + ", release=" + this.release + ", rating=" + this.rating
                + ", os=" + this.os + "]";
    }

}
