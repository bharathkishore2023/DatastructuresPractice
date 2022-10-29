import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list.insertAtBeginning(9);
        list.insertAtBeginning(5);
        list.insertAtBeginning(6);
        list.insertAtBeginning(7);
        list.display();
        System.out.println(" ");
        list.insertAtPosition(3, 25);
        list.display();
        System.out.println("");
        list.deletePosition(0);
        list.display();
        System.out.println("");
        list.getPosition(25);
        System.out.println("");
        list.updatePosition(2, 999);
        list.display();
        System.out.println(" ");
        list.deleteAtEnd();
        list.display();
        System.out.println(" ");
        list.insertAtEnd(456);
        list.display();
    }
}