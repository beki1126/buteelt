package buteelt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(100);
        Scanner sc = new Scanner(System.in);

        System.out.println("ta heden element oruulh be: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            queue.enqueue(sc.nextInt());
        }

        boolean swtch = true;
        while (swtch) {
            System.out.println("\n1)daraallaas elementiig hasah()\n"
                    + "2) Daraalald element nemeh()\n"
                    + "3) urd taliin element()\n"
                    + "4) Hoid taliin element()\n"
                    + "5) Daraalal dahi elementiin too()\n"
                    + "6) Uldsen daraalliin too()\n");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("\n" + queue.dequeue() + " Daraallaas hasagdsn element\n");
                    break;
                case 2:
                    queue.enqueue(sc.nextInt());
                    System.out.println("\n" + queue.rear() + " Daraalald nemegdsn element\n");
                    break;
                case 3:
                    System.out.println("Urd taliin element: " + queue.front());
                    break;
                case 4:
                    System.out.println("Hoid taliin element: " + queue.rear());
                    break;
                case 5:
                    System.out.println("daraalal dahi elementiin too :" + queue.size);
                    break;
                case 6:
                    System.out.println("uldsenTaraalliinToo: " + queue.uldsenTaraalliinToo());
                    break;

             
                default:
                    swtch = false;
                    break;
            }
        }
    }

    static class MyQueue {
        int front, rear, size;
        int capacity;
        int array[];

        public MyQueue(int capacity) {
            this.capacity = capacity;
            this.front = this.size = 0;
            this.rear = capacity - 1;
            this.array = new int[this.capacity];
        }

        boolean isFull() {
            return (size == capacity);
        }

        boolean isEmpty() {
            return (size == 0);
        }

        void enqueue(int item) {
            if (isFull()) {
                System.out.println("Daraalal duuren bn");
                return;
            }
            rear = (rear + 1) % capacity;
            array[rear] = item;
            size++;
            System.out.println(item + " daraalald orson");
        }

        int dequeue() {
            if (isEmpty()) {
                System.out.println("Daraalal hooson bn.");
                return Integer.MIN_VALUE;
            }
            int item = array[front];
            front = (front + 1) % capacity;
            size--;
            return item;
        }

        int front() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            return array[front];
        }

        int rear() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            return array[rear];
        }
        int uldsenTaraalliinToo() {
            return (capacity - size);
        }
    }
}