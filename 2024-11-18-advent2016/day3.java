// I forgot I already did 2016 day 3 advent of code, so I'm using it as a template for my other advent of code instead
// repeatable code for advent of code
import java.io.*;
import java.util.*;
public class day3{ // replace with correct day
    public static void main(String[] args){
        String[] data = parseStringArr("inputDay3.txt"); // replace with correct day
        System.out.println(Arrays.toString(data));
        System.out.println(solve(data));
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
    public static int solve(String[] data){ // replace with correct return type
      return 0;
    }
}
