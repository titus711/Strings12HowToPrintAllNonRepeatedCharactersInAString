package com.titoacademy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString = "SILLYSPIDERS";
        char [] myChar = myString.toCharArray();

        Map<Character, Integer> myMap = new HashMap<>();
        for (int i = 0; i < myChar.length;i++){
            if (myMap.containsKey(myChar[i]) == false){
                myMap.put(myChar[i],1);
            } else {
                myMap.put(myChar[i],myMap.get(myChar[i]) + 1);
            }
        }

        Set<Map.Entry<Character,Integer>> myEntireEntrySet = myMap.entrySet();
        for (Map.Entry<Character,Integer> mySingleEntrySet : myEntireEntrySet){
            if (mySingleEntrySet.getValue() == 1){
                System.out.println(mySingleEntrySet.getKey());
            }
        }


    }
}
