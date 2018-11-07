package com.yevheniiparfonov.hw13;

public class Main {
  public static void main(String[] args) {
    classCastException(10);
    nullPointerException(null);
    numberFormatException("hello world");
    arrayIndexOutOfBoundsException();
  }

  public static void classCastException(int x) {
    Object i = Integer.valueOf(x);
    String s = (String) i;
  }

  public static int nullPointerException(Integer i) {
    return i;
  }

  public static int numberFormatException(String s) {
    return Integer.valueOf(s);
  }

  public static int arrayIndexOutOfBoundsException() {
    int[] arr = {10, 20 ,30};
    return arr[4];
  }
}
