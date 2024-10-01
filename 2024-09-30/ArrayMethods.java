//Nathan Lam, Jerry Jiang, nathanl74@nycstudents.net, jerryj36@nycstudents.net
public class ArrayMethods{
    public static String arrToString(int[][] nums){
        String str = "[";
        for (int idx = 0; idx < nums.length; idx++){
            str += nums[idx];
            if (idx < nums.length - 1){
                str += ", ";
            }
        }
        return (str+"]");
    }
    public static void main(String[] args){
        int[][] testArr= {{1,2,3},{0,0,0},{1,1,1,1,1}};
        System.out.println("Expected = " + "[[1, 2, 3], [0, 0, 0], [1, 1, 1, 1, 1]]" + "Result = " +arrToString(testArr));
        int[][] testArr1 = {{4,32,5,2},{1,6},{3,3,2}};
        System.out.println("Expected = " + "[[4, 32, 5, 2], [1, 6], [3, 3, 2]] " + "Result = " +arrToString(testArr1));
    }
}
