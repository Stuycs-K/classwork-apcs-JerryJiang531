import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    System.out.println("\nStart of arrToString tests");
    int[] arr1 = {1,2,3,4};
    int[] arr2 = {};
    int[] arr3 = {0,0,0,7,7,7};
    System.out.println("Expected = " + Arrays.toString(arr1) + " Returned = " + arrToString(arr1));
    System.out.println("Expected = " + Arrays.toString(arr2) + " Returned = " + arrToString(arr2));
    System.out.println("Expected = " + Arrays.toString(arr3) + " Returned = " + arrToString(arr3));
    System.out.println("\nStart of countZeros2D tests");
    int[][] arr4 = {{1,2,3}, {4,5,6}};
    System.out.println("Expected " + 0 + " Returned = " + countZeros2D(arr4));
    int[][] arr5 = {{},{}};
    System.out.println("Expected = " + 0 + " Returned = " + countZeros2D(arr5));
    int[][] arr6 = {{0}, {1,2,3}};
    System.out.println("Expected = " + 1 + " Returned = " + countZeros2D(arr6));
    int[][] arr7 = {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}};
    System.out.println("Expected = " + 12 + " Returned = " + countZeros2D(arr7));
    int[][] arr8 = {{0}, {0,0}, {0,0,0}};
    System.out.println("Expected = " + 6 + " Returned = " + countZeros2D(arr8));
    System.out.println("\nStart of htmlTable tests");
    String table4 = "<table><tr><td>1</td><td>2</td><td>3</td></tr><tr><td>4</td><td>5</td><td>6</td></tr></table>";
    System.out.println("Expected = " + table4 + " Returned = " + htmlTable(arr4));
    System.out.println("Are the Strings equal" + table4.equals(htmlTable(arr4)));
    String table5 = "<table></table>";
    System.out.println("Expected = " + table5 + " Returned = " + htmlTable(arr5));
    System.out.println("Are the Strings equal" + table5.equals(htmlTable(arr5)));
    String table6 = "<table><tr><td>0</td></tr><tr><td>1</td><td>2</td><td>3</td></tr></table>";
    System.out.println("Expected = " + table6 + " Returned = " + htmlTable(arr6));
    System.out.println("Are the Strings equal" + table6.equals(htmlTable(arr6)));
    String table7 = "<table><tr><td>0</td><td>0</td><td>0</td><td>0</td></tr><tr><td>0</td><td>0</td><td>0</td><td>0</td></tr><tr><td>0</td><td>0</td><td>0</td><td>0</td></tr></table>";
    System.out.println("Expected = " + table7 + " Returned = " + htmlTable(arr7));
    System.out.println("Are the Strings equal" + table7.equals(htmlTable(arr7)));
    String table8 = "<table><tr><td>0</td></tr><tr><td>0</td><td>0</td></tr><tr><td>0</td><td>0</td><td>0</td></tr></table>";
    System.out.println("Expected = " + table8 + " Returned = " + htmlTable(arr8));
    System.out.println("Are the Strings equal" + table8.equals(htmlTable(arr8)));
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
      for (int j = 0; j < nums[i].length; j++){
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
