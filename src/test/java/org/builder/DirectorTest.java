package org.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.builder.builders.CarBuilder;
import org.builder.components.Engine;
import org.builder.components.Gps;
import org.builder.components.TripComputer;
import org.builder.director.Director;
import org.builder.models.Car;
import org.junit.Test;

public class DirectorTest {

  @Test
  public void testMakeSportCar() {
    int seats = 2;
    Engine engine = Engine.ENGINE_V2;
    TripComputer tripComputer = TripComputer.TRIP_COMPUTER_2;
    Gps gps = Gps.GPS_P2;

    Car expected = new Car(seats, engine, tripComputer, gps);

    CarBuilder carBuilder = new CarBuilder();
    Director director = new Director();

    director.makeSportCar(carBuilder);

    assertNotNull(carBuilder.getResult());
    assertEquals(2, carBuilder.getResult().getSeats());
    assertEquals(Engine.ENGINE_V2, carBuilder.getResult().getEngine());
  }
}
