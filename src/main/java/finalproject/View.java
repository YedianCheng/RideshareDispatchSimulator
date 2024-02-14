//name: Yedian Cheng
//email: cheng.yed@northeastern.edu
package finalproject;
import java.util.Scanner;

/**
 * The View class provides user interface and output methods for the Ride Share Dispatch Simulator.
 * It displays information to the user and handles user inputs.
 */
public class View {
  private static final Scanner viewScanner = new Scanner(System.in);

  /**
   * Displays a welcome message to the user.
   */
  public static void welcome() {
    System.out.println("\nWelcome to the Ride Share Dispatch Simulator!");
  }

  /**
   * Displays information about the number of drivers and rides.
   * @param numOfDriver The number of drivers
   * @param numOfRides The number of rides
   */
  public static void inputDriverNumberAndRideNumber(Integer numOfDriver, Integer numOfRides) {
    System.out.println("\nIf there are " + numOfDriver + " drivers and " + numOfRides + " rides.");
  }

  /**
   * Prompts the user to input the number of drivers and returns the input as a string.
   * @return The user input as a string
   */
  public static String getDriverNumber() {
    System.out.println("\nWhat is the number of drivers you would like to simulate?");
    return viewScanner.nextLine();
  }

  /**
   * Prompts the user to input the number of rides and returns the input as a string.
   * @return The user input as a string
   */
  public static String getRideNumber() {
    System.out.println("\nWhat is the number of rides you would like to simulate?");
    return viewScanner.nextLine();
  }

  /**
   * Displays the average waiting time for rides to the user.
   * @param newSimulation The Simulation object containing simulation results
   */
  public static void outputAverageWaitingTime(Simulation newSimulation) {
    System.out.println("The average wait time for a ride is " +
        newSimulation.getAverageWaitingTime() + " minutes.");
  }

  /**
   * Displays the average number of rides handled by a driver to the user.
   * @param newSimulation The Simulation object containing simulation results
   */
  public static void outputAverageNumOfRidePerDriver(Simulation newSimulation) {
    System.out.println("The average number of rides a driver has handled is " +
        newSimulation.getAverageNumOfRidePerDriver() + ".");
  }

  /**
   * Displays an error message for invalid input to the user.
   */
  public static void outputInvalidInput() {
    System.out.println("Please enter a positive integer.");
  }
}

