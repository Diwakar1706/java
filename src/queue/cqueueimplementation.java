package queue;

public class cqueueimplementation {
    int[] queue;
    int size;
    int front,rear;
    cqueueimplementation(int size){
        this.size=size;
        queue=new int[size];
        front=rear=-1;
    }

    void enqueue (int ele){
        if(front==0 && rear==size-1 || front==rear+1){

        }else {
            if (front == -1)
                front = rear = 0;
            else {
                rear = (rear + 1) % size;
                queue[rear] = ele;


            }
        }
    }
    void dequeue(){
        if(front==-1 && rear==-1){
            System.out.println("empty");
        }
        else{
            if(front==rear){
                front=rear=-1;
            }else{
                front=(front+1)%size;
            }
        }

    }


    public static void main(String[] args) {
        cqueueimplementation t1=new cqueueimplementation(5);
        t1.enqueue(10);

    }




}
