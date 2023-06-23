package com.week4.tue;

import java.util.*;

public class HashSetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("name1");
        set.add("name2");
        set.add("name3");
        set.add("name1");
        set.add("name2");

        set.size();

        set.iterator();

        // set.contains();


        // List of 100 object
        // print unique objects,
        List<String> l = new ArrayList<>();
       // l.size = 100 unique objects;
        Set<String> set2 = new HashSet<>(l);
        set2.addAll(l);

        set2.size();

        Queue<String> q = new PriorityQueue<>();
        q.add("name1");
        q.add("name2");
        q.add("name3");

        LinkedList<String> ll = new LinkedList<>();
        ll.pop();
        ll.peek();
        ll.pollFirst();
        ll.pollLast();
        ll.peekFirst();
        ll.peekLast();
        ll.addLast("");
        ll.add("");

        // poll and peek
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.peek());



    }
}
