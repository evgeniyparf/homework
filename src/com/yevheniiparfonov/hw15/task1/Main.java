package com.yevheniiparfonov.hw15.task1;

import com.yevheniiparfonov.hw15.task1.Train.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ArrayList<Carriage> carriages = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter carriages [ 1 - passenger 1cl, 2 - passenger 2cl, 3 - cargo, 4 - quit]");

    carriage:
    for (; ; ) {
      int type = scanner.nextInt();
      switch (type) {
        case 1:
          carriages.add(createPassengerCarriage(1));
          break;
        case 2:
          carriages.add(createPassengerCarriage(2));
          break;
        case 3:
          carriages.add(createCargoCarriage());
          break;
        case 4:
          break carriage;
        default:
          System.out.println("carriage doesn't exist");
          break;
      }
    }

    System.out.print("Enter location A: ");
    String locationA = new Scanner(System.in).nextLine();
    System.out.println();
    System.out.print("Enter location B: ");
    String locationB = new Scanner(System.in).nextLine();
    System.out.println();

    Train train = new Train(locationA, locationB, new BaseCarriage(), carriages);
    System.out.println(train.toString());
  }

  public static PassengerCarriage createPassengerCarriage(int clazz) {
    return new PassengerCarriage(clazz, new Random().nextInt(PassengerCarriage.MAX_CAPACITY * clazz));
  }

  public static CargoCarriage createCargoCarriage() {
    return new CargoCarriage(new Random().nextInt(CargoCarriage.MAX_CAPACITY));
  }
}
