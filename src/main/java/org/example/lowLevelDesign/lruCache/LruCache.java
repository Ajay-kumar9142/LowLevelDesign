package org.example.lowLevelDesign.lruCache;

import java.util.HashMap;
import java.util.Map;

public class LruCache<K, V> {
    int capacity;
    Map<K, Node<K, V>> cache;
    DoublyLinkedList<K, V> dll;

    public LruCache(int capacity){
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.dll = new DoublyLinkedList<>();
    }

    public V get(K key){
        if(!cache.containsKey(key)) return null;
        Node<K, V> node = cache.get(key);
        dll.remove(node);
        dll.addToFront(node);
        return node.value;
    }

    public void put(K key, V value){
        if(cache.containsKey(key)){
            Node<K, V> node = cache.get(key);
            node.value = value;
            dll.remove(node);
            dll.addToFront(node);
        } else {
            if(cache.size() == capacity){
                Node<K, V> node = dll.tail.prev;
                dll.remove(node);
                cache.remove(node.key);
            }
            Node<K, V> node = new Node<>(key, value);
            dll.addToFront(node);
            cache.put(key, node);
        }
    }

}
