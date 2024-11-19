import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class day4{ // replace with correct day
    public static void main(String[] args){
        System.out.println(part1("inputDay4.txt")); // replace with correct day
    }
    public static int part1(String filename){// replace with correct return type
        int sum = 0;
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()){ // sometimes "hasNextLine()"
                String line = input.nextLine();
                String checksum = getCheckSum(line);
                int ID = getID(line);
                String name = getName(line);
            }
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return sum;
    }
    public static String getCheckSum(String a){
        return a.substring(a.indexOf("["), a.length()-1);
    }
    public static int getID(String a){
        return Integer.parseInt(a.substring(a.lastIndexOf("-") +1, a.indexOf("[")));
    }
    public static String getName(String a){
        return a.substring(0, a.lastIndexOf("-"));
    }
}