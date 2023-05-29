package com.git;

import java.util.*;

public class hello {
     public static void main(String[] args) {
        System.out.println("Hello Git");
        System.out.println("创建");
        List<Integer> list = new ArrayList<Integer>();
        Map<String,Integer> hmap = new HashMap();
        hmap.put("b",3);
        hmap.put("bz",32);
        hmap.put("a",4);
        Set<Map.Entry<String,Integer>> entyrSet = hmap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entyrSet.iterator();
        while(iterator.hasNext()){
             Map.Entry<String,Integer> entry = iterator.next();
             String key = entry.getKey();
             Integer ite = entry.getValue();
             System.out.println(key+"---"+ite);

         }

     }
}
