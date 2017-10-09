package datastructure;

/**
 * 双向链表
 */
public class TwoWayLinkedList {

    private Node first;

    private Node last;

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public void add(int value) {
        Node node = new Node();
        node.setValue(value);
        if (isEmpty()) {
            last = node;
            node.setPrew(null);
        } else {
            first.setPrew(node);
        }
        node.setNext(first);
        first = node;
    }

    public void addLast(int value) {
        Node node = new Node();
        node.setValue(value);
        if (isEmpty()) {
            first = node;
        } else {
            last.setNext(node);
        }
        last.setPrew(node);
        last = node;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public Node find(int value) {
        Node node = first;
        while (node.getValue() != value) {
            if ((node = node.getNext()) == null) {
                return null;
            }
        }
        return node;
    }

    public void delete(int value) {
        Node node = first;
        Node preNode = null;
        while (node != null) {
            if (node.getValue() == value) {
                Node nextNode = node.getNext();
                preNode.setNext(nextNode);
                nextNode.setPrew(preNode);
                break;
            }
            preNode = node;
            if ((node = node.getNext()) == null) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        TwoWayLinkedList linkedList = new TwoWayLinkedList();
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(4);

        /*linkedList.addLast(7);
        linkedList.addLast(8);
        linkedList.addLast(9);*/

        /*System.out.println(linkedList);*/

        Node node = linkedList.getFirst();
        System.out.println(node.getValue());
        while (node.getNext() != null) {
            node = node.getNext();
            System.out.println(node.getValue());
        }

        System.out.println(linkedList.find(3).getValue());
        System.out.println();
        System.out.println();
        System.out.println();

        linkedList.delete(2);
        node = linkedList.getFirst();
        System.out.println(node.getValue());
        while (node.getNext() != null) {
            node = node.getNext();
            System.out.println(node.getValue());
        }
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "first=" + first +
                '}';
    }

    class Node {
        private int value;

        private Node next;

        private Node prew;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrew() {
            return prew;
        }

        public void setPrew(Node prew) {
            this.prew = prew;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    ", prew=" + prew +
                    '}';
        }
    }
}
