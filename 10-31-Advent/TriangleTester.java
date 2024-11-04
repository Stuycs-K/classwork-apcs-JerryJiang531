import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  public static void main(String[] args){
    System.out.println(isTriangle("3 4 5"));
  }
  public static int countTrianglesA(String filename){
    // File file = new File(filename);//1
    //   // Scanner input = new Scanner(file);
    //   //CODE THAT SCANS THE FILE.
    //   input.close();
    return 0;

  }
  public static boolean isTriangle(String line){
    Scanner sc = new Scanner(line);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    return (a + b > c) && (a +c > b) && (b+c > a);
  }
}
