import packagedouble.DoubleLinkedList;

public class Runner {
    public static void main(String args[]) {
        DoubleLinkedList obj = new DoubleLinkedList();
        obj.add(5);
        obj.insert(4);
        obj.insertAt(1, 6);
        obj.deleteAt(1);
        obj.show();
    }
}
