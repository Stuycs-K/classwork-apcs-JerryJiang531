import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class day2{
    public static void main(String[] args){
        System.out.println(part1("inputDay2.txt"));
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


}