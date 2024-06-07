import java.util.*;
public class LinkedListExample{
    public static void main(String[] args) {

        // name of the LinkedList = linked list
        LinkedList<String> linkedList = new LinkedList<String>();

        //  stack = LIFO; ex = stack of CD's

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        System.out.println(linkedList);
        // F D C B A

        // queue
        // linkedList.offer("A");
        // linkedList.offer("B");
        // linkedList.offer("C");
        // linkedList.offer("D");
        // linkedList.offer("F");
    }
}