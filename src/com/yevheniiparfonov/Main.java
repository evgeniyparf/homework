package com.yevheniiparfonov;

import com.sun.javafx.UnmodifiableArrayList;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Queue<Integer> integerQueue = new PriorityQueue<>();
    integerQueue.add(4);
    integerQueue.add(2);
    integerQueue.add(7);
    integerQueue.add(1);

    for (Integer i : integerQueue) {
      System.out.println(i);
    }


  }
}
