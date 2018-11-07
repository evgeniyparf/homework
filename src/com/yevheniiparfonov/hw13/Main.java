package com.yevheniiparfonov.hw13;

public class Main {
  public static void main(String[] args) {
    classCastException(10);
    nullPointerException(null);
    numberFormatException("hello world");
    arrayIndexOutOfBoundsException(4);
  }

  // try/catch
  public static void classCastException(int x) {
    Object i = Integer.valueOf(x);
    try {
      String s = (String) i;
    } catch (ClassCastException cce) {
      cce.printStackTrace();
    }
  }

  public static int nullPointerException(Integer i) {
    if(i == null) throw new NullPointerException("i can't be 'null'");
    return i;
  }

  //  try/catch
  public static int numberFormatException(String s) {
    try {
      return Integer.valueOf(s);
    } catch (NumberFormatException ex) {
      ex.printStackTrace();
      return 0;
    }
  }

  public static int arrayIndexOutOfBoundsException(int n) {
    int[] arr = {10, 20 ,30};
    if(n < 0 || n >= arr.length)
      throw new ArrayIndexOutOfBoundsException("n must be less then " + arr.length + " or greater than 0");
    return arr[4];
  }
}
