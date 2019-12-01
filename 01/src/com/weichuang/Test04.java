package com.weichuang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test04 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l.size());
        System.out.println(l.get(0));
//        l.remove(2);
        System.out.println(l.size());
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        Map<String,Integer> m = new HashMap<>();
        m.put("a",1);
        m.put("b",2);
        System.out.println(m.get("a"));

    }
}
