package archi;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        MyQueue<Object> queue = new MyQueue<>(10);
        Scanner sc = new Scanner(System.in);

        System.out.println("Та хэдэн бүтээгдэхүүн оруулах вэ? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= n; i++) {
            char b = sc.nextLine().charAt(0);
            queue.enqueue(b);
        }

        boolean swtch = true;
        while (swtch) {
            System.out.println("\n1) Дарааллаас элэмент устгах()\n"
                    + "2) Дараалалд элемент нэмэх()\n"
                    + "3) Хамгийн эхний элемент()\n"
                    + "4) Хамгийн сүүлийн элемент()\n"
                    + "5) Дараалал дахь нийт элементийн тоо()\n"
                    + "6) Дараалалд байгаа элементүүдийн тоо()\n"
                    + "7) Жагсаалт харах\n");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("\n" + queue.dequeue() + " Дарааллаас хасагдсан элемент\n");
                    break;
                case 2:
                    char element = sc.next().charAt(0);
                    queue.enqueue(element);
                    System.out.println("\n" + element + " Дараалалд нэмэгдсэн элемент\n");
                    break;
                case 3:
                    System.out.println("Хамгийн эхний элемент: " + queue.front());
                    break;
                case 4:
                    System.out.println("Хамгийн сүүлийн элемент: " + queue.rear());
                    break;
                case 5:
                    System.out.println("Дараалал дахь элементийн тоо: " + queue.size());
                    break;
                case 6:
                    System.out.println("Үлдсэн элементийн тоо: " + queue.remainingCapacity());
                    break;
                case 7:
                    System.out.println("Дарааллын хувийн жагсаалт: ");
                    queue.display();
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
        T[] array;

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

        void enqueue(T b) {
            if (isFull()) {
                System.out.println("Дараалал дүүрэн байна");
                return;
            }
            rear = (rear + 1) % capacity;
            array[rear] = b;
            size++;
            System.out.println(b + " Дараалалд орсон");
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

        // Method to display the contents of the queue
        void display() {
            if (isEmpty()) {
                System.out.println("Дараалал хоосон байна");
                return;
            }
            System.out.println("Дарааллын хувийн жагсаалт:");
            int i = front;
            while (i != rear) {
                System.out.print(array[i] + " ");
                i = (i + 1) % capacity;
            }
            System.out.println(array[rear]);
        }
    }
}
