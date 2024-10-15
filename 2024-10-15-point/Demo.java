public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    double result;
    double temp1 = Math.pow(a.getX() - b.getX(), 2);
    double temp2 = Math.pow(a.getY() - b.getY(), 2);
    result = Math.sqrt(temp1 + temp2);
    return result;
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    System.out.println( p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
  }
}
