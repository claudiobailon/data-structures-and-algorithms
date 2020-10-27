package datastructures.hashtable;

import java.util.ArrayList;

public class Hashtable {

    public class HashNode{
        String key;
        int value;

        public HashNode(String key, int value){
            this.key = key;
            this.value = value;
        }
    }

    ArrayList<ArrayList<HashNode>> hashTable = new ArrayList<>();

    public Hashtable(int size){
        for(int i = 0; i < size; i++){
            hashTable.add(new ArrayList<HashNode>());
        }
    }
    public void add(String key, int value) throws Exception{
        int index = hash(key);
        ArrayList<HashNode> bucket = hashTable.get(index);
        for(HashNode thing : bucket){
            if(key == thing.key) throw new Exception("That key already exists.");
        }
        bucket.add(new HashNode(key,value));
    }

    public int get(String key) throws Exception{
        int index = hash(key);
        ArrayList<HashNode> bucket = hashTable.get(index);
        for( HashNode thing : bucket){
            if(key == thing.key){
                return thing.value;
            }
        }
        throw new Exception("That key is not in the Hashtable");
    }

    public boolean contains(String key){
        int index = hash(key);
        ArrayList<HashNode> bucket = hashTable.get(index);
        for( HashNode thing : bucket) {
            if (key == thing.key) {
                return true;
            }
        }
        return false;
    }

    int hash(String key){
        int hashed=0;

        for(int i= 0; i < key.length(); i++){
            hashed += Character.getNumericValue(key.charAt(i));
        }
//        System.out.println(hashed);
        hashed = hashed * 8675309;
//        System.out.println(hashed);
//        hashed = (int)(hashed^(1/4));//this doesn't seem to do what I want it to
//        System.out.println(hashed);
        hashed = hashed/hashTable.size();
//        System.out.println(hashed);
        hashed = hashed % hashTable.size();
//        System.out.println(hashTable.size());
        hashed = (int) Math.floor(hashed);
//        System.out.println("final hash= " +hashed);
        return hashed;

    }
}
