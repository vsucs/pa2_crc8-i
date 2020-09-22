import java.io.*;
import java.nio.*;
import java.nio.file.*;

public class CRC8 {
  public static void printByteCodes(byte[] data) {
    int n = 0;
    for (byte b : data) {
      String st = String.format("0x%02x ", b);
      System.out.print(st);
      if(n % 16 == 7)
        System.out.print(" ");
      if(n % 16 == 15)
        System.out.println();
      n++;
    }
  }
  
  public static byte crc8(byte[] data){
    // put your code here to compute crc8
    byte crc = 0;
    
    return crc;
  }

  public static void main(String[] args){
    if(args.length < 2)
      System.out.println("Usage: java CRC8 [input path] [output path]");
    else{
      String inputPath = args[0];
      String outputPath = args[1];

      byte[] data = {};
      byte[] data_w_crc = {};
      // Read data
      try{
        data = Files.readAllBytes(Paths.get(inputPath));
      } catch (IOException e) {
        e.printStackTrace();
      }
      System.out.println("\nData");
      printByteCodes(data);

      // Calculate crc8
      byte crc = crc8(data);
      System.out.println("\ncrc = " + String.format("0x%02x ", crc));

      // Combine input and crc to generate output file
      //data_w_crc = 
      
      System.out.println("\nOutput");
      printByteCodes(data_w_crc);

      // Write output
      try{
        Files.write(Paths.get(outputPath), data_w_crc, StandardOpenOption.CREATE);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}