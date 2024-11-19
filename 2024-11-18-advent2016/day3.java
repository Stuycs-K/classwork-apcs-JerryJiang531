// I forgot I already did 2016 day 3 advent of code, so I'm using it as a template for my other advent of code instead
// repeatable code for advent of code
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class day3{ // replace with correct day
    public static void main(String[] args){
        System.out.println(part1("inputDay3.txt")); // replace with correct day
    }
    public static int part1(String filename){ // replace with correct return type
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            while (input.hasNext()){ // sometimes "hasNextLine()"
                //code body
            }
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        // add return statement
    }
}