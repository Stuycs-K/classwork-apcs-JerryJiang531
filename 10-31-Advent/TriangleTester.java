import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  public static void main(String[] args){
    System.out.println(countTrianglesA("inputTri.txt"));
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
    return (a + b > c) && (a +c > b) && (b+c > a);
  }
  public static int countTrianglesB(String filename){
    int sum = 0;
    try{
      File file = new File(filename);//1
      Scanner input = new Scanner(file);
      String a = "";
      while (input.hasNextLine()){
        String temp1 = input.nextLine();
        String temp2 = input.nextLine();
        String temp3 = input.nextLine();
        for (int j = 0; j < 3; j++){
          a += temp1.nextInt();
          a += temp2.nextInt();
          a += temp3.nextInt();
        }
        if (isTriangle(a)){
          sum ++;
        }
      }

      input.close();
    }catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return sum;
  }
}
