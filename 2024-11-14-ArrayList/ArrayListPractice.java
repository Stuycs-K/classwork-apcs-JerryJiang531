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
    for (int i = 0; i < original.size(); i++){
      reversed.add(original.get(index));
      index --;
    }
    return reversed;
  //return a new ArrayList that is in the reversed order of the original.
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    int smaller;
    ArrayList<String> bigger;
    if (a.size() < b.size()){
      smaller = a.size();
      bigger = b;
    }else{
      smaller = b.size();
      bigger = a;
    }
    ArrayList<String> result = new ArrayList<String>(a.size() + b.size());
    int index = 0;
    while (index < smaller){
      result.add(a.get(index));
      result.add(b.get(index));
      index++;
    }
    for (int i = index; i < bigger.size(); i++){
      result.add(bigger.get(i));
    }
    return result;
    //return a new ArrayList that has all values of a and b in alternating order that is:
    //a[0], b[0], a[1], b[1]...
    //If one list is longer than the other, just attach the remaining values to the end.
  }
  public static void main(String[] args){
    ArrayList<String> arr1 = createRandomArray(200001);
    System.out.println(arr1);
    replaceEmpty(arr1);
    System.out.println(arr1);
    System.out.println(makeReversedList(arr1));
    ArrayList<String> arr2 = createRandomArray(200001);
    System.out.println(arr2);
    System.out.println(mixLists(arr1, arr2));
    // System.out.println(createRandomArray(10));
    // System.out.println(createRandomArray(200001));
  }
}
