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
            output[i] = new String[3];
            output[i][0]= key;
            output[i][1]= left.get(key);
            i++;
        }
        for(String[] stringArr : output ){
            stringArr[2] = right.getOrDefault(stringArr[0], null);
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
            stringed += "] ";
        }
        stringed += "] ";
        return stringed;
    }
}

