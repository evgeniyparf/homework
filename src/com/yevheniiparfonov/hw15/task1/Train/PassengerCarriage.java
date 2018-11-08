package com.yevheniiparfonov.hw15.task1.Train;

public class PassengerCarriage extends Carriage {

  public static final int MAX_CAPACITY = 100;

  private int trainClass;
  private int passengers;

  public PassengerCarriage(int pssngrClass, int passengers) {
    if (pssngrClass > 0 && pssngrClass <= 2) {
      this.trainClass = pssngrClass;
      if (passengers <= MAX_CAPACITY * pssngrClass)
        this.passengers = passengers;
      else {
        throw new IllegalArgumentException("Capacity overload");
      }
    }
  }

  public void setPassengers(int passengers) {
    this.passengers = passengers;
  }

  public int getPassengers() {
    return passengers;
  }

  public void setTrainClass(int trainClass) {
    this.trainClass = trainClass;
  }

  public int getTrainClass() {
    return trainClass;
  }

  @Override
  public String toString() {
    return "=[:passngr:" + trainClass + "cl:" + passengers + "]";
  }
}
