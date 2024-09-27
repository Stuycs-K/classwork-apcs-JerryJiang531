public class Driver{
  public static void main(String[] args){
    int[][] returnCopyCases = {{1,2,3},{0,0,0},{}};
    for (int i = 0; i < returnCopyCases.length; i++){
      System.out.println("expected =" + MyArrays.aryToString(returnCopyCases[i])) + "returned=" + MyArrays.aryToString(MyArrays.returnCopy(returnCopyCases[i])));
      System.out.println("is it a copy?" + )
    }
  }
}
