package home.javarush.javaSyntax.task13.task1314;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {

        Node x = first;
        try {
            for (int i = -1; i < index; i++)
                x = x.next;
            return x.value;
        }catch (NullPointerException ex){
            return null;
        }
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
