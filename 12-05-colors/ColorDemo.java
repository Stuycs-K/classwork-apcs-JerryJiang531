import java.util.*;
public class ColorDemo{
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";
  public static int BLACK = 30;
  public static int RED = 31;

  public static void main(String[] args){
    Random rng = new Random();
    while (true){
          color(BLACK,BLACK);
          go(rng.nextInt(),rng.nextInt());
          color(RED,RED);
        }
  }


  public static void color(int foreground,int background){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
  }

  public static Void color(int foreground, int background, int modifier){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + + ";" + modifier + "m");
  }
  public static void go(int r,int c){
  System.out.print("\u001b[" + r + ";" + c + "f");
}
}