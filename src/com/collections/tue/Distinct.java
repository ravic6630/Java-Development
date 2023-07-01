package com.collections.tue;

import java.util.HashMap;
import java.util.Map;

public class Distinct {
    public static void main(String[] args) {
        String input = "ravichandrareddy";

        // Create a HashMap to store the dist frequencies
        HashMap<Character, Integer> charFrequencies = new HashMap<>();

        // Iterate over each dist
        for(int i = 0, n = input.length() ; i < n ; i++) {
            char c=input.charAt(i);

            // Update the freq count
            charFrequencies.put(c, charFrequencies.getOrDefault(c, 0) + 1);
        }

        // Print the distinct dist and their frequencies
        for (Map.Entry<Character, Integer> entry : charFrequencies.entrySet()) {
            char dist = entry.getKey();
            int freq = entry.getValue();
            System.out.println(dist + "-" + freq);
        }
    }
}

// HashMap
// LinkedHashMap
// TreeMap

// HashSet
// LinkedHashSet
// TreeSet

// ordered
// sorted
// threadsafe
// unique
// null

// ArrayList
// LInkedList
// Vector

// Queue

// PriorityQueue
// Dequeue
// LinkedList



//hashMap.put("name","Sanjeev");
/*
hashMap.put("name","someName");
hashMap.get("name");

hashMap.keySet();

HashSet ->

hashSet.add("oneValue");
hashSet.add("oneValue1");
hashSet.add("oneValue2");

*/

// "PRESENT"
//    hashMap.put("oneValue","PRESENT");
//    hashMap.put("oneValue2","PRESENT");
//    hashMap.put("oneValue3","PRESENT");

