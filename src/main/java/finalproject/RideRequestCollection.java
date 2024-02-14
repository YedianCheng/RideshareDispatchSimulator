//name: Yedian Cheng
//email: cheng.yed@northeastern.edu
package finalproject;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * The RideRequestCollection class is responsible for creating a collection of RideRequest objects
 * representing ride requests. It generates ride requests with random data and uses a priority queue
 * to store them based on their priority and request time.
 */
public class RideRequestCollection {
  private final static Integer THE_MAXIMUM_INSTANCE = 60;
  private final static Integer ONE_HOUR_TRANSFER_TO_MINUTES = 60;

  /**
   * Comparators to order ride requests based on their request time and type
   */
  private static Comparator<RideRequest> byTimeComparator = Comparator.comparing(RideRequest::getTimeOfRequest);
  private static Comparator<RideRequest> byTypeComparator = Comparator.comparingInt(r -> r.getTypeOfRide().getPriority());
  private static Comparator<RideRequest> comparator = byTypeComparator.thenComparing(byTimeComparator);

  /**
   * Creates a priority queue of RideRequest objects representing ride requests.
   * @param rideRequestNumber The number of ride requests to generate
   * @return A priority queue of RideRequest objects representing the ride requests
   */
  public static PriorityQueue<RideRequest> createRideRequestCollection (Integer rideRequestNumber) {
    Random random = new Random();
    PriorityQueue<RideRequest> rideRequestCollection = new PriorityQueue<>(RideRequestCollection.comparator);

    for (int i = 0; i < rideRequestNumber; i++) {
      String startLocation = Integer.toString(random.nextInt(9999)) + "hazel street";
      String desiredLocation = Integer.toString(random.nextInt(9999)) + "kings way";
      RideRequest rideRequest = new RideRequest(i, startLocation, desiredLocation,
          random.nextDouble() * THE_MAXIMUM_INSTANCE,
          LocalDateTime.now().minusMinutes(random.nextInt(ONE_HOUR_TRANSFER_TO_MINUTES)),
          TypeOfRide.values()[random.nextInt(TypeOfRide.values().length)]);
      rideRequestCollection.offer(rideRequest);
    }
    return rideRequestCollection;
  }
}
