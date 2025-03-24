import package1.Linkedlist;

public class Runner {
    public static void main(String[] args) {
        Linkedlist obj = new Linkedlist();
        obj.add(1);
        obj.insert(2);
        obj.insertAt(2,3);
        obj.deleteAt(1);
        obj.show();
    }
}
