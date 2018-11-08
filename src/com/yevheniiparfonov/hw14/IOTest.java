package com.yevheniiparfonov.hw14;

import com.yevheniiparfonov.hw13.IO;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class IOTest {

  @Test
  void writeToFile() {
    FileOutputStream fileOutputStream = IO.writeToFile("file1");
    assertNotNull(fileOutputStream);
  }

  @Test
  void readFromFile() {
    FileInputStream fileInputStream = IO.readFromFile("file2");
    assertNotNull(fileInputStream);
  }
}