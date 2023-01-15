import java.util.ArrayList;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    String[] strArr = {"proof", "a", "can", "everything", "slyly", "you", "invisible", "myths", "gypsy", "picnic"};
    ArrayList<String> arr = new ArrayList<String>(Arrays.asList(strArr));
    System.out.println(arr);
    removeVowelWords(arr);
    System.out.println(arr);
  }
  public static void removeVowelWords(ArrayList<String> arr){
    for(int i = 0; i < arr.size(); i++){
      if(arr.get(i).indexOf("a") >=0 || arr.get(i).indexOf("u")>=0  || arr.get(i).indexOf("i")>=0 || arr.get(i).indexOf("o")>=0 || arr.get(i).indexOf("u")>=0 ){
        arr.remove(i);
        i--;
      }
    }
  }
}