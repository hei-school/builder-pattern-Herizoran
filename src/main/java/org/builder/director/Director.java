package org.builder.director;

import org.builder.builders.Builder;
import org.builder.components.Engine;

public class Director {
  public void makeSportCar(Builder builder) {
    builder.setSeats(2);
    builder.setEngine(Engine.ENGINE_V2);
  }
}
