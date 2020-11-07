package challenges.repeatedword;

import java.util.HashMap;

public class RepeatedWord {
    public static String repeatedWord(String thisString){
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] justWords = thisString.split(" ");//takes each word in the given string and puts it in an array
        System.out.println();
        for (int i=0; i< justWords.length; i++){
            String[] words = justWords[i].split("[,?!]");//takes out any punctuation from end of string
            String thisWord = words[0];
            if (wordCount.containsKey(thisWord.toLowerCase())){//puts the word being checked for into lowercase
                return thisWord;
            } else{
                wordCount.put(thisWord.toLowerCase(),1);//changes word to lowercase while it is added to hashmap
            }
        }
        return "There are no duplicate words in that String";
    }
}