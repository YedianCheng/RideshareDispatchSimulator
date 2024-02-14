//name: Yedian Cheng
//email: cheng.yed@northeastern.edu
package finalproject;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * The RideCollection class is responsible for initializing a collection of Ride objects
 * for a given number of drivers. It uses a priority queue to store rides based on their
 * arrival times.
 */
public class RideCollection {

  private static final Integer ONE_HOUR_TRANSFER_TO_MINUTES = 60;

  /**
   * Comparator to compare rides based on their arrival times
   */
  private static Comparator<Ride> byArrivalTimeComparator = Comparator.comparing(
      Ride::getArrivalTime);

  /**
   * Initializes a priority queue of Ride objects representing rides for a given number of drivers.
   * @param driverNumber The number of drivers for which to initialize rides
   * @return A priority queue of Ride objects representing the rides for the drivers
   */
  public static PriorityQueue<Ride> initializeRideCollection(Integer driverNumber) {
    Random random = new Random();
    PriorityQueue<Ride> rideQueue = new PriorityQueue<>(RideCollection.byArrivalTimeComparator);

    for (int i = 0; i < driverNumber; i++) {
      Ride newRide = new Ride(
          LocalDateTime.now().minusMinutes(random.nextInt(ONE_HOUR_TRANSFER_TO_MINUTES)));
      rideQueue.offer(newRide);
    }

    return rideQueue;
  }
}