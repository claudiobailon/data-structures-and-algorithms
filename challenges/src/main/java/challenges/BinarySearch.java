package challenges;

public class BinarySearch {
    public int binarySearch(int[] testArr, int low, int high, int key){
        int index= -1;
        while( low <= high){
            int mid = (low + high)/2;
            if(testArr[mid] < key){
                low = mid + 1;
            } else if( testArr[mid] > key ){
                high = mid - 1;
            } else if(testArr[mid] == key){
                index = mid;
                break;
            }
        }
        return index;
    }
}
