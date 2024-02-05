package org.builder.builders;

import org.builder.components.Engine;
import org.builder.components.Gps;
import org.builder.components.TripComputer;
import org.builder.models.Car;

public class CarBuilder implements Builder{
  private Car car;

  public CarBuilder() {
    reset();
  }

  public void reset() {
    car = new Car();
  }

  public void setSeats(int seats) {
    car.setSeats(seats);
  }

  public void setEngine(Engine engine) {
    car.setEngine(engine);
  }

  public void setTripComputer(TripComputer tripComputer) {
    car.setTripComputer(tripComputer);
  }

  public void setGps(Gps gps) {
    car.setGpsNavigator(gps);
  }

  public Car getResult() {
    return car;
  }
}
