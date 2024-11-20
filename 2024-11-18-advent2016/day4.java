import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class day4{ // replace with correct day
    public static void main(String[] args){
        String[] data = parseStringArr("inputDay4.txt"); // replace with correct day
        System.out.println(part1(data)); // replace with correct day
    }
    public static String[] parseStringArr(String filename){
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            String a = "";
            while (input.hasNextLine()){
                a += input.nextLine() + "\n";
            }
            String[] data = a.split("\n"); // replace with correct split parameter
            return data;
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return null;
    }
    public static int part1(String[] data){// replace with correct return type
        int sum = 0;
        boolean isNotDecoy = true;
        for (int i = 0; i < data.length; i++){
            int ID = getID(data[i]);
            String name = getName(data[i]);
            String[] checkSum = getCheckSum(data[i]);
            String[] top = most(data[i]);
            System.out.println(data[i]);
            System.out.println("name = " + name + " ID = " + ID + " checkSum = " + Arrays.toString(checkSum) +" top = " + Arrays.toString(top));
            for (int j = 0; j < 5; j++){
                if (checkSum[j].charAt(0) != top[j].charAt(0)){
                    isNotDecoy = false;
                }
            }
            if (isNotDecoy){
                sum += ID;
            }
        }
        return sum;
    }
    public static String[] most(String a){
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String[] res = new String[5];
        int[] top5 = new int[5];

        int index = 0;
        for (int i = 0; i < 5; i++){
            res[i] = "";
        }
        while (res[4].equals("")) {
            int[] count = new int[26];
            int max = 0;
            int maxIndex = 0;
            String temp = "";
            for (int i = 0; i < a.length(); i++){
                for (int j = 0; j < alphabet.length; j++){
                    if (a.charAt(i) == alphabet[j] && a.charAt(i) != '-'){
                        count[j]++;
                    }
                }
            }
            for (int i = 0; i < count.length; i++) {
                if (count[i] > max) {
                    max = count[i];
                    maxIndex = i;
                }
            }
            res[index] = alphabet[maxIndex] + "";
            top5[index] = count[maxIndex];
            index++;
            for (int i = 0; i < a.length(); i++){
                if (a.charAt(i) != alphabet[maxIndex]){
                    temp += a.charAt(i) + "";
                }
            }
            a = temp;
        }
        for (int i = 0 ; i < 5; i++){
            if (i != 4) {
                if (top5[i] == top5[i + 1]) {
                    if (res[i].compareTo(res[i+1]) > 0){
                        String temp = res[i];
                        res[i] = res[i+1];
                        res[i+1] = temp;
                    }
                }
            }
        }
        return res;
    }
    public static String[] getCheckSum(String a){
        String check = a.substring(a.indexOf("[") + 1, a.length()-1);
        String[] res = new String[5];
        for (int i = 0; i < res.length; i ++){
            res[i] = "" + check.charAt(i);
        }
        return res;
    }
    public static int getID(String a){
        return Integer.parseInt(a.substring(a.lastIndexOf("-") +1, a.indexOf("[")));
    }
    public static String getName(String a){
        return a.substring(0, a.lastIndexOf("-"));
    }
}
