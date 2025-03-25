package packagedouble;

public class DoubleLinkedList {
    Node head;

    public void add(int data) {
        Node node = new Node();
        node.data = data;
        node.previous = null;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
            node.previous = n;
        }
    }

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.previous = null;
        node.next = head;
        head.previous = node;
        head = node;

    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.previous = null;
        node.next = null;

        if (index == 0) {
            insert(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
            node.previous = n;
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            Node n1 = n.next;
            Node n2 = n1.next;
            n.next = n2;
            n2.previous = n;
            n1 = null;
        }
    }

    public void show() {
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
}
