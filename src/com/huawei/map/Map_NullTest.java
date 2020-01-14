package com.huawei.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * @Author jacob peng
 * @Date 2020/1/14
 * @description 对map类是否支持null键null值的简单测试
 **/
public class Map_NullTest {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashmap = new LinkedHashMap<>();
        linkedHashmap.put(null,null);
        linkedHashmap.put("1","1");
        linkedHashmap.put(null,"2");
        /**
         *@descpriton   linkedhashmap支持null键 null值
         *@parameter  linkedhashmap
         *
         */
        System.out.println(linkedHashmap);
        System.out.println("---------------------------------");
        TreeMap<String, String> treeMap = new TreeMap<>();
        //treeMap.put(null,null);
        treeMap.put("1",null);
        /**
         *@descpriton   treemap不支持null键，支持null值
         *@parameter  treemap
         *
         */
        System.out.println(treeMap);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(null,null);
        hashMap.put("1","1");
        hashMap.put("2",null);
        /**
         *@descpriton   hashmap支持null键null值
         *@parameter  hashmap
         *
         */
        System.out.println(hashMap);
        System.out.println("---------------------------------");
    }
}
