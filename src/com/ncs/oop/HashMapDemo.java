package com.ncs.oop;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("carl", 75);
        scores.put("james", 85);
        scores.put("john", 80);
        scores.put("jeny", 70);
        scores.put("richard", 99);
        scores.put("jimy", 95);

        System.out.println("James Score : "+scores.get("james"));
        System.out.println(scores.replace("jimy", 95, 55));

        System.out.println(scores);
        System.out.println("------- Student Names -------");
        Set<String> names = scores.keySet();
        names.stream().forEach(System.out::println);

        System.out.println("------- Student Marks ---------");
        Collection<Integer> marks =  scores.values();
        marks.stream().forEach(System.out::println);

        Set<Map.Entry<String,Integer>> entries =  scores.entrySet();
        entries.stream().forEach(System.out::println);
    }
}
