import java.util.*;
public class LinkedListExample{
    public static void main(String[] args) {

        // name of the LinkedList = linked list
        LinkedList<String> linkedList = new LinkedList<String>();
        // we can treat or Linked List as a queue or a stack

        //  stack = LIFO; ex = stack of CD's
        // add = push(); remove = pop()
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();
        System.out.println(linkedList);
        // D C B A

        // queue = FIFO; ex = queue of a market
        // add = offer(); remove = poll();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        linkedList.poll();
        System.out.println(linkedList);
        // BCDF
    }
}