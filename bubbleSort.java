public class bubbleSort {
  public static void main(String[] args){
    int UnsortedArray[] = {6,2,4,7,9,1,3,0};
    int temp;
    boolean sorted = false;
    System.out.println(UnsortedArray[0]>UnsortedArray[1])
    while(sorted == false){
      sorted = true;
      for(int x = 0; x < UnsortedArray.length-1; x++){
        if(UnsortedArray[x] > UnsortedArray[x+1]){
          temp = UnsortedArray[x];
          UnsortedArray[x] = UnsortedArray[x+1];
          UnsortedArray[x+1] = temp;
          sorted=false;
        }
      }
    }
    for(int i = 0; i < UnsortedArray.length; i++){
      System.out.println(UnsortedArray[i]);
    }
  }
}
