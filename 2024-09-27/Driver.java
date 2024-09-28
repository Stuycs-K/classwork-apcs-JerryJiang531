public class Driver{
  public static void main(String[] args){
    int[][] returnCopyCases = {{1,2,3},{0,0,0},{0,1,2,3,-1,15,9098},{3,2,0,1},{-3,-5,-2910328,-11,-0},{}};
    for (int i = 0; i < returnCopyCases.length; i++){
      System.out.println("expected =" + MyArrays.aryToString(returnCopyCases[i]) + "  returned=" + MyArrays.aryToString(MyArrays.returnCopy(returnCopyCases[i])));
      System.out.println("is it the same array?" + (returnCopyCases[i] == MyArrays.returnCopy(returnCopyCases[i])));
    }

    int[][] concatAry1 = {{1,2,3},{1,1,1,1},{0,0,0,0},{},{1},{56,67,78,89}};
    int[][] concatAry2 = {{4,5,6},{-1,-1,-1,-1},{0,0},{},{1,2,3,5,8,13},{}};
    String[] concatExpected = {"[1, 2, 3, 4, 5, 6]", "[1, 1, 1, 1, -1, -1, -1, -1]", "[0, 0, 0, 0, 0, 0]", "[]", "[1, 1, 2, 3, 5, 8, 13]", "[57, 67, 78, 89]"};
    for (int i = 0; i < concatAry1.length; i++){
      System.out.println("expected =" + concatExpected[i]+ "  returned=" + MyArrays.aryToString(MyArrays.concatArray(concatAry1[i], concatAry2[i])));
    }
  }
}
