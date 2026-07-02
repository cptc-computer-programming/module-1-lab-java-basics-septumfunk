// src/main/java/week01/part04_constants/SoccerApp.java
package week01.part04_constants;

public class SoccerApp {

    // TODO: Write a main method that calls runMatch().
    public static void main(String[] args) {
        runMatch();
    }

    // TODO: Implement this method so it prints EXACTLY:
    // Soccer Match
    // Kickoff.
    // Goal scored!
    // Halftime.
    // Full time.
    //
    // Rules:
    // - Use ONLY constants from Messages (no hardcoded strings).
    // - Use println for each line.
    // - Call the helper methods below in the correct order.
    public static void runMatch() {
        // Your code here
        printTitle();
        printKickoff();
        printGoal();
        printHalftime();
        printFulltime();
    }

    // TODO: Print EXACTLY one line using Messages.TITLE
    public static void printTitle() {
        // Your code here
        System.out.println(Messages.TITLE);
    }

    // TODO: Print EXACTLY one line using Messages.KICKOFF
    public static void printKickoff() {
        // Your code here
        System.out.println(Messages.KICKOFF);
    }

    // TODO: Print EXACTLY one line using Messages.GOAL
    public static void printGoal() {
        // Your code here
        System.out.println(Messages.GOAL);
    }

    // TODO: Print EXACTLY one line using Messages.HALFTIME
    public static void printHalftime() {
        // Your code here
        System.out.println(Messages.HALFTIME);
    }

    // TODO: Print EXACTLY one line using Messages.FULLTIME
    public static void printFulltime() {
        // Your code here
        System.out.println(Messages.FULLTIME);
    }
}
