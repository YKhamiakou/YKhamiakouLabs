package com.khamiakou;

/**
 * Laboratory task 2. Child class, that describes a shooter game.
 */
public class Shooter extends Game {
    /**
     * Fields
     */
    // number of levels
    private final int    numLevel;
    // kind of a weapon
    private final String weapon;

    /**
     * Default constructor
     */
    public Shooter() {
        super();
        this.weapon = "";
        this.numLevel = 0;
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
     * @param numLevel
     *            - number of levels
     * @param weapon
     *            - kind of weapon
     */
    public Shooter(final String name, final int release, final int rating, final String os,
            final int numLevel, final String weapon) {
        super(name, release, rating, os);
        this.weapon = weapon;
        this.numLevel = numLevel;
    }

    /**
     * Constructor with only 2 parameters
     *
     * @param os
     *            - operation system
     * @param name
     *            - game's name
     */
    public Shooter(final String name, final String os) {
        super(name, os);
        this.weapon = "";
        this.numLevel = 0;
    }

    /**
     * @return the numLevel
     */
    public int getNumLevel() {
        return this.numLevel;
    }

    /**
     * @return the weapon
     */
    public String getWeapon() {
        return this.weapon;
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
        return "Shooter [name=" + this.getName() + ", оs=" + this.getOs() + ", rating="
                + this.getRating() + ", release=" + this.getRelease() + ", numLevel="
                + this.numLevel + ", weapon=" + this.weapon + "]";
    }

}
