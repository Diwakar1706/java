//package queue;
//
//public class queueimplementation {
//    public static void main(String[] args) {
//
//        Queue q = new Queue();
//
//        q.enqueue(10);
//        q.enqueue(20);
//        q.enqueue(30);
//
//        q.dequeue();
//    }
//    class Queue {
//        int front = -1, rear = -1;
//        int size = 5;
//        int arr[] = new int[size];
//
//        void enqueue(int x) {
//            if (rear == size - 1) {
//                System.out.println("Queue Overflow");
//            } else {
//                if (front == -1)
//                    front = 0;
//                arr[++rear] = x;
//            }
//        }
//
//        void dequeue() {
//            if (front == -1 || front > rear) {
//                System.out.println("Queue Underflow");
//            } else {
//                System.out.println("Removed: " + arr[front++]);
//            }
//        }
//    }
//
//
//
//}
