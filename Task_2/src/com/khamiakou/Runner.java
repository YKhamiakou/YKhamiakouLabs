package com.khamiakou;

/**
 * Laboratory task 2. Runner
 */
public class Runner extends Game {
    /**
     * Fields
     */
    // length of an arrays
    private static final int ARRAY_LN = 40;

    /**
     * Main method
     *
     * @param args
     *            - parameter for main
     */
    public static void main(final String[] args) {
        final Game[] gameArray = new Game[Runner.ARRAY_LN];
        // filling in game
        gameArray[0] = new Game("DOTA2", 2013, 1000, "Windows");
        gameArray[1] = new Game("CS:GO", 2015, 500, "Windows");
        gameArray[2] = new Game("WOT", 2015, 555, "Windows");
        gameArray[3] = new Game("Super meet boy", 2014, 1000, "Windows");
        gameArray[4] = new Game("Wolfenstain", 2000, 800, "Windows");
        gameArray[5] = new Game("Paragon", 2013, 400, "Windows");
        gameArray[6] = new Game("Team Fortress", "Windows");
        gameArray[7] = new Game("The Witcher", "Windows");
        gameArray[8] = new Game("Civilization", "Windows");
        gameArray[9] = new Game();
        // filling in strategy
        gameArray[10] = new Strategy("DOTA", 2006, 1000, "Windows", 1000, 10, true);
        gameArray[11] = new Strategy("Starcraft", 2000, 1000, "Windows", 1000, 10, false);
        gameArray[12] = new Strategy("War", "Windows");
        gameArray[13] = new Strategy("Strateger", "MAC");
        gameArray[14] = new Strategy("Craft", "MAC");
        gameArray[15] = new Strategy("Book", "Windows");
        gameArray[16] = new Strategy("Strateg", "Windows");
        gameArray[17] = new Strategy("Printer", "Linux");
        gameArray[18] = new Strategy("Stimpanker", "Linux");
        gameArray[19] = new Strategy("Sox", "Windows");
        // fill in shooter
        gameArray[20] = new Shooter("CS", 2012, 800, "Windows", 12, "AK");
        gameArray[21] = new Shooter("DDS", 2012, 300, "Windows", 10, "AKM");
        gameArray[22] = new Shooter("Wolfenstain", "Windows");
        gameArray[23] = new Shooter("Bioshock", "Windows");
        gameArray[24] = new Shooter("Section8", "Windows");
        gameArray[25] = new Shooter("MassEffect", "Windows");
        gameArray[26] = new Shooter("Terminator", "Windows");
        gameArray[27] = new Shooter("Borderlands", "Windows");
        gameArray[28] = new Shooter("MadMax", "Windows");
        gameArray[29] = new Shooter("GTA", "Windows");
        // fill in quest
        gameArray[30] = new Quest("The Witcher", 2016, 1000, "Windows", 18);
        gameArray[31] = new Quest("TES", 2012, 1000, "Windows", 18);
        gameArray[32] = new Quest();
        gameArray[33] = new Quest();
        gameArray[34] = new Quest();
        gameArray[35] = new Quest();
        gameArray[36] = new Quest();
        gameArray[37] = new Quest();
        gameArray[38] = new Quest();
        gameArray[39] = new Quest();
        // printing information
        for (final Game element : gameArray) {
            System.out.println(element.toString());
        }
    }

}
