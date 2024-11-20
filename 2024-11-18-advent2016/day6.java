import java.io.*;
import java.util.*;
public class day6 { // replace with correct day
    public static void main(String[] args) {
        String[] data = parseStringArrCol("inputDay6.txt"); // replace with correct day
        System.out.println(Arrays.toString(data));
        System.out.println(part1(data));
    }

    public static String[] parseStringArrCol(String filename) {
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            String a = "";
            int len = 0;
            while (input.hasNextLine()) {
                a += input.nextLine() + "\n";
            }
            String[] data = a.split("\n");
            len = data[0].length();// replace with correct split parameter
            String[] data1 = new String[len];
            for (int i = 0; i < data1.length; i++){
                data1[i] = "";
            }
            for (int j = 0; j < data1.length; j++){
                for (int k = 0; k < data.length; k++){
                        data1[j] += "" + data[k].charAt(j);
                }
            }
            return data1;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return null;
    }
    public static String part1(String[] data){
        return "";
    }
}