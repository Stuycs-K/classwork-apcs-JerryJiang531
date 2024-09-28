public class MyArrays{
  public static void main(String[] args){
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
    int[] concated = new int[ary1.length + ary2.length];
    int i = 0;
    while (i < ary1.length){
      concated[i] = ary1[i];
      i++;
    }
    for (int j = 0; j < ary2.length; j++){
      concated[i] = ary2[j];
      i++;
    }
    return concated;

  }
}
