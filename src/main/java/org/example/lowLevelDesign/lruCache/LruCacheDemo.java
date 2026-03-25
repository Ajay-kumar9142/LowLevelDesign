package org.example.lowLevelDesign.lruCache;

public class LruCacheDemo {

    public static void main(String[] args) {
        LruCache<String, Integer> lru = new LruCache<>(3);

        lru.put("Ajay", 10);
        lru.put("Deepak", 9);
        lru.put("Lokesh", 11);

        System.out.println(lru.get("Ajay"));
        lru.put("Sam", 15);

        System.out.println(lru.get("Deepak"));
    }
}
