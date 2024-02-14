//name: Yedian Cheng
//email: cheng.yed@northeastern.edu
package finalproject;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;


class RideTest {
  private LocalDateTime testArrivalTime;
  private LocalDateTime testRequestedTime;
  private Ride testRide;
  private Ride otherRide;
  private Double lengthOfRide;


  @BeforeEach
  void setUp() {
    testArrivalTime = LocalDateTime.of(2023, 8, 15, 12, 0);
    testRequestedTime = LocalDateTime.of(2023, 8, 15, 11, 30);
    lengthOfRide = 10.0;
    testRide = new Ride(testArrivalTime, testRequestedTime, lengthOfRide);
  }

  @Test
  void testEquals_comparisonToSelf() {
    assertTrue(testRide.equals(testRide));
  }

  @Test
  public void testEquals_sameObject() {
    otherRide = new Ride(testArrivalTime, testRequestedTime, lengthOfRide);
    assertTrue(testRide.equals(otherRide));
  }

  @Test
  public void testEquals_Null() {
    assertNotNull(testRide);
  }

  @Test
  public void testEquals_differentClass() {
    assertFalse(testRide.equals(testArrivalTime));
  }

  @Test
  public void testEquals_differentArrivalTime() {
    LocalDateTime otherArrivalTime =  LocalDateTime.of(2023, 8, 15, 12, 1);
    otherRide = new Ride(otherArrivalTime, testRequestedTime, lengthOfRide);
    assertFalse(testRide.equals(otherRide));
  }

  @Test
  public void testEquals_differentRequestedTime() {
    LocalDateTime otherRequestedTime =  LocalDateTime.of(2023, 8, 15, 13, 1);
    otherRide = new Ride(testArrivalTime, otherRequestedTime, lengthOfRide);
    assertFalse(testRide.equals(otherRide));
  }

  @Test
  public void testEquals_differentLengthOfRide() {
    otherRide = new Ride(testArrivalTime,testRequestedTime, 12.0);
    assertFalse(testRide.equals(otherRide));
  }

  @Test
  public void testHashCode() {
    int expectedHashcode = Objects.hash(testRide.getArrivalTime(), testRide.getRequestedTime(), testRide.getLengthOfRide());
    assertEquals(expectedHashcode, testRide.hashCode());
  }

  @Test
  public void testToString() {
    String expectedToString = "Ride{arrivalTime=2023-08-15T12:00, requestedTime=2023-08-15T11:30, lengthOfRide=10.0}";
    assertEquals(expectedToString, testRide.toString());
  }

}