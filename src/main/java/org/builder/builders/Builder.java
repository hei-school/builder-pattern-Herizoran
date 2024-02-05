package org.builder.builders;


import org.builder.components.Engine;
import org.builder.components.Gps;
import org.builder.components.TripComputer;

public interface Builder {
  public void reset();

  public void setSeats(int seats);

  public void setEngine(Engine engine);

  public void setTripComputer(TripComputer tripComputer);

  public void setGps(Gps gps);
}
