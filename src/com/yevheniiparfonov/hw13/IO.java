package com.yevheniiparfonov.hw13;

import java.io.*;
import java.util.Scanner;

public class IO {
  public static void main(String[] args) {

    String[] fileNames = new String[3];
    for(int i = 0; i < 3; i++){
      fileNames[i] = getFile();
    }

    FileOutputStream fis = writeToFile(fileNames[0]);
    FileInputStream fos2 = readFromFile(fileNames[1]);
    FileInputStream fos3 = readFromFile(fileNames[2]);

    try {
      byte[] buffer1 = new byte[fos2.available()];
      byte[] buffer2 = new byte[fos3.available()];

      fos2.read(buffer1, 0, buffer1.length);
      fos3.read(buffer2, 0, buffer2.length);

      fis.write(buffer1);
      fis.write(buffer2);

    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
  }

  /*
    Scan file names without file extension
   */
  public static String getFile() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

  public static FileOutputStream writeToFile(String fileName) {
    FileOutputStream fileOutputStream;
    try {
      fileOutputStream = new FileOutputStream(fileName + ".txt");
      return fileOutputStream;
    } catch (FileNotFoundException ex) {
      System.out.println("File " + fileName + " not found");
      return null;
    }
  }

  public static FileInputStream readFromFile(String fileName) {
    FileInputStream fileInputStream;
    try {
      fileInputStream = new FileInputStream(fileName + ".txt");
      return fileInputStream;
    } catch (FileNotFoundException ex) {
        System.out.println("File" + fileName + "not found");
      return null;
    }
  }
}
