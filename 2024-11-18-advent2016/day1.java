import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class day1{
  public static void main(String[] args){
    System.out.println(solve("input.txt"));
    String[] data = parseStringArr2("input.txt");
    System.out.println(Arrays.toString(data));
    System.out.println(part2(data));
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
      int move;
      if (a.length() >= 3){
        move = Integer.parseInt(a.substring(1, a.length()-1));
      } else{
        move = Integer.parseInt((a.substring(1, 2)));
      }
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
  public static int part2(String[] arr){
    int x = 0;
    int y = 0;
    int[][] dir = {{0, 1}, {1,0}, {0, -1}, {-1,0}};
    int facing = 0;
    ArrayList<int[]> coords = new ArrayList<int[]>();
    coords.add(new int[]{0,0});
    for (int i = 0; i < arr.length; i++){
      int move = Integer.parseInt(arr[i].substring(1));
      if (arr[i].charAt(0) == 'R'){
        facing += 1;
      }else {
        facing -= 1;
      }
      facing = ((facing +4) % 4);
      for (int j = 0; j < move; j++) {
        x += dir[facing][0];
        y += dir[facing][1];
        for (int k = 0; k < coords.size(); k++){
          int[] temp = coords.get(k);
          for (int l = k + 1; l < coords.size(); l++){
            int[] temp2 = coords.get(l);
            if (temp[0] == temp2[0] && temp[1] == temp2[1]){
              return Math.abs(temp[0]) + Math.abs(temp[1]);
            }
          }
        }
        coords.add(new int[]{x,y});
      }
    }

    return 0;
  }
}
