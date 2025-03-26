package packagelist;

public class SingleLinkedList {
    Node head;

    public void add(int data) {
        Node node = new Node();
        node.data = data;
        if (head == null) {
            head = node;
            node.next = head;
        } else {
            Node n = head;
            while (n.next != head) {
                n = n.next;
            }
            n.next = node;
            node.next = head;
        }
    }

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;

        Node n = head;
        while (n.next != head) {
            n = n.next;
        }
        head = node;
        n.next = head;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;

        if (index == 0) {
            insert(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index) {
        Node n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        Node n1 = n.next;
        n.next = n1.next;
        n1 = null;
    }

    public void show() {
        Node n = head;
        while (n.next != head) {
            System.out.println(n + " " + n.data + " " + n.next);
            n = n.next;
        }
        System.out.println(n + " " + n.data + " " + n.next);
    }
}

