import java.util.*;
public class test {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);


    }
}
class MyLinkedList<T>{
    public LinkedList<T> linkedList;
    static class Node {
        int val;
        Node(int val)
        {
            this.val = val;
        };
    }
    Node minNode;
    MyLinkedList() {
        linkedList = new LinkedList<>();
    }
}
class MinStack {
    public MyLinkedList<Integer> myLinkedList;
    public MinStack() {
        myLinkedList = new MyLinkedList<>();
    }

    public void push(int val) {
        myLinkedList.linkedList.addFirst(val);
        if(myLinkedList.minNode == null) {
            myLinkedList.minNode = new MyLinkedList.Node(val);
        }
        if(myLinkedList.minNode.val > val) {
            myLinkedList.minNode.val = val;
        }
    }

    public void pop() {
        if (myLinkedList.linkedList.pop() == myLinkedList.minNode.val) {
            myLinkedList.minNode.val = Integer.MAX_VALUE;
            for(int e : myLinkedList.linkedList) {
                if(myLinkedList.minNode.val > e) {
                    myLinkedList.minNode.val = e;
                }
            }
        }
    }
    public int top() {
        return myLinkedList.linkedList.peek();
    }

    public int getMin() {
        return myLinkedList.minNode.val;
    }

}