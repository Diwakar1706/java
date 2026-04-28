////package tnp;
////
////public class Test {
////    Node Head;
////    void insert;
////
////    public static void main(String[] args) {
////        Test t1=new Test();
////        t1.insertFirst(10);
////    }
////    void insertFirst(int ele){
////
////    }
////
////}
////
////class Node{
////    int data;
////    Node next;
////}
//package tnp;
//
//public class Test {
//    Node head;
//
//    public static void main(String[] args) {
//        Test t1 = new Test();
//
//        t1.insertFirst(10);
//        t1.insertFirst(20);
//        t1.insertFirst(30);
//
//        t1.display();
//    }
//
//
//    void insertFirst(int ele) {
//        Node newNode = new Node(); // create node
//        newNode.data = ele;
//        newNode.next=head;// point to old head
//        head = newNode;               // update head
//    }
//    void insertLast(int ele) {
//        Node newNode = new Node();
//        newNode.data = ele;
//        newNode.next = null;
//
//        // Case 1: Empty list
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//
//        // Case 2: Traverse to last node
//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//
//        // Insert at end
//        temp.next = newNode;
//    }
//
//
//    void display() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("NULL");
//    }
//
//
//
//    void CinsertFirst(int ele) {
//        Node newNode = new Node(ele);
//
//        // Empty list
//        if (head == null) {
//            head = newNode;
//            newNode.next = head;
//            return;
//        }
//
//        Node temp = head;
//
//        // Go to last node
//        while (temp.next != head) {
//            temp = temp.next;
//        }
//
//        newNode.next = head;
//        temp.next = newNode;
//        head = newNode;
//    }
//}
//
//// Node class
//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
