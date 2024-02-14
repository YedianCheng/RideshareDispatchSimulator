//name: Yedian Cheng
//email: cheng.yed@northeastern.edu
package finalproject;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.PriorityQueue;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * Represents a simulation of a ride-sharing dispatch system.
 */
public class Simulation {

  private static final Integer AVERAGE_SPEED_MILE_PER_HOUR = 60;
  private static final Integer ONE_HOUR_TRANSFER_TO_MINUTES = 60;
  private final static Integer AVERAGE_WAITING_TIME_FROM_DRIVER_TO_PASSENGER = 5;

  private Integer totalWaitingTime;
  private Integer numOfRide;
  private Integer numOfDriver;

  /**
   * Constructs a Simulation instance with the specified number of drivers and rides.
   * @param numOfDriver The number of drivers.
   * @param numOfRide   The number of rides.
   */
  public Simulation(Integer numOfDriver, Integer numOfRide) {
    this.numOfRide = numOfRide;
    this.numOfDriver = numOfDriver;
    this.totalWaitingTime = 0;
    this.runSimulate();
  }

  /**
   * Runs the ride-sharing simulation.
   */
  public void runSimulate() {
    PriorityQueue<RideRequest> rideRequest = RideRequestCollection.createRideRequestCollection(this.numOfRide);
    PriorityQueue<Ride> currentlyActiveRides = RideCollection.initializeRideCollection(this.numOfDriver);

    while (!rideRequest.isEmpty()) {
      Random random = new Random();
      Integer waitingTime;
      RideRequest currentRideRequest = rideRequest.poll();
      Ride currentAvailableRide = currentlyActiveRides.poll();

      Integer DurationOfRide = (int) (currentRideRequest.getDistanceOfRide() / (AVERAGE_SPEED_MILE_PER_HOUR
                / ONE_HOUR_TRANSFER_TO_MINUTES));

      if (currentRideRequest.getTimeOfRequest().isAfter(currentAvailableRide.getArrivalTime())) {
        waitingTime = AVERAGE_WAITING_TIME_FROM_DRIVER_TO_PASSENGER;
      } else {
        waitingTime =(int) Duration.between(currentRideRequest.getTimeOfRequest(),currentAvailableRide.getArrivalTime()).toMinutes()+AVERAGE_WAITING_TIME_FROM_DRIVER_TO_PASSENGER;
      }

      this.totalWaitingTime += waitingTime;
      LocalDateTime newArrivalTime = currentRideRequest.getTimeOfRequest().plusMinutes(waitingTime).plusMinutes(DurationOfRide);
      Ride newRide = new Ride(newArrivalTime, currentRideRequest.getTimeOfRequest(), currentRideRequest.getDistanceOfRide());
      currentlyActiveRides.offer(newRide);
    }
  }

  /**
   * Calculates and returns the average waiting time for rides.
   * @return The average waiting time.
   */
  public String getAverageWaitingTime(){
    double result = (double)this.totalWaitingTime/this.numOfRide;
    DecimalFormat df = new DecimalFormat("0.00");
    String formattedResult = df.format(result);
    return formattedResult;
  }

  /**
   * Calculates and returns the average number of rides per driver.
   * @return The average number of rides per driver.
   */
  public  String getAverageNumOfRidePerDriver(){
    double result = (double) this.numOfRide/this.numOfDriver;
    DecimalFormat df = new DecimalFormat("0.00");
    String formattedResult = df.format(result);
    return formattedResult;
  }
}
