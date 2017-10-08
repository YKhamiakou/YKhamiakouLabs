package com.khamiakou;

/**
 * Laboratory task 2. Child class, that describes a strategy game.
 */
public class Strategy extends Game {
    /**
     * Fields
     */
    // maximal number of units
    private final int     maxUnits;
    // number of cards
    private final int     numCards;
    // whether you can create the game
    private final boolean canCreate;

    /**
     * Default constructor
     */
    public Strategy() {
        super();
        this.canCreate = false;
        this.maxUnits = 0;
        this.numCards = 0;
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
     * @param maxUnits
     *            - maximal number of units
     * @param numCards
     *            - number of cards
     * @param canCreate
     *            - whether you can create or not
     */
    public Strategy(final String name, final int release, final int rating, final String os,
            final int maxUnits, final int numCards, final boolean canCreate) {
        super(name, release, rating, os);
        this.maxUnits = maxUnits;
        this.numCards = numCards;
        this.canCreate = canCreate;
    }

    /**
     * Constructor with only 2 parameters
     *
     * @param os
     *            - operation system
     * @param name
     *            - game's name
     */
    public Strategy(final String name, final String os) {
        super(name, os);
        this.maxUnits = 0;
        this.numCards = 0;
        this.canCreate = true;
    }

    /**
     * @return the maxUnits
     */
    public int getMaxUnits() {
        return this.maxUnits;
    }

    /**
     * @return the numCards
     */
    public int getNumCards() {
        return this.numCards;
    }

    /**
     * @return the canCreate
     */
    public boolean isCanCreate() {
        return this.canCreate;
    }

    /**
     * Prints game's name
     */
    @Override
    public void naming() {
        System.out.println("Game's name is '" + this.getName() + "', it is a strategy");
    }

    /*
     * Return all the information
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Strategy [name=" + this.getName() + ", оs=" + this.getOs() + ", rating="
                + this.getRating() + ", release=" + this.getRelease() + ", maxUnits="
                + this.maxUnits + ", numCards=" + this.numCards + ", canCreate=" + this.canCreate
                + "]";
    }

}
