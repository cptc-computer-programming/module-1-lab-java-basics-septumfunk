// src/main/java/week01/part05_integration/AirlineApp.java
package week01.part05_integration;

import week01.part05_integration.AirlineMessages;
import week01.part05_integration.AirportScreen;

public class AirlineApp {

    // TODO: Write a main method that calls runCheckIn().
    public static void main(String[] args) {
        runCheckIn();
    }

    // TODO: Implement runCheckIn() so it prints the required output EXACTLY.
    // Rules:
    // - Use println for each line.
    // - Use ONLY constants from AirlineMessages (no hardcoded strings).
    // - At least TWO steps must be done by calling methods in OTHER classes.
    public static void runCheckIn() {
        // Your code here
        AirportScreen.showTitle();
        System.out.println(AirlineMessages.START);
        CheckInWorkflow.enterPassengerDetails();
        CheckInWorkflow.selectSeat();
        BoardingPass.generate();
        System.out.println(AirlineMessages.DONE);
    }
}
