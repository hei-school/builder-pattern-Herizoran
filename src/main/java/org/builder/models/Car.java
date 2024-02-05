package org.builder.models;

import org.builder.components.Engine;
import org.builder.components.Gps;
import org.builder.components.TripComputer;

public class Car {
  private int seats;
  private Engine engine;
  private TripComputer tripComputer;
  private Gps gpsNavigator;

  public Car(int seats, Engine engine, TripComputer tripComputer,
             Gps gpsNavigator) {
    this.seats = seats;
    this.engine = engine;
    this.tripComputer = tripComputer;
    this.gpsNavigator = gpsNavigator;
  }

  public Car() {

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

  @Override
  public String toString() {
    return "Car{" + ", seats=" + seats + ", engine=" + engine +
        ", tripComputer=" + tripComputer + ", gpsNavigator=" + gpsNavigator + '}';
  }
}