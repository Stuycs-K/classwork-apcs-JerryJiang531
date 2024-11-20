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
    public static String[] parseStringArr2(String filename){
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            String a = input.nextLine();
            String[] data = a.split(", "); // replace with correct split parameter
            return data;
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return null;
    }
    public static String[] parseStringArrCol(String filename) {
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            String a = "";
            while (input.hasNextLine()) {
                a += input.nextLine() + "\n";
            }
            String[] data = a.split("\n");
            int len = data[0].length();// replace with correct split parameter
            String[] data1 = new String[len];
            for (int i = 0; i < data1.length; i++){
                data1[i] = "";
            }
            for (int j = 0; j < data1.length; j++){
                for (int k = 0; k < data.length; k++){
                    data1[j] += "" + data[k].charAt(j);
                }
            }
            return data1;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return null;
    }
    public static String most(String a){
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] count = new int[26];
        for (int i = 0; i < a.length(); i++){
            for (int j = 0; j < alphabet.length; j++){
                if (a.charAt(i) == alphabet[j]){
                    count[j]++;
                }
            }
        }
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < count.length; i++){
            if (count[i] > max){
                max = count[i];
                maxIndex = i;
            }
        }
        return "" + alphabet[maxIndex];
    }
    public static int solve(String[] data){ // replace with correct return type
      return 0;
    }
}
