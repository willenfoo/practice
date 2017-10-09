package datastructure;

/**
 * 二叉树, 结合了有序数组跟链表的优点
 */
public class BinaryTree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void add(int value) {
        Node node = new Node(value);
        Node current = root;
        Node parent;
        if (root == null) {
            root = node;
        } else {
            while (true) {
                parent = current;
                if (current.getData() > value) {
                    current = current.getLeftChild();
                    if (current == null) {
                        parent.setLeftChild(node);
                        break;
                    }
                } else {
                    current = current.getRightChild();
                    if (current == null) {
                        parent.setRightChild(node);
                        break;
                    }
                }
            }
        }
    }

    public Node find(int value) {
        Node current = root;
        while (current != null && current.getData() != value) {
            if (current.getData() > value) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
        }
        return current;
    }

    public void delete(int value) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while (current != null && current.getData() != value) {
            parent = current;
            if (current.getData() > value) {
                current = current.getLeftChild();
                isLeftChild = true;
            } else {
                current = current.getRightChild();
                isLeftChild = false;
            }
        }
        if (current == null) {

        } else if (current.getLeftChild() == null && current.getRightChild() == null) {
            if (current == root) {
                root = null;
            } if (isLeftChild) {
                parent.setLeftChild(null);
            } else {
                parent.setRightChild(null);
            }
        } else if (current.getLeftChild() == null) {
            if (current == root) {

            } else if (isLeftChild) {
                parent.setLeftChild(current.getLeftChild());
            } else {
                parent.setRightChild(current.getLeftChild());
            }
        } else {
            if (isLeftChild) {
                parent.setLeftChild(current.getRightChild());
            } else {
                parent.setRightChild(current.getRightChild());
            }
        }
    }

    /**
     * 前序便利
     *
     * @param root
     */
    public void frontOrder(Node root) {
        if (root != null) {
            System.out.println(root.getData() + "");
            frontOrder(root.getLeftChild());
            frontOrder(root.getRightChild());
        }
    }

    /**
     * 中序便利
     *
     * @param root
     */
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.getLeftChild());

            System.out.println(root.getData() + "");

            inOrder(root.getRightChild());
        }
    }

    /**
     * 后序便利
     *
     * @param root
     */
    public void lastOrder(Node root) {
        if (root != null) {
            lastOrder(root.getLeftChild());
            lastOrder(root.getRightChild());
            System.out.println(root.getData() + "");
        }
    }


    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(10);
        binaryTree.add(20);
        binaryTree.add(15);
        binaryTree.add(3);

        System.out.println(binaryTree.getRoot().getData());
        System.out.println(binaryTree.getRoot().getRightChild().getData());
        System.out.println(binaryTree.getRoot().getRightChild().getLeftChild().getData());
        System.out.println(binaryTree.getRoot().getLeftChild().getData());

        System.out.println(binaryTree.find(10));

        //binaryTree.frontOrder(binaryTree.getRoot());
        //binaryTree.inOrder(binaryTree.getRoot());

        binaryTree.delete(3);
        binaryTree.lastOrder(binaryTree.getRoot());
    }

    class Node {

        private int data;

        private Node leftChild;

        private Node rightChild;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", leftChild=" + leftChild +
                    ", rightChild=" + rightChild +
                    '}';
        }
    }
}
