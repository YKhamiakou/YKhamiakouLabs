package com.khamiakou;

/**
 * Laboratory task 2. Runner
 */
public class Runner extends Game {
    /**
     * Fields
     */
    // length of an arrays
    private static final int ARRAY_LN = 10;

    /**
     * Main method
     *
     * @param args
     *            - parameter for main
     */
    public static void main(final String[] args) {
        final Game[] gameArray = new Game[Runner.ARRAY_LN];
        final Strategy[] strategyArray = new Strategy[Runner.ARRAY_LN];
        final Shooter[] shooterArray = new Shooter[Runner.ARRAY_LN];
        final Quest[] questArray = new Quest[Runner.ARRAY_LN];
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
        strategyArray[0] = new Strategy("DOTA", 2006, 1000, "Windows", 1000, 10, true);
        strategyArray[1] = new Strategy("Starcraft", 2000, 1000, "Windows", 1000, 10, false);
        strategyArray[2] = new Strategy("War", "Windows");
        strategyArray[3] = new Strategy("Strateger", "MAC");
        strategyArray[3] = new Strategy("Craft", "MAC");
        strategyArray[4] = new Strategy("Book", "Windows");
        strategyArray[5] = new Strategy("Strateg", "Windows");
        strategyArray[6] = new Strategy("Printer", "Linux");
        strategyArray[7] = new Strategy("Stimpanker", "Linux");
        strategyArray[8] = new Strategy("Sox", "Windows");
        strategyArray[9] = new Strategy("Stranger", "MAC");
        // fill in shooter
        shooterArray[0] = new Shooter("CS", 2012, 800, "Windows", 12, "AK");
        shooterArray[1] = new Shooter("DDS", 2012, 300, "Windows", 10, "AKM");
        shooterArray[2] = new Shooter("Wolfenstain", "Windows");
        shooterArray[3] = new Shooter("Bioshock", "Windows");
        shooterArray[4] = new Shooter("Section8", "Windows");
        shooterArray[5] = new Shooter("MassEffect", "Windows");
        shooterArray[6] = new Shooter("Terminator", "Windows");
        shooterArray[7] = new Shooter("Borderlands", "Windows");
        shooterArray[8] = new Shooter("MadMax", "Windows");
        shooterArray[9] = new Shooter("GTA", "Windows");
        // fill in quest
        questArray[0] = new Quest("The Witcher", 2016, 1000, "Windows", 18);
        questArray[1] = new Quest("TES", 2012, 1000, "Windows", 18);
        questArray[2] = new Quest();
        questArray[3] = new Quest();
        questArray[4] = new Quest();
        questArray[5] = new Quest();
        questArray[6] = new Quest();
        questArray[7] = new Quest();
        questArray[8] = new Quest();
        questArray[9] = new Quest();
        // printing information
        for (final Game element : gameArray) {
            System.out.println(element.toString());
        }
        for (final Strategy element : strategyArray) {
            System.out.println(element.toString());
        }
        for (final Shooter element : shooterArray) {
            System.out.println(element.toString());
        }
        for (final Quest element : questArray) {
            System.out.println(element.toString());
        }

    }

}
