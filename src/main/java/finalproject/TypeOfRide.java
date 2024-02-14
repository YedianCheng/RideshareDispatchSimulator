//name: Yedian Cheng
//email: cheng.yed@northeastern.edu
package finalproject;

/**
 * The TypeOfRide enum represents different types of ride requests in the ride share simulation.
 * Each type of ride request has a priority associated with it, with higher priority values indicating
 * higher priority for assignment to drivers.
 */
public enum TypeOfRide {
  /**
   * Express pick-up (highest priority)
   */
  EXPRESS_PICK_UP(1),
  /**
   * Standard pick-up
   */
  STANDARD_PICK_UP(2),
  /**
   * Wait-and-save pick-up
   */
  WAIT_AND_SAVE_PICK_UP(3),
  /**
   * Environmentally conscious pick-up (lowest priority)
   */
  ENVIRONMENTALLY_CONSCIOUS_PICK_UP(4);

  private final int priority;

  /**
   * Constructor for the TypeOfRide enum.
   * @param priority The priority value associated with the ride type
   */
  TypeOfRide(int priority) {
    this.priority = priority;
  }

  /**
   * Gets the priority value associated with the ride type.
   * @return The priority value
   */
  public int getPriority() {
    return priority;
  }

  }
