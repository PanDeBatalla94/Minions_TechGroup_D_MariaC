package avlTree;

import java.util.ArrayList;
import java.util.List;

public class AvlTree {
    private Node root;

    public void insert(Comparable value) {
        Node newNode = new Node(value);
        if(root == null) {
            this.root = newNode;
        } else {
            this.insert(newNode, this.root);
        }
    }


    public void insert(Node newNode, Node customRoot) {
        Node current = customRoot;
        if (newNode.value.compareTo(customRoot.value) < 0) {
            if(current.left == null) {
                current.left = newNode;
            } else {
                this.insert(newNode, current.left);
            }

        } else {
            if (current.right == null) {
                current.right = newNode;
            } else {
                this.insert(newNode, current.right);
            }
        }

        //get current height
        current.height = Math.max(height(current.left), height(current.right)) + 1;
        //get balance
        int balance = getBalance(current);
        //if balance is not in range {-1,0,1}
        if(balance > 1) {
            if (newNode.value.compareTo(current.left.value) < 0) {
                current = rightRotate(current);
            } else {
                current.left =  leftRotate(current.left);
                current = rightRotate(current);
            }
        } else if (balance < -1){
            if (newNode.value.compareTo(current.right.value) < 0) {
                current.right =  rightRotate(current.right);
                current = leftRotate(current);
            } else {
                current = leftRotate(current);
            }
        }


    }
    public Node leftRotate(Node current) {
        Node aux = current.left;
        current.left = aux.right;
        aux.right = current;

        current.height = Math.max(height(aux.left), height(aux.right))+1;
        aux.height = Math.max(height(current.left), height(current.right))+1;

        return aux;
    }

    public Node rightRotate(Node current) {
        Node aux = current.right;
        current.right = aux.left;
        aux.left = current;

        current.height = Math.max(height(aux.left), height(aux.right))+1;
        aux.height = Math.max(height(current.left), height(current.right))+1;

        return aux;
    }

    private int height (Node current) {
        if (current == null)
            return 0;
        return current.height;
    }

    private int getBalance(Node current) {
        if (current == null)
            return 0;
        return height(current.left) - height(current.right);
    }


}
