package LinkedList01;
class SLL{
    Node head;
    Node tail;
    int size;
    void insertAtEnd(int val){
        Node temp=new Node(val);
        if(head==null){
            head=temp;
            tail=temp;
        }else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void insertAtFirst(int val){
        Node temp=new Node(val);
        if(head==null){
            head=tail=temp;
        }else{
            temp.next=head;
            head=temp;
        }
        size++;

    }
    void insert(int idx,int val){
        if(idx<0 || idx>size){
            throw new IndexOutOfBoundsException("invaild index");
        }
        if(idx==0){
            insertAtFirst(val);
            return;
        }
        if (idx==size){
            insertAtEnd(val);
            return;
        }
        Node temp=new Node(val);
        Node x=head;
        for(int i=0; i<idx-1; i++){
            x=x.next;
        }
        temp.next=x.next;
        x.next=temp;
        size++;

    }
    int get(int idx){
        if(idx<0 || idx>=size){
            throw new IndexOutOfBoundsException("invaild idx");
        }
        if(idx==size){
            return tail.val;
        }
        Node temp=head;
        for(int i=0; i<idx; i++){
            temp=temp.next;
        }
        return temp.val;
    }
    void set(int idx,int val){
        if(idx>=size || idx<0){
            throw new IndexOutOfBoundsException("invaid idx");
        }
        Node temp=head;
        if(idx==size-1) tail.val=val;
        for (int i=0; i<idx; i++){
            temp=temp.next;
        }
        temp.val=val;
    }
    void deleteAtFirst(){
        if(head==null){
            System.out.println("is empty");
            return;
        }
        head=head.next;
        size--;
//        if(head==null){
//            tail=null;
//        }
    }
    void delete(int idx){
        if(idx==0){
            deleteAtFirst();
            return;
        }
        if(head==null){
            System.out.println("is empty");
        }

        if(idx>=size || idx<0){
            throw new IndexOutOfBoundsException("invaild idx");
        }
        Node temp=head;
        for(int i=0; i<idx-1; i++){
            temp=temp.next;
        }
        if(temp.next==tail){
            tail=temp;
        }
        temp.next=temp.next.next;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println(size);
    }

}

public class implementionLL {
    public static void main(String[] args) {
        SLL List=new SLL();
        System.out.println(List.size);
        List.insertAtFirst(20);
        List.insertAtFirst(10);
        List.insertAtEnd(30);
        List.insertAtEnd(40);
        List.insertAtEnd(50);
        List.insertAtEnd(60);

        List.insert(5,70);
        System.out.println(List.get(3));
        List.set(0,99);

        List.display();
        System.out.println(List.size);
        List.deleteAtFirst();
        List.display();
        List.delete(5);
        List.display();
        System.out.println(List.tail.val);


    }


}
