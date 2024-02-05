package org.builder;

import org.builder.builders.Builder;
import org.builder.builders.CarBuilder;
import org.builder.components.Engine;
import org.builder.components.Gps;
import org.builder.components.TripComputer;
import org.builder.models.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CarBuilderTest {

    private Builder carBuilder;

    @Before
    public void setUp() {
        carBuilder = new CarBuilder();
    }

    @Test
    public void testCarBuilder() {
        int seats = 4;
        Engine engine = Engine.ENGINE_V1;
        TripComputer tripComputer = TripComputer.TRIP_COMPUTER_1;
        Gps gps = Gps.GPS_P1;

        carBuilder.setSeats(seats);
        carBuilder.setEngine(engine);
        carBuilder.setTripComputer(tripComputer);
        carBuilder.setGps(gps);

        Car car = ((CarBuilder) carBuilder).getResult();

        assertNotNull(car);
        assertEquals(seats, car.getSeats());
        assertEquals(engine, car.getEngine());
        assertEquals(tripComputer, car.getTripComputer());
        assertEquals(gps, car.getGpsNavigator());
    }
}
