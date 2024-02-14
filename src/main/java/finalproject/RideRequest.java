//name: Yedian Cheng
//email: cheng.yed@northeastern.edu
package finalproject;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Represents a ride request in the rideshare dispatch simulator.
 */
public class RideRequest {

  private Integer customerID;
  private String startingLocation;
  private String desiredLocation;
  private Double distanceOfRide;
  private LocalDateTime timeOfRequest;
  private TypeOfRide typeOfRide;

  /**
   * Constructs a RideRequest instance with specified details.
   * @param customerID       The unique identifier of the customer.
   * @param startingLocation The starting location of the ride request.
   * @param desiredLocation  The desired destination of the ride request.
   * @param distanceOfRide   The anticipated distance of the ride.
   * @param timeOfRequest    The time when the ride request was made.
   * @param typeOfRide       The type of the ride request.
   */
  public RideRequest(Integer customerID, String startingLocation, String desiredLocation,
      Double distanceOfRide, LocalDateTime timeOfRequest, TypeOfRide typeOfRide) {
    this.customerID = customerID;
    this.startingLocation = startingLocation;
    this.desiredLocation = desiredLocation;
    this.distanceOfRide = distanceOfRide;
    this.timeOfRequest = timeOfRequest;
    this.typeOfRide = typeOfRide;
  }

  /**
   * Get the unique identifier of the customer.
   * @return The customer's ID.
   */
  public Integer getCustomerID() {
    return customerID;
  }

  /**
   * Get the starting location of the ride request.
   * @return The starting location.
   */
  public String getStartingLocation() {
    return startingLocation;
  }

  /**
   * Get the desired destination of the ride request.
   * @return The desired destination.
   */
  public String getDesiredLocation() {
    return desiredLocation;
  }

  /**
   * Get the anticipated distance of the ride.
   * @return The distance of the ride.
   */
  public Double getDistanceOfRide() {
    return distanceOfRide;
  }


  /**
   * Get the time when the ride request was made.
   * @return The time of the ride request.
   */
  public LocalDateTime getTimeOfRequest() {
    return timeOfRequest;
  }

  /**
   * Get the type of the ride request.
   * @return The type of the ride request.
   */
  public TypeOfRide getTypeOfRide() {
    return typeOfRide;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof RideRequest that)) {
      return false;
    }
    return Objects.equals(getCustomerID(), that.getCustomerID())
        && Objects.equals(getStartingLocation(), that.getStartingLocation())
        && Objects.equals(getDesiredLocation(), that.getDesiredLocation())
        && Objects.equals(getDistanceOfRide(), that.getDistanceOfRide())
        && Objects.equals(getTimeOfRequest(), that.getTimeOfRequest())
        && Objects.equals(getTypeOfRide(), that.getTypeOfRide());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCustomerID(), getStartingLocation(), getDesiredLocation(),
        getDistanceOfRide(), getTimeOfRequest(), getTypeOfRide());
  }

  @Override
  public String toString() {
    return "RideRequest{" +
        "customerID=" + customerID +
        ", startingLocation='" + startingLocation + '\'' +
        ", desiredLocation='" + desiredLocation + '\'' +
        ", distanceOfRide=" + distanceOfRide +
        ", timeOfRequest=" + timeOfRequest +
        ", typeOfRide=" + typeOfRide +
        '}';
  }
}