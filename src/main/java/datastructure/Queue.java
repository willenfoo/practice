package datastructure;

public class Queue {

    private int[] array;

    private int  front;

    private int  end;

    private int elements;

    public Queue() {
        array = new int[10];
        front = 0;
        elements = 0;
        end = -1;
    }

    public Queue(int size) {
        array = new int[size];
        front = 0;
        elements = 0;
        end = -1;
    }

    public void push(int value) {
        if (++end == array.length) {
            end = 0;
        }
        array[end] = value;
        elements++;
    }

    public int pull() {
        int value = array[front++];
        if (front == array.length) {
            front = 0;
        }
        elements--;
        return value;
    }

    public int peek() {
        return array[front];
    }

    public boolean isEmpty() {
        return elements == 0;
    }

    public boolean isFull() {
        return elements == array.length - 1;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        while (!queue.isEmpty()) {
            System.out.println(queue.pull());
        }

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        while (!queue.isEmpty()) {
            System.out.println(queue.pull());
        }
    }


}

