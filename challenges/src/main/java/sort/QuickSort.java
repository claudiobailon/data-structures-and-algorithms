package sort;

import java.util.Arrays;

public class QuickSort {
    public int[] quickSort(int[] arr, int left, int right){

        if(left < right){
            int position = partition(arr, left, right);
            quickSort(arr, left, position-1);
            quickSort(arr, position+1,right);
        }
        return arr;
    }

    public static int partition(int[] arr, int left, int right){

        int pivot = arr[right];
        int low = left - 1;
        int counter = 1;

        for(int i = left; i < right; i++){
            System.out.println("Pass " + counter  + ": Pivot= " + pivot + " Low= " + low + " i= " + i) ;
            System.out.println(Arrays.toString(arr) );
            if(arr[i] <= pivot){
                low++;
                System.out.println("low is incremented and is now " + low);
                swap(arr, i, low);
                System.out.println("switching value at the i index, " + i + ", and value at the low index, " +(low)+ ", so " + arr[i] + " and " + arr[low] + " swap places");

                System.out.println("new Arr: " + Arrays.toString(arr));

            }
            counter++;
        }
        swap(arr,right,low+1);
        System.out.println("switching value at the right index, " + right + ", and value at the low index + 1, " +(low+1)+ ", so " + arr[right] + " and " + arr[low + 1] + " swap places");
        System.out.println("new Arr: " + Arrays.toString(arr));

        return low + 1;
    }

    public static void swap(int[] arr, int i, int low){

        int temp;
        temp = arr[i];
        arr[i]= arr[low];
        arr[low]= temp;

    }

}
