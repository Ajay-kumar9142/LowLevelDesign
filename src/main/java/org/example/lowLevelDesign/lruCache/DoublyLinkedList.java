package org.example.lowLevelDesign.lruCache;

public class DoublyLinkedList<K, V> {
    Node<K, V> head;
    Node<K, V> tail;

    public DoublyLinkedList(){
        this.head = new Node<>(null, null);
        this.tail = new Node<>(null, null);
        head.next = tail;
        tail.prev = head;
    }

    public void remove(Node<K, V> node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void addToFront(Node<K, V> node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

}
