public class heapSort {
  public static void main(String[] args){
    int[] array = {1,4,2,7,3,9,1,3,0,5,4,7,6,2,8,6};
    heapSort object = new heapSort();
    object.sort(array);
    printArray(array);
  }
  public void sort(int[] array){
    int length = array.length;
    for (int location = length/2-1; location >=0;location--){
      heap(array, length, location);
    }

    for (int location= length-1;location>0;location--){
      int temp = array[0];
      array[0] = array[location];
      array[location] = temp;

      heap(array, location, 0);
    }
  }
  public void heap(int[] array, int length, int location){
    int largest = location; //Largest as root
    int left_child = 2*location+1; //left child of root
    int right_child = 2*location+2; //right child of root


    //if left child is larger than root
    if (left_child < length && array[left_child] > array[largest]){
      largest = left_child;
    }

    //if right child is larger than root
    if(right_child<length&&array[right_child]>array[largest]){
      largest = right_child;
    }

    //If largest is not root
    if(largest!=location){
      int swap = array[location];
      array[location] = array[largest];
      array[largest] = swap;

      heap(array, length, largest);
    }
  }
  static void printArray(int[] array){
    int n = array.length;
    for(int i=0; i < n; i++){
      System.out.println(array[i]);
    }
  }
}
