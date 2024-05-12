package DoubleLinkedlist;

public class DoublelinkedList {
    Node head;
    int size;

    public DoublelinkedList() {
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node(head, item, head);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(int item){
        if (isEmpty()) {
            addFirst(item);
        }else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (size ==1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast()throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        }else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i =0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev ==null) {
                Node newNode = new Node(current, item, current);
                current = newNode;
                head= newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    public int size(){
        return size;
    }
    public void clear(){
        head = null;
        size= 0;
    }
    public void print(){
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("linked List Kosong");
        }
    }
}
    class doubleLinkedlistMain{
        public static void main(String[] args) throws Exception {
            DoublelinkedList dll = new DoublelinkedList();
            dll.print();
            System.out.println("Size: "+ dll.size());
            System.out.println("====================================");
            dll.addFirst(3);
            dll.addLast(4);
            dll.addFirst(7);
            dll.print();
            System.out.println("Size: "+dll.size());
            System.out.println("=====================================");
            dll.add(40, 1);
            dll.print();
            System.out.println("Size: "+dll.size());
            System.out.println("=====================================");
            dll.clear();
            dll.print();
            System.out.println("Size: "+dll.size());
            System.out.println("=====================================");
            dll.addLast(50);
            dll.addLast(40);
            dll.addLast(10);
            dll.addLast(20);
            dll.print();
            System.out.println("Size: "+dll.size());
            System.out.println("======================================");
            dll.removeFirst();
            dll.print();
            System.out.println("Size: "+dll.size());
            System.out.println("======================================");
            dll.removeLast();
            dll.print();
            System.out.println("Size: "+dll.size());
            System.out.println("======================================");
            dll.remove(1);
            dll.print();
            System.out.println("Size: "+dll.size());
        }
    }
