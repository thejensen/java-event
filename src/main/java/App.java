import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Welcome to Sara's Event Planning Services, LLC. You'll be pleased to know we cater to all tastes and sizes. First, the event space is $1000 flat and customizable from there! We just need to know the number of people invited as well as your preferences for food, entertainment and alcohol. Let's plan a party! Ready? y/n");
    String readyOrNot = console.readLine();
    if ( readyOrNot.equals("y") ) {
      System.out.println("Number of invited persons: \nFor 0-50 persons, enter 0. \nFor 51-100 persons, enter 1. \nFor 101+ persons, enter 2.");
      Integer peopleCountInput = Integer.parseInt(console.readLine());
      System.out.println("Entertainment: \nTo party in silence, enter 0. \nFor my cousin the DJ, enter 1. \nFor my father-in-law's Phish cover band, enter 2.");
      Integer entertainmentInput = Integer.parseInt(console.readLine());
      System.out.println("Food provided: \nTo forgo catering, enter 0. \nFor light snacks, enter 1. \nFor dinner, enter 2.");
      Integer foodInput = Integer.parseInt(console.readLine());
      System.out.println("Alcohol: \nFor a dry event, enter 0. \nFor beer and wine only, enter 1. \nFor a full bar tended by yours truly, enter 2.");

      Integer alcoholInput = Integer.parseInt(console.readLine());
      Event event = new Event(peopleCountInput, entertainmentInput, foodInput, alcoholInput);
      Integer finalTotal = 1000 + event.calculatePeopleCost() + event.calculateEntertainmentCost() + event.calculateFoodCost() +  event.calculateAlcoholCost();

      System.out.println("Your total is: $" + finalTotal + ". I've already withdrawn it from your account. Cheers!");

    } else if ( readyOrNot.equals("n") ) {
      System.out.println("We'll be here. Don't be stranger! Please reload this program and enter y next time.");
    } else {
      System.out.println("Way to go butterfingers. Please reload this program and enter y to get started. ;)");
    }
  }
}
