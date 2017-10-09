package datastructure;

public class Stack {

    private int[] array;

    private int top;

    public Stack() {
        array = new int[10];
        top = -1;
    }

    public Stack(int size) {
        array = new int[size];
        top = -1;
    }

    public void push(int value) {
        array[++top] = value;
    }

    public int pop() {
        return array[top--];
    }

    public int peek() {
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == array.length - 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
    }


}

