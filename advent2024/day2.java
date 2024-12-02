import java.io.*;
import java.util.*;
public class day3{ // replace with correct day
    public static void main(String[] args){
        String[] data = parseStringArr("inputDay3.txt"); // replace with correct day
        System.out.println(Arrays.toString(data));
        System.out.println(part1(data));
    }
    public static String[] parseStringArr(String filename){
      try {
          File file = new File(filename);
          Scanner input = new Scanner(file);
          String a = "";
          while (input.hasNextLine()){
            a += input.nextLine() + "\n";
          }
          String[] data = a.split("\n"); // replace with correct split parameter
          return data;
      }catch (FileNotFoundException e) {
          System.out.println("File not found");
      }
      return null;
    }
    public static int part1(String[] data){
      for (int i = 0; i < data.length; i++){
        int[] report = data[i].split(" ");
        for (int j = 0; j < report.length; j++){
          
        }
      }
    }
  }
