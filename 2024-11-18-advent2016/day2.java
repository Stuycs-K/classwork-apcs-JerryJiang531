import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class day2{
    public static void main(String[] args){
        String[] data = parseStringArr("inputDay2.txt");
        System.out.println(part2(data));
    }

    public static String part1(String filename){
        String result = "";
        int[][] numpad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            int i = 1;
            int j = 1;
            while (input.hasNextLine()){
                String line = input.nextLine();
                for (int k = 0; k < line.length(); k++){
                    if (line.charAt(k) == 'U'){
                        if (i != 0){
                            i--;
                        }
                    }else if (line.charAt(k) == 'L') {
                        if (j != 0) {
                            j--;
                        }
                    }else if (line.charAt(k) == 'D') {
                        if (i != 2) {
                            i++;
                        }
                    }else if (line.charAt(k) == 'R') {
                        if (j != 2) {
                            j++;
                        }
                    }
                }
                result += numpad[i][j];
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        return result;
    }
    public static String part2(String[] data){
        int[][] numpad = {{0,0,1, 0, 0}, {0, 2, 3, 4, 0}, {5, 6, 7, 8, 9}, {0, 10, 11, 12, 0}, {0, 0, 13, 0, 0}};
        int i = 2;
        int j = 0;
        String result = "";
        for (int l = 0; l < data.length; l++){
            String line = data[l];
            for (int k = 0; k < line.length(); k++){
                if (line.charAt(k) == 'U'){
                    if (i != 0){
                        if (numpad[i-1][j] != 0) {
                            i--;
                        }
                    }
                }else if (line.charAt(k) == 'L') {
                    if (j != 0) {
                        if (numpad[i][j-1] != 0) {
                            j--;
                        }
                    }
                }else if (line.charAt(k) == 'D') {
                    if (i != 4) {
                        if (numpad[i+1][j] != 0) {
                            i++;
                        }
                    }
                }else if (line.charAt(k) == 'R') {
                    if (j != 4) {
                        if (numpad[i][j+1] != 0) {
                            j++;
                        }
                    }
                }
            }
            System.out.println(numpad[i][j]);
            if (numpad[i][j] == 10){
                result += "A";
            }else if (numpad[i][j] == 11){
                result += "B";
            }else if (numpad[i][j] == 12){
                result += "C";
            }else if (numpad[i][j] == 13){
                result += "D";
            }else {
                result += numpad[i][j];
            }
        }
        return result;
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


}