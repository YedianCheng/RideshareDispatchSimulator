//name: Yedian Cheng
//email: cheng.yed@northeastern.edu
package finalproject;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Objects;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RideRequestTest {
  private LocalDateTime testTimeOfRequest;
  private TypeOfRide testTypeOfRide;
  private RideRequest testRideRequest;
  private RideRequest otherRideRequest;

  @BeforeEach
  void setUp() {
    testTimeOfRequest = LocalDateTime.of(2023, 8, 15, 10, 0);
    testTypeOfRide = TypeOfRide.STANDARD_PICK_UP;
    testRideRequest = new RideRequest(1, "123 Main St", "456 Elm St",10.0,
        testTimeOfRequest, testTypeOfRide);
  }

  @Test
  void testEquals_comparisonToSelf() {
    assertTrue(testRideRequest.equals(testRideRequest));
  }

  @Test
  public void testEquals_sameObject() {
    otherRideRequest = new RideRequest(1, "123 Main St", "456 Elm St",10.0,
        testTimeOfRequest, testTypeOfRide);
    assertTrue(testRideRequest.equals(testRideRequest));
  }

  @Test
  public void testEquals_Null() {
    assertNotNull(testRideRequest);
  }

  @Test
  public void testEquals_differentClass() {
    assertFalse(testRideRequest.equals(testTimeOfRequest));
  }

  @Test
  public void testEquals_differentID() {
    otherRideRequest = new RideRequest(2, "123 Main St", "456 Elm St",10.0,
        testTimeOfRequest, testTypeOfRide);
    assertFalse(testRideRequest.equals(otherRideRequest));
  }

  @Test
  public void testEquals_differentStartingLocation() {
    otherRideRequest = new RideRequest(1, "122 Main St", "456 Elm St",10.0,
        testTimeOfRequest, testTypeOfRide);
    assertFalse(testRideRequest.equals(otherRideRequest));
  }

  @Test
  public void testEquals_differentDesiredLocation() {
    otherRideRequest = new RideRequest(1, "123 Main St", "466 Elm St",10.0,
        testTimeOfRequest, testTypeOfRide);
    assertFalse(testRideRequest.equals(otherRideRequest));
  }

  @Test
  public void testEquals_differentDistanceOfRide() {
    otherRideRequest = new RideRequest(1, "123 Main St", "456 Elm St",10.1,
        testTimeOfRequest, testTypeOfRide);
    assertFalse(testRideRequest.equals(otherRideRequest));
  }

  @Test
  public void testEquals_differentTimeOfRequest() {
    LocalDateTime otherTimeOfRequest =  LocalDateTime.of(2023, 9, 15, 10, 2);
    otherRideRequest = new RideRequest(1, "123 Main St", "456 Elm St",10.0,
        otherTimeOfRequest, testTypeOfRide);
    assertFalse(testRideRequest.equals(otherRideRequest));
  }

  @Test
  public void testEquals_differentTypeOfRide() {
    TypeOfRide otherTypeOfRide = TypeOfRide.ENVIRONMENTALLY_CONSCIOUS_PICK_UP;
    otherRideRequest = new RideRequest(1, "123 Main St", "456 Elm St",10.0,
        testTimeOfRequest, otherTypeOfRide);
    assertFalse(testRideRequest.equals(otherRideRequest));
  }

  @Test
  public void test_Hashcode(){
    int expectedHashcode = Objects.hash(testRideRequest.getCustomerID(), testRideRequest.getStartingLocation(), testRideRequest.getDesiredLocation(),
        testRideRequest.getDistanceOfRide(), testRideRequest.getTimeOfRequest(), testRideRequest.getTypeOfRide());
    assertEquals(expectedHashcode, testRideRequest.hashCode());
  }

  @Test
  public void test_ToString() {
    String expectedToString = "RideRequest{customerID=1, startingLocation='123 Main St', desiredLocation='456 Elm St', "
        + "distanceOfRide=10.0, timeOfRequest=2023-08-15T10:00, typeOfRide=STANDARD_PICK_UP}";
    assertEquals(expectedToString, testRideRequest.toString());
  }




}