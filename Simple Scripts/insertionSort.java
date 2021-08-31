import java.util.*;

public class insertionSort {
  public static void main(String[] args){
    Hashtable<Integer,Integer> sortedNumbers = new Hashtable<>();
    int UnsortedArray[] = {6,6,7,8,3,4,2,5,6,1,7,9,0,0,2,3,5,6,1,7,8,3,5,2,4,0};
    for(int i = 0; i < UnsortedArray.length;i++){
      if(sortedNumbers.containsKey(UnsortedArray[i])){
        sortedNumbers.put(UnsortedArray[i],sortedNumbers.get(UnsortedArray[i])+1);
      }else{
        sortedNumbers.put(UnsortedArray[i],1);
      }
    }
    Enumeration<Integer> e = sortedNumbers.keys();
    while(e.hasMoreElements()){
      int key = e.nextElement();
      for(int i = 0; i < sortedNumbers.get(key);i++){
        System.out.println(key);
      }
    }
    
  }
}
