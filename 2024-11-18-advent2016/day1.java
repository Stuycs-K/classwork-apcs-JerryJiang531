import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class day1{
  public static void main(String[] args){
    System.out.println(solve("input.txt"));
  }
  public static int solve(String filename){
    int x = 0;
    int y = 0;
    String[] arr = {"North", "East", "South", "West"};
    String facing = arr[0];
    int facingIndex = 0;
    try{
    File file = new File(filename); 
    Scanner input = new Scanner(file);
    while (input.hasNext()){
      String a = input.next();
      System.out.println(a);
      int move;
      if (a.length() >= 3){
        move = Integer.parseInt(a.substring(1, a.length()-1));
      } else{
        move = Integer.parseInt((a.substring(1, 2)));
      }
      System.out.println(move);
      if ((a.substring(0,1).equals("R"))){
        if (facingIndex == 3){
          facingIndex = 0;
        }else{
          facingIndex += 1;
        }
        facing = arr[facingIndex];
      }else if (a.substring(0,1).equals("L")){
        if (facingIndex == 0){
          facingIndex = 3;
        }else{
          facingIndex -= 1;
        }
        facing = arr[facingIndex];
      }
      if (facing.equals("North")){
        y += move;
      }else if (facing.equals("South")){
        y -= move;
      }else if (facing.equals("East")){
        x += move;
      }else if (facing.equals("West")){
        x -= move;
      }
    }
    input.close();
  }catch(FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return Math.abs(x) + Math.abs(y);
  }
}
