package org.builder;

import org.builder.builders.CarBuilder;
import org.builder.components.Engine;
import org.builder.components.Gps;
import org.builder.components.TripComputer;
import org.builder.director.Director;
import org.builder.models.Car;

public class Main {

  public static void main(String[] args) {
    CarBuilder carBuilder = new CarBuilder();

    int seats = 4;
    Engine engine = Engine.ENGINE_V1;
    TripComputer tripComputer = TripComputer.TRIP_COMPUTER_1;
    Gps gps = Gps.GPS_P1;

    carBuilder.setSeats(seats);
    carBuilder.setEngine(engine);
    carBuilder.setTripComputer(tripComputer);
    carBuilder.setGps(gps);

    Car car = carBuilder.getResult();
    System.out.println(car);
  }
}