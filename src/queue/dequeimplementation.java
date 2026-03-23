package queue;

public class dequeimplementation {
    int[] queue;
    int size;
    int front, rear;

    dequeimplementation(int size){
        this.size = size;
        queue = new int[size];
        front = rear = -1;
    }
    boolean isFull() {
        return (front == 0 && rear == size - 1) || (front == rear + 1);
    }


    boolean isEmpty() {
        return front == -1;
    }


    void insertRear(int ele){
        if(isFull()){
            System.out.println("Deque is Full");
            return;
        }

        if(isEmpty()){
            front = rear = 0;
        }
        else if(rear == size - 1){
            rear = 0;
        }
        else{
            rear++;
        }

        queue[rear] = ele;
    }


    void insertFront(int ele){
        if(isFull()){
            System.out.println("Deque is Full");
            return;
        }

        if(isEmpty()){
            front = rear = 0;
        }
        else if(front == 0){
            front = size - 1;
        }
        else{
            front--;
        }

        queue[front] = ele;
    }


    void deleteFront(){
        if(isEmpty()){
            System.out.println("Deque is Empty");
            return;
        }

        if(front == rear){
            front = rear = -1;
        }
        else if(front == size - 1){
            front = 0;
        }
        else{
            front++;
        }
    }

    // Delete from Rear
    void deleteRear(){
        if(isEmpty()){
            System.out.println("Deque is Empty");
            return;
        }

        if(front == rear){
            front = rear = -1;
        }
        else if(rear == 0){
            rear = size - 1;
        }
        else{
            rear--;
        }
    }

    // Display
    void display(){
        if(isEmpty()){
            System.out.println("Deque is Empty");
            return;
        }

        int i = front;
        while(true){
            System.out.print(queue[i] + " ");
            if(i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}