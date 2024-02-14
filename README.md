# RideshareDispatchSimulator

This is a Java-based Rideshare Dispatch Simulator. This innovative simulator aims to provide invaluable insights into our customers' riding experiences, addressing critical aspects such as wait times, average ride durations, and optimal driver deployment.

The simulation is event-driven, modeling ride requests through a user-entered number of available drivers. Upon a new ride request, the system tracks customer details, including starting and desired locations, anticipated ride distance, request time, and ride type (Express, Standard, Wait-and-save, Environmentally conscious). Priority assignment rules based on ride type and distance are implemented to optimize customer service.

The simulator seamlessly handles scenarios where available drivers can immediately take on new rides or when customers need to wait due to driver unavailability. Customers are assigned to freed-up drivers based on priority, with those having the same priority served in order of arrival.

Utilizing a priority queue for ride requests and currently active rides, the simulator supports two event types: Ride Requested and Ride Finished. The simulation outputs essential metrics on the command line for each scenario, including average wait time and average rides per driver.

Simulation Scenarios:

50 drivers and 25 rides
50 drivers and 100 rides
50 drivers and 250 rides
This Rideshare Dispatch Simulator provides a robust framework for analyzing and optimizing our ride-sharing operations, offering a glimpse into the dynamic world of customer convenience and operational efficiency.
