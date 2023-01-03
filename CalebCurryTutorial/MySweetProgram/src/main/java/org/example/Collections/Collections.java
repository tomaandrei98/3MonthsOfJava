package org.example.Collections;

import java.util.HashMap;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {
        HashMap<String, Integer> ids = new HashMap<>();
        ids.put("Caleb Curry", 5);
//        ids.put("Sally", 345);
        ids.put("Sally", ids.getOrDefault("Sally", 0) + 1);
        System.out.println(ids.get("Sally"));

        Set<String> keys = ids.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(ids.get(key));
        }
    }
}
