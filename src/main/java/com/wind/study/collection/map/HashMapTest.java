package com.wind.study.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map map = new HashMap<String, String>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        System.out.println("map = " + map.put("3", "4"));
        System.out.println("map = " + map);
        System.out.println(map.containsKey("1"));
        System.out.println(map.containsValue("4"));
        for (Object o : map.keySet()) {
            System.out.println(map.get(o));
        }
    }
}
