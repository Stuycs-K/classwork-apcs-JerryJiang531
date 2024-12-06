import java.io.*;
import java.util.*;
public class day4 { // replace with correct day
    public static void main(String[] args) {
        char[][] data = parseCharArr("inputDay4.txt"); // replace with correct day
        // System.out.println(Arrays.deepToString(data));
        System.out.println(part2(data));
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
    public static char[][] parseCharArr(String filename){
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            String a = "";
            while (input.hasNextLine()) {
                a += input.nextLine() + "\n";
            }
            String[] data = a.split("\n"); // replace with correct split parameter
            char[][] result = new char[data.length][data[0].length()];
            for (int i = 0 ; i < result.length; i++){
                result[i] = data[i].toCharArray();
            }
            return result;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return null;
    }
    public static int part1(char[][] data){
        int sum = 0;
        int[][] dir = {{-1, 0}, {1, 0} , {0, -1}, {0,1}, {1, 1}, {-1, 1}, {-1, -1}, {1,-1}};
        // up down left right southeast northeast northwest southwest
        // 0   1    2    3     4         5          6         7
        for (int i = 0; i < data.length; i++){
            for (int j = 0 ; j < data[1].length; j++){
                if (data[i][j] == 'X'){
                        for (int k = 0; k < 8; k++) {
                            try {
                                int yinc = dir[k][0];
                                int xinc = dir[k][1];
                                if (data[i + yinc][j + xinc] == 'M') {
                                    if (data[i + 2 * yinc][j + 2 * xinc] == 'A') {
                                        if (data[i + 3 * yinc][j + 3 * xinc] == 'S') {
                                            sum++;
                                        }
                                    }
                                }
                            } catch (Exception e) {
                            }
                        }

                    }
                }
            }

        return sum;
    }
    public static int part2(char[][] data){
        int sum = 0;
        int[][] dir = { {1, 1}, {-1, 1}};
        // up down left right southeast northeast northwest southwest
        // 0   1    2    3     4         5          6         7
        for (int i = 0; i < data.length; i++){
            for (int j = 0 ; j < data[1].length; j++){
                if (data[i][j] == 'A'){
                    boolean diag1 = false;
                    boolean diag2 = false;
                        try {
                            int yinc = dir[0][0];
                            int xinc = dir[0][1];
                            int yinc2 = dir[1][0];
                            int xinc2 = dir[1][1];
                            if (data[i + yinc][j + xinc] == 'M') {
                                if (data[i - yinc][j - xinc] == 'S') {
                                    diag1 = true;
                                }
                              }else if (data[i + yinc][j + xinc] == 'S') {
                                  if (data[i - yinc][j - xinc] == 'M') {
                                      diag1 = true;
                                  }
                              }
                            if (data[i + yinc2][j + xinc2] == 'M') {
                                if (data[i - yinc2][j - xinc2] == 'S') {
                                    diag2 = true;
                                }
                              }else if (data[i + yinc2][j + xinc2] == 'S') {
                                  if (data[i - yinc2][j - xinc2] == 'M') {
                                      diag2 = true;
                                  }
                              }
                        } catch (Exception e) {
                        }
                      if (diag1 && diag2){
                        sum++;
                      }

                }
            }
        }

        return sum;
    }

}
