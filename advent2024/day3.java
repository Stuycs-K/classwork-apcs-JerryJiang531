import java.io.*;
import java.util.*;
public class day3 { // replace with correct day
    public static void main(String[] args) {
        String[] data = parseStringArr("inputDay3.txt"); // replace with correct day
        System.out.println(part1(data));
    }

    public static String[] parseStringArr(String filename) {
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            String a = "";
            while (input.hasNextLine()) {
                a += input.nextLine() + "\n";
            }
            String[] data = a.split("\n"); // replace with correct split parameter
            return data;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return null;
    }
    public static int part1(String[] data){
        int sum = 0;
        for (int i = 0; i < data.length; i++){
            String a = data[i];
            for (int j = 0; j < a.length() -4;j++){
                if (a.substring(j, j+3).equals("mul")){
                    if (a.indexOf("(") - a.indexOf(")") <= 7){
                        a = a.substring(j);
                        j = 0;
                        System.out.println(a);
                        try{
                            String c = a.substring(a.indexOf("(") +1,a.indexOf(")"));
                            System.out.println(c);
                            int[] b = parseIntArrString(c);
                            sum += b[0]*b[1];
                        }catch (Exception e){
                            System.out.println("notsigma");
                        }
                    }

                }
            }
        }
        return sum;
    }
    public static int[] parseIntArrString(String a){
        String[] arr = a.split(",");
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            result[i] = Integer.parseInt(arr[i]);
        }
        return result;
    }
}