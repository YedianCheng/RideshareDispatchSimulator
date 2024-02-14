//name: Yedian Cheng
//email: cheng.yed@northeastern.edu

package finalproject;

/**
 * The RideShareDispatchSimulator class is the entry point for running the ride-share dispatch simulation.
 * It interacts with the user through the View class to input the number of drivers and ride requests,
 * and then runs the simulation with various configurations to output the results.
 */
public class RideShareDispatchSimulator {

  private static final Integer NUM_OF_COMMAND = 1;
  private static final String DIGIT_PATTERN = "\\d+";

  /**
   * The main method of the simulation program.
   * @param args Command line arguments
   */
  public static void main(String[] args) {

    View.welcome();

    // Simulate with pre-defined values
    View.inputDriverNumberAndRideNumber(50, 25);
    Simulation newSimulation = new Simulation(50, 25);
    View.outputAverageWaitingTime(newSimulation);
    View.outputAverageNumOfRidePerDriver(newSimulation);

    View.inputDriverNumberAndRideNumber(50, 100);
    Simulation newSimulation2 = new Simulation(50, 100);
    View.outputAverageWaitingTime(newSimulation2);
    View.outputAverageNumOfRidePerDriver(newSimulation2);

    View.inputDriverNumberAndRideNumber(50, 250);
    Simulation newSimulation3 = new Simulation(50, 250);
    View.outputAverageWaitingTime(newSimulation3);
    View.outputAverageNumOfRidePerDriver(newSimulation3);

    // Input number of drivers
    String userInput_numOfDriver = View.getDriverNumber();
    while (!userInput_numOfDriver.matches(DIGIT_PATTERN) || Integer.parseInt(userInput_numOfDriver) <= 0){
      View.outputInvalidInput();
      userInput_numOfDriver = View.getDriverNumber();
    }
    Integer numOfDriver = Integer.parseInt(userInput_numOfDriver);

    // Input number of ride requests
    String userInput_numOfRide = View.getRideNumber();
    while (!userInput_numOfRide.matches(DIGIT_PATTERN) || Integer.parseInt(userInput_numOfRide) <= 0){
      View.outputInvalidInput();
      userInput_numOfRide = View.getRideNumber();
    }
    Integer numOfRide = Integer.parseInt(userInput_numOfRide);
    Simulation newSimulation4 = new Simulation(numOfRide, numOfDriver);
    View.outputAverageWaitingTime(newSimulation4);
    View.outputAverageNumOfRidePerDriver(newSimulation4);
  }
}