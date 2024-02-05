package org.builder.models;

import org.builder.components.Engine;
import org.builder.components.Gps;
import org.builder.components.TripComputer;

public class ManualCar {
  private int seats;
  private Engine engine;
  private TripComputer tripComputer;
  private Gps gpsNavigator;

  public ManualCar(int seats, Engine engine,
                   TripComputer tripComputer, Gps gpsNavigator) {
    setSeats(seats);
    setEngine(engine);
    setTripComputer(tripComputer);
    setGpsNavigator(gpsNavigator);
  }

  public ManualCar() {
    this.seats = getSeats();
    this.engine = getEngine();
    this.tripComputer = getTripComputer();
    this.gpsNavigator = getGpsNavigator();

  }

  public int getSeats() {
    return seats;
  }

  public void setSeats(int seats) {
    this.seats = seats;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public TripComputer getTripComputer() {
    return tripComputer;
  }

  public void setTripComputer(TripComputer tripComputer) {
    this.tripComputer = tripComputer;
  }

  public Gps getGpsNavigator() {
    return gpsNavigator;
  }

  public void setGpsNavigator(Gps gpsNavigator) {
    this.gpsNavigator = gpsNavigator;
  }
}
