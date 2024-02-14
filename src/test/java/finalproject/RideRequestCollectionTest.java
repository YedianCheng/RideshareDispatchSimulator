//name: Yedian Cheng
//email: cheng.yed@northeastern.edu
package finalproject;

import static org.junit.jupiter.api.Assertions.*;
import java.util.PriorityQueue;
import org.junit.jupiter.api.Test;

class RideRequestCollectionTest {

  @Test
  public void testCreateRideRequestCollection() {
    int rideRequestNumber = 5;
    PriorityQueue<RideRequest> rideRequestCollection = RideRequestCollection.createRideRequestCollection(rideRequestNumber);

    assertNotNull(rideRequestCollection);
    assertEquals(rideRequestNumber, rideRequestCollection.size());

  }
}