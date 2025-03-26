import packagelist.DoubleLinkedList;
import packagelist.SingleLinkedList;

public class Runner {
    public static void main(String[] args) {
        //For Circular single linked list 
        SingleLinkedList obj1 = new SingleLinkedList();
        obj1.add(2);
        obj1.add(3);
        obj1.insert(1);
        obj1.insertAt(2,6);
        obj1.add(4);
        obj1.deleteAt(2);
        obj1.show();


        //For Circular double linked list 
        DoubleLinkedList obj2 = new DoubleLinkedList();
    }
}