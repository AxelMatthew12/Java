package DoubleLinkedlist;

public class main {
    public static void main(String[] args) {
        DoublelinkedList dll = new DoublelinkedList();
        dll.print();
        System.out.println("Size : "+ dll.size());
        System.out.println("========================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==============================================");
        
    }
}
