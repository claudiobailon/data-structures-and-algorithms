public class ArrayReverse{
  public static void main(String[] args){
    int [] arr = {0,1,2,3,4,5,6};
    reverseArray(arr);
  }
  public static void reverseArray(int[] arr){
    int n = arr.length;
    for(int i = 0; i < n/2; i++){
      int t = arr[i];
      arr[i] = arr[n-i-1];
      arr[n-i-1]= t;// lines 9 and 10 swap positions of elements on opposite ends of the array. Help from https://www.geeksforgeeks.org/reverse-an-array-in-java/
    }
    System.out.print("[");
    for (int j = 0; j< n; j++){
      if( j == n-1){
        System.out.println(arr[j] + "]");
      } else{
        System.out.print(arr[j] + ", ");
      }
    }

  }
}