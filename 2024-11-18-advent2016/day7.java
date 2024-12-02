import java.io.*;
import java.util.*;
public class day7 { // replace with correct day
    public static void main(String[] args) {
        String[] data = parseStringArr("inputDay7.txt"); // replace with correct day
        System.out.println(Arrays.toString(data));
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
        for (int i = 0; i < data.length; i++) {
            String a = data[i];
            boolean b = true;
            boolean c = true;
            if(!ABBA(a)){
                c = false;
            }
            while (a.contains("[")) {
                String checksum = getCheckSum(a);
                String rest = getRest(a);
                if (ABBA(checksum)) {
                    b = false;
                }
                if (!ABBA(rest)){
                    c = false;
                }
                System.out.println(rest);
                a = rest;
            }
            if (c && b){
                sum ++;
            }
        }
        return sum;
    }
    public static String getCheckSum(String a) {
        String check = a.substring(a.indexOf("[") + 1, a.indexOf("]"));
        return check;
    }
    public static String getRest(String a) {
        String rest = a.substring(0, a.indexOf("[")) + a.substring(a.indexOf("]") +1);
        return rest;
    }
    public static boolean ABBA(String a){
        for (int i = 0; i < a.length()-3;i++){
            if (a.charAt(i) != a.charAt(i+1)) {
                if (a.charAt(i) == a.charAt(i + 3) && a.charAt(i + 1) == a.charAt(i + 2)) {
                    return true;
                }
            }
        }
        return false;
    }
}