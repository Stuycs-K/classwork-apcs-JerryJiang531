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
}
