import java.util.*;
public class LinkedListExample{
    public static void main(String[] args) {

        // Linked List = store Nodes in 2 parts (data + address)
        // Nodes are in non-consecutive memory locations

        // name of the LinkedList = linked list
        LinkedList<String> linkedList = new LinkedList<String>();
        // we can treat or Linked List as a queue or a stack

        // queue = FIFO; ex = queue of a market
        // equeue = offer(); dequeue = poll();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        // linkedList.poll();

        // add and remove
        linkedList.add(4, "E");
        linkedList.remove("E");

        // indexOf an element
        System.out.println("Index of C = " + linkedList.indexOf("C" ) + " \n");

        // peek elements
        System.out.println("First element: " + linkedList.peekFirst() + " \n");
        System.out.println("Last element: " + linkedList.peekLast() + " \n");
        // addFirst and addLast
        linkedList.addFirst("0");
        linkedList.addLast("G");

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        // print list
        System.out.println("List: " + linkedList + " \n");
        System.out.println("After addFirst and addLast, the first element is " + first + 
        " and the last is " + last);

    }
}