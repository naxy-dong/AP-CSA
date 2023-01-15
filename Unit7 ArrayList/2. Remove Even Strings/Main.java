import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    ArrayList<String> strArr = new ArrayList<String>();
    strArr.add("hello");
    strArr.add("my");
    strArr.add("name");
    strArr.add("is");
    strArr.add("YuXiang");
    System.out.println(strArr);
    System.out.println(removeEvenLength(strArr));
  }
  public static ArrayList<String> removeEvenLength(ArrayList<String> arr){
    for(int i = 0; i < arr.size(); i++){
      if(arr.get(i).length() % 2 == 0){
        arr.remove(i);
        i--;
      }
    }
    return arr;
  }
}