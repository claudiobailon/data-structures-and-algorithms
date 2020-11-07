package challenges.leftjoin;

import java.util.HashMap;

public class LeftJoin {

    String[][] output;
    public String[][] leftJoin(HashMap<String, String> left, HashMap<String, String> right){
        output = new String[left.size()][];
//        https://www.geeksforgeeks.org/hashmap-keyset-method-in-java/
//        for(int i = 0; i < left.size(); i++){
        int i = 0;
        for(String key : left.keySet()){
            output[i] = new String[3];//sets new array to a size of three in array of arrays
            output[i][0]= key; //first index of array is the key from left
            output[i][1]= left.get(key);//second index is value from key from left
            i++;
        }
        for(String[] stringArr : output ){
            stringArr[2] = right.getOrDefault(stringArr[0], null);//sets third value in inner array to value from key from right, or null if key not found
        }
        return output;
    }

    @Override
    public String toString(){
        String stringed = "[ ";
        for( int i = 0; i < output.length; i++){
            stringed += "[";
            for(int j = 0; j < output[0].length; j++){
                if(j > 0){
                    stringed += ", ";
                }
                stringed += output[i][j];
            }
           if(i < output.length-1) stringed += "], ";
           else stringed += "] ";
        }
        stringed += "] ";
        return stringed;
    }
}

