public class MyArrays{
  public static void main(String[] args){
      System.out.println(aryToString(new int[]{1,2,3,4}));
  }
  public static String aryToString(int[] nums){
    String result = "[";
    for (int i = 0; i < nums.length; i ++){
      result +=nums[i];
      if (i != nums.length-1){
        result += ", ";
      }
    }
    return result += "]";
  }
  public static int[] returnCopy(int[]ary){
    int[] ary2 = new int[ary.length];
    for (int i = 0; i < ary.length; i ++){
      ary2[i] = ary[i];
    }
    return ary2;
  }
  public static int[] concatArray(int[]ary1,int[]ary2){
    return new int[0];

  }
}
