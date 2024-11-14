import java.util.ArrayList;
public class ArrayListPractice{
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String> arr = new ArrayList<String>(size);
    for (int i = 0; i < size; i++){
      int random = (int)(Math.random() * 11);
      if (random == 0){
        arr.add("");
      }else{
        arr.add(random + "");
      }
    }
    return arr;
  }

  public static void replaceEmpty(ArrayList<String> original){
    while (original.indexOf("") != -1) {
      original.set(original.indexOf(""), "Empty");
    }
  }
  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    ArrayList<String> reversed = new ArrayList<String>(original.size());
    int index = original.size() -1;
    for (int i = 0; i < reversed.size(); i++){
      reversed.add(original.get(index));
      index --;
    }
    return reversed;
  //return a new ArrayList that is in the reversed order of the original.
  }

  public static void main(String[] args){
    ArrayList<String> arr1 = createRandomArray(15);
    System.out.println(arr1);
    replaceEmpty(arr1);
    System.out.println(arr1);
    System.out.println(makeReversedList(arr1));
    // System.out.println(createRandomArray(10));
    // System.out.println(createRandomArray(200001));
  }
}
