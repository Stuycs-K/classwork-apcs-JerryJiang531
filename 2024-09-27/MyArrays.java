public class MyArrays{
  public static void main(String[] args){

  }
  public static String aryToString(int[] nums){
    String result = "[";
    for (int i = 0; i < nums.length; i ++){
      result +=nums[i];
      if (i != nums.length-1){
        result += nums[i];
      }
    }
    return result += "]";
  }
  public static int[] returnCopy(int[]ary){

  }
  public static int[] concatArray(int[]ary1,int[]ary2){

  }
}
