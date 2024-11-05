import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  public static void main(String[] args){
    System.out.println(countTrianglesB("inputTri.txt"));
  }
  public static int countTrianglesA(String filename){
    int sum = 0;
    try{
    File file = new File(filename);//1
      Scanner input = new Scanner(file);
      while (input.hasNextLine()){
        if (isTriangle(input.nextLine())){
          sum ++;
        }
      }
      input.close();
    }catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return sum;

  }
  public static boolean isTriangle(String line){
    Scanner sc = new Scanner(line);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    sc.close();
    return (a + b > c) && (a +c > b) && (b+c > a);
  }
  public static int countTrianglesB(String filename){
    int sum = 0;
    try{
      File file = new File(filename);//1
      Scanner input = new Scanner(file);

      while (input.hasNextLine()){
          String a = "";
          String[][] arr = new String[3][3];
          for (int i = 0; i < 3; i ++){
            arr[i][0] = input.next();
            arr[i][1] = input.next();
            arr[i][2] = input.next();
          }
          for (int k = 0; k < 3; k ++){
            a += arr[0][k] + " " + arr[1][k] + " " + arr[2][k];
            if (isTriangle(a)) {
              sum++;
            }
            a = "";
          }

      }
      input.close();
    }catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return sum;
  }
}
