public class ArraysExample3 {
  public static void main(String[] args) {
    
    //to search for an elements in an array

    int[] numbers = {1,9,3,2,7,4,5};
    int target = 2;
    boolean isFound = false;
    for(int i=0; i<numbers.length; i++){
      if(numbers[i]==target){
        System.out.println("Element found at index: "+i);
        isFound = true;
        break;
      }
    }
    if(!isFound){
      System.out.println("Element not found in the array");
    }
  }
}
