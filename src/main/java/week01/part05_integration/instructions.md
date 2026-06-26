# Part 5 — Airline App (Integration)

You will create ONE new Java file and write a whole class yourself.

## What you practice
- Writing a class from scratch (new file + correct package)
- Writing a `main` method
- Calling methods across multiple classes
- Using constants from another class
- Producing output in the correct order

---

## Your task

1) Create this new file:

src/main/java/week01/part05_integration/AirportScreen.java

2) In that file, write a class named `AirportScreen` in this package:

package week01.part05_integration;

3) Add this method to your class:
- public static void showTitle()
- It must print exactly ONE line using:
  AirlineMessages.TITLE

4) Update `AirlineApp.runCheckIn()` so it prints the required output in order.

Rules:
- Use println for each line
- Use ONLY constants from AirlineMessages (no hardcoded strings)
- runCheckIn() must call methods from OTHER classes for at least two steps:
  - AirportScreen.showTitle()
  - CheckInWorkflow.enterPassengerDetails()
  - CheckInWorkflow.selectSeat()
  - BoardingPass.generate()

---

## Required output (exact)

Airline Check-In  
Starting check-in.  
Passenger details entered.  
Seat selected.  
Boarding pass ready.  
Check-in complete.

---

## How to run tests

From the project root:

macOS / Linux:
./gradlew test

Windows:
gradlew test

Fix any test failures until all tests pass.
