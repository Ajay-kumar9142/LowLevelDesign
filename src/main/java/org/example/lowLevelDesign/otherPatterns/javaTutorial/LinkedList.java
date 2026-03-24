package org.example.lowLevelDesign.otherPatterns.javaTutorial;


class LinkedListNode{
    int data;
    LinkedListNode next;

    public LinkedListNode(int data){
        this.data = data;
    }
}
public class LinkedList {

    public LinkedListNode addFirst(LinkedListNode head, int data){
        LinkedListNode newNode = new LinkedListNode(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    LinkedListNode addLast(LinkedListNode head, int data){
        if(head == null){
            head = new LinkedListNode(data);
            return head;
        }

        LinkedListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = new LinkedListNode(data);
        System.out.println(curr.next.data);
        return head;
    }

    public static void main(String[] args) {
        LinkedList temp = new LinkedList();
        LinkedListNode head = new LinkedListNode(10);
//        System.out.println(temp.addFirst(head, 15).data);
//        temp.addLast(head, 12);
        head = temp.addFirst(head, 15);
        head = temp.addLast(head, 12);
        System.out.println(head.data);
    }

}
