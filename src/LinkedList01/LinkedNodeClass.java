package LinkedList01;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null; // it is also bydefault
    }
}
public class LinkedNodeClass {
    public static void print(Node head) {
        Node temp=head;
        while(temp!=null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void displayrec(Node head){
        if(head==null) return;
        System.out.println(head.val);
        displayrec(head.next);
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        System.out.println(a);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        print(a);
        displayrec(a);
    }
}
