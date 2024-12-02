import java.io.*;
import java.util.*;
public class day2{ // replace with correct day
    public static void main(String[] args){
        String[] data = parseStringArr("inputDay2.txt"); // replace with correct day
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
        int count  = 0;
      for (int i = 0; i < data.length; i++){
        int[] report = parseIntArrString(data[i]);
        int[] sorted = Arrays.copyOf(report, report.length);
        Arrays.sort(sorted);
        boolean skibidi = false;
        boolean sigma = false;
          for (int k = 0; k < report.length; k++){
              if (report[k] == sorted[k]){
                  skibidi = true;
              }else{
                  skibidi = false;
                  break;
              }
          }
          if (!skibidi){
          int index = 0;
          for (int l = report.length -1;l >=0; l--){
              if (report[index] == sorted[l]){
                  skibidi = true;
              }else{
                  skibidi = false;
                  break;
              }
              index ++;
          }}
          if (skibidi) {
              for (int j = 1; j < report.length; j++) {
                  if (Math.abs(report[j] - report[j-1]) >= 1 && Math.abs(report[j] - report[j-1]) <= 3){
                      sigma = true;
                  }else{
                      sigma = false;
                      break;
                  }
              }
              if (sigma){
                  count += 1;
              }
          }
      }
      return count;
    }
    public static int[] parseIntArrString(String a){
        String[] arr = a.split(" ");
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            result[i] = Integer.parseInt(arr[i]);
        }
        return result;
    }
  }
