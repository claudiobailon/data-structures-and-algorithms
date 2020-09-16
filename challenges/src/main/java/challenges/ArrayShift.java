package challenges;

public class ArrayShift {
    public int[] arrayShift(int[] original, int num){

        int[] newArr = new int[original.length +1];
        int midIndex = 0;
        int j=0;

        if(original.length % 2 == 0){
            midIndex = original.length/2;
        }else{
            midIndex = original.length/2+1;
        }

        for(int i = 0; i< newArr.length; i++){

            if(i == midIndex){
                newArr[i]= num;
            }else{
                newArr[i]= original[j];
                j++;
            }
        }
        return newArr;
    }
}
