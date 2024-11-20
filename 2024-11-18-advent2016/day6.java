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
            while (input.hasNextLine()) {
                a += input.nextLine() + "\n";
            }
            String[] data = a.split("\n");
            int len = data[0].length();// replace with correct split parameter
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
        String res = "";
        for (int i = 0; i < data.length; i++){
            res += most(data[i]);
        }
        return res;
    }
    public static String most(String a){
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] count = new int[26];
        for (int i = 0; i < a.length(); i++){
            for (int j = 0; j < alphabet.length; j++){
                if (a.charAt(i) == alphabet[j]){
                    count[j]++;
                }
            }
        }
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < count.length; i++){
            if (count[i] > max){
                max = count[i];
                maxIndex = i;
            }
        }
        return "" + alphabet[maxIndex];
    }
}