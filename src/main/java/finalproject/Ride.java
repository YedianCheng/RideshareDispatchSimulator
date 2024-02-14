//name: Yedian Cheng
//email: cheng.yed@northeastern.edu
package finalproject;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Represents a ride in the ride-share dispatch simulator.
 */
public class Ride {
  private LocalDateTime arrivalTime;
  private LocalDateTime requestedTime;
  private Double lengthOfRide;

  /**
   * Constructs a Ride instance with specified arrival time, requested time, and length of ride.
   * @param arrivalTime   The time the ride arrives at its destination.
   * @param requestedTime The time when the ride was requested.
   * @param lengthOfRide  The length of the ride in miles.
   */
  public Ride(LocalDateTime arrivalTime, LocalDateTime requestedTime, Double lengthOfRide) {
    this.arrivalTime = arrivalTime;
    this.requestedTime = requestedTime;
    this.lengthOfRide = lengthOfRide;
  }

  /**
   * Constructs a Ride instance with the specified arrival time.
   * @param arrivalTime The time the ride arrives at its destination.
   */
  public Ride(LocalDateTime arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  /**
   * Get the arrival time of the ride.
   * @return The arrival time.
   */
  public LocalDateTime getArrivalTime() {
    return arrivalTime;
  }

  /**
   * Get the requested time of the ride.
   * @return The requested time.
   */
  public LocalDateTime getRequestedTime() {
    return requestedTime;
  }

  /**
   * Get the length of the ride.
   * @return The length of the ride in miles.
   */
  public Double getLengthOfRide() {
    return lengthOfRide;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Ride ride)) {
      return false;
    }
    return Objects.equals(getArrivalTime(), ride.getArrivalTime())
        && Objects.equals(getRequestedTime(), ride.getRequestedTime())
        && Objects.equals(getLengthOfRide(), ride.getLengthOfRide());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getArrivalTime(), getRequestedTime(), getLengthOfRide());
  }

  @Override
  public String toString() {
    return "Ride{" +
        "arrivalTime=" + arrivalTime +
        ", requestedTime=" + requestedTime +
        ", lengthOfRide=" + lengthOfRide +
        '}';
  }
}
