import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[] nums){
      String str = "[";
      for (int idx = 0; idx < nums.length; idx++){
          str += nums[idx];
          if (idx < nums.length - 1){
              str += ", ";
          }
      }
      return (str+"]");
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][] ary){
      String str = "[";
      for (int i = 0; i < ary.length; i++){
          str += arrToString(ary[i]);
          if (i < ary.length - 1){
              str += ", ";
          }
      }
      return (str+"]");
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i < nums.length; i++){
      for (int j = 0; i < nums[i].length; i++){
        if (nums[i][j] == 0){
          count++;
        }
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
   public static int arr2Dsum(int[][] nums){
       int sum = 0;
       for (int i = 0; i < nums.length; i++){
           for (int j = 0; j < nums[i].length; j++) {
               sum += nums[i][j];
           }
       }
       return sum;
   }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++) {
        for (int j = 0; j < vals[i].length; j++) {
            if (vals[i][j] < 0) {
                if (i == j) {
                    vals[i][j] = 1;
                } else {
                    vals[i][j] = 0;
                }
            }
        }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] result = new int[nums.length][];
    for (int i = 0; i < nums.length; i++) {
        result[i] = copyHelper(nums[i]);
    }
    return result;
  }
  public static int[] copyHelper(int[] nums){
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        result[i] = nums[i];
    }
    return result;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][] nums){
      int[][] result = new int[nums[0].length][nums.length];
      int row = 0;
      int col = 0;
      int[] values = new int[nums[0].length * nums.length];
      int idx = 0;
      for (int i = 0; i < nums.length; i++){
          for (int j = 0; j < nums[i].length; j++){
              values[idx] = nums[i][j];
              idx++;
          }
      }
      for (int i = 0; i < values.length; i++){
          result[row][col] = values[i];
          col++;
          if (col == nums.length){
              col = 0;
              row++;
          }
      }
      return result;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String result = "<table>";
    for (int i = 0; i < nums.length; i++){
        result += "<tr>";
        for (int j = 0; j < nums[i].length; j++){
            result += "<td>" + nums[i][j] + "</td>";
        }
        result += "</tr>";
    }
    return result + "</table>";
  }
}