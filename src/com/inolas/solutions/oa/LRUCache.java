package com.inolas.solutions.oa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUCache
{
    public static int CACHE_CAPACITY = 4;
    public static LinkedList cacheList = new LinkedList();
    public static HashMap<String, String> cacheMap = new HashMap();

    public static String put(String key, String value) {
        int cacheSize = cacheMap.size();
        if(cacheSize < CACHE_CAPACITY){
            if(cacheMap.containsKey(key)){
                cacheList.remove(key);
                cacheList.add(key);
            } else {
                cacheList.add(key);
                cacheMap.put(key, value);
            }
        } else {
            cacheMap.remove(cacheList.getFirst());
            cacheList.removeFirst();

            cacheList.add(key);
            cacheMap.put(key, value);
        }
        return key;
    }

    public static String get(String key){
        if(cacheMap.containsKey(key)) {
            cacheList.remove(key);
            cacheList.add(key);
            return cacheMap.get(key);
        }
        return null;
    }

    public static String printCache() {
        StringBuilder cache = new StringBuilder();
        Iterator<String> cacheIterator = cacheList.iterator();
        while (cacheIterator.hasNext()) {
            cache.append(cacheIterator.next());
        }
        return cache.toString();
    }

  public static void main(String[] args) {
    LRUCache cache = new LRUCache();
    System.out.println(cache.put("1", "A"));
    System.out.println(cache.put("2", "B"));
    System.out.println(cache.get("1"));
    System.out.println(cache.put("3", "C"));
    System.out.println(cache.put("4", "D"));
    System.out.println(cache.put("5", "E"));
    System.out.println(cache.get("1"));
    System.out.println(cache.put("6", "F"));
    System.out.println(printCache());
  }
}
