package org.example.lowLevelDesign.otherPatterns.javaTutorial;


//implementation of Queue using Linked List

public class QueueImpl {
 LinkedListNode head;

 public void add(int val){
     if(head == null) head = new LinkedListNode(val);
     else{
         LinkedListNode temp = new LinkedListNode(val);
         temp.next = head;
         head = temp;
     }
 }

 public int peek(){
     if(head == null) return -1;
     LinkedListNode curr = head;
     while(curr.next != null){
         curr = curr.next;
     }
     return curr.data;
 }

 public void remove(){
     if(head == null) {
         System.out.println("no elements in the queue");
         return;
     }
     LinkedListNode dummy = new LinkedListNode(-1);
     dummy.next = head;
     LinkedListNode curr = dummy, prev = null;

     while(curr.next != null){
         prev = curr;
         curr = curr.next;
     }

     prev.next = null;
 }

    public static void main(String[] args) {
        QueueImpl q = new QueueImpl();
        q.add(5);
        q.add(10);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
    }
}
