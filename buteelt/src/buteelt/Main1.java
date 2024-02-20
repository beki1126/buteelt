package buteelt;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>(100);
        Scanner sc = new Scanner(System.in);

        System.out.println("Та хэдэн элемент оруулах вэ? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            queue.enqueue(sc.nextInt());
        }

        boolean swtch = true;
        while (swtch) {
            System.out.println("\n1)Дараалалаас элэмент устгах()\n"
                    + "2) дараалалад элемент нэмэх()\n"
                    + "3) хамгийн эхний элемэнт()\n"
                    + "4) хамгийн хойд талийн элемент()\n"
                    + "5) дараалал дахь нийт элемэнтийн тоо()\n"
                    + "6) үлдсэн дараалалийн тоо()\n");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("\n" + queue.dequeue() + "Дараалалаас хасагдсан элемент\n");
                    break;
                case 2:
                    queue.enqueue(sc.nextInt());
                    System.out.println("\n" + queue.rear() + " дараалалд нэмэгдсэн элемент\n");
                    break;
                case 3:
                    System.out.println("Хамгийн эхний элемент: " + queue.front());
                    break;
                case 4:
                    System.out.println("хамгийн сүүлийн элемент: " + queue.rear());
                    break;
                case 5:
                    System.out.println("дараалал дахь элементийн тоо :" + queue.size());
                    break;
                case 6:
                    System.out.println("үлдсэн элементийн тоо: " + queue.remainingCapacity());
                    break;

             
                default:
                    swtch = false;
                    break;
            }
        }
    }

    static class MyQueue<T> {
        int front, rear, size;
        int capacity;
        T array[];

        public MyQueue(int capacity) {
            this.capacity = capacity;
            this.front = this.size = 0;
            this.rear = capacity - 1;
            this.array = (T[]) new Object[this.capacity];
        }

        boolean isFull() {
            return (size == capacity);
        }

        boolean isEmpty() {
            return (size == 0);
        }

        void enqueue(T item) {
            if (isFull()) {
                System.out.println("Дараалал дүүрэн байна");
                return;
            }
            rear = (rear + 1) % capacity;
            array[rear] = item;
            size++;
            System.out.println(item + " дараалалд орсон");
        }

        T dequeue() {
            if (isEmpty()) {
                System.out.println("Дараалал хоосон байна");
                return null;
            }
            T item = array[front];
            front = (front + 1) % capacity;
            size--;
            return item;
        }

        T front() {
            if (isEmpty()) {
                return null;
            }
            return array[front];
        }

        T rear() {
            if (isEmpty()) {
                return null;
            }
            return array[rear];
        }

        int size() {
            return size;
        }

        int remainingCapacity() {
            return capacity - size;
        }
    }
}