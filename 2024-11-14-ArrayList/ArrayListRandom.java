import java.util.ArrayList;
public class ArrayListRandom{
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
  public static void main(String[] args){
    System.out.println(createRandomArray(10));
  }
}
