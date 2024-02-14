//name: Yedian Cheng
//email: cheng.yed@northeastern.edu
package finalproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimulationTest {
  private  Simulation simulation;

  @BeforeEach
  void setUp() {
    Integer numOfDriver = 50;
    Integer numOfRide = 100;
    simulation = new Simulation(numOfDriver, numOfRide);
  }

  @Test
  public void testSimulation() {
    assertNotNull(simulation);
  }

  @Test
  public void testGetAverageWaitingTime() {
    assertNotNull(simulation.getAverageWaitingTime());
  }

  @Test
  public void testGetAverageNumOfRidePerDriver() {
    assertEquals("2.00",simulation.getAverageNumOfRidePerDriver());
  }
}
