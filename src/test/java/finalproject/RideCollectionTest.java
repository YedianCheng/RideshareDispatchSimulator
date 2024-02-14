//name: Yedian Cheng
//email: cheng.yed@northeastern.edu
package finalproject;

import static org.junit.jupiter.api.Assertions.*;
import java.util.PriorityQueue;
import org.junit.jupiter.api.Test;

class RideCollectionTest {

  @Test
  public void testInitializeRideCollection() {
    int driverNumber = 5;
    PriorityQueue<Ride> rideQueue = RideCollection.initializeRideCollection(driverNumber);

    assertNotNull(rideQueue);
    assertEquals(driverNumber, rideQueue.size());
  }
}