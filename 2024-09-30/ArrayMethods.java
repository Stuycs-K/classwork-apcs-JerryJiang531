//Nathan Lam, Jerry Jiang, nathanl74@nycstudents.net, jerryj36@nycstudents.net
public class ArrayMethods{
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
    public static int arr2Dsum(int[][] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++) {
                sum += nums[i][j];
            }
        }
        return sum;
    }
    public static int[][] swapRC(int[][] nums){
        int[][] result = new int[nums[0].length][nums.length];
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                result[j][i] = nums[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[][] testArr= {{1,2,3},{0,0,0},{1,1,1,1,1}};
        System.out.println("Expected = " + "[[1, 2, 3], [0, 0, 0], [1, 1, 1, 1, 1]]" + "Result = " +arrToString(testArr));
        System.out.println("Expected = " + 11 + "Result = " + arr2Dsum(testArr));
        int[][] testArr1 = {{4,32,5,2},{1,6},{3,3,2}};
        System.out.println("Expected = " + "[[4, 32, 5, 2], [1, 6], [3, 3, 2]]" + "Result = " +arrToString(testArr1));
        System.out.println("Expected = " + 58 + "Result = " + arr2Dsum(testArr1));
        int[][] testArr2 = {{1,2,3}, {4,5,6}};
        System.out.println("Expected = " + "[[1, 2, 3], [4, 5, 6]]" + "Result = " +arrToString(testArr2));
        System.out.println("Expected = " + 21 + "Result = " + arr2Dsum(testArr2));
        int[][] testArr3 = {{2,3,4}, {5,6,7}, {2,4,9}};
        System.out.println("Expected = " + "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]" + "Result = " +arrToString(testArr3));
        System.out.println("Expected = " + 42 + "Result = " + arr2Dsum(testArr3));
        //Start of swapRC tests
        System.out.println("Expected = " + "[[1, 2], [3, 4], [5, 6]]" + "Result = " + arrToString(swapRC(testArr2)));
        System.out.println("Expected = " + "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]" + "Result = " + arrToString(swapRC(testArr3)));
        int[][] testArr4 = {{1,2}, {78,988}, {12,30}, {0,0}, {1111, 99}, {40, 27}};
        System.out.println("Expected = " + "[[1, 2, 78, 988, 12, 30], [0, 0, 1111, 99, 40, 27]]" + "Result = " + arrToString(swapRC(testArr2)));
    }
}
