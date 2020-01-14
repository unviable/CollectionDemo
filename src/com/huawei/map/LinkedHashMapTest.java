package com.huawei.map;

import java.util.LinkedHashMap;

/**
 * @Author jacob peng
 * @Date 2020/1/14
 * @description 测试Linkedhashmap
 **/
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put(null,null);
        map.put("1","1");
        System.out.println(map);
    }
}
