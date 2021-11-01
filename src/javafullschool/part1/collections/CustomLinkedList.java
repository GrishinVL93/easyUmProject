package javafullschool.part1.collections;

public class CustomLinkedList<Element> {

    private Node<Element> first;
    private Node<Element> last;

    private int size;

    public int size() {
        return size;
    }

    public Element first(){
        return first.item;
    }

    public Element last(){
        return last.item;
    }
    public void addFirst(Element element){
        Node<Element> newFirstElement = new Node<>(element, first, null);
        Node<Element> tmpFirst = first;
        tmpFirst.prev = newFirstElement;
        first = newFirstElement;
        size++;
    }

    /*private Node<Element> getNode*/

    public void add(Element element){
        if(first == null){
            Node<Element> node = new Node<>(element, null, null);
            first = node;
            last = node;
            size++;
        }
        else {
            Node<Element> node = new Node<>(element, null, last);
            last.next = node;
            last = node;
            size++;
        }
    }

    public Element get(int index){
        Node<Element> result = first;
        for( int i = 0; i < index; i++){
            result = result.next;
        }
        return result.item;
    }

    private static class Node<Element>{
        Element item;
        Node<Element> next;
        Node<Element> prev;

        public Node(Element item, Node<Element> next, Node<Element> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}
