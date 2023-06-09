/*
* Реализовать следующие методы в классе MyLinkedList, реализованном на уроке
1. public int size() - получить размер списка
2. public boolean contains(int value) - проверить наличие элемента в списке
3.* public MyLinkedList reversed() - создать НОВЫЙ список с обратным порядком
*/

package JAVA_Algorithms.Homework2;

public class MyLinkedList {
    Node head;

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    /**
     * Метод проверки списка на наличие элементов
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Метод поиска последнего элемента
     */
    private Node findLast() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    /**
     * Метод добавления нового элемента
     */
    public void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node last = findLast();
            last.next = new Node(value);
        }
    }

    /**
     * Метод определения длины списка
     */
    public int size() {
        Node current = head;
        int count = 0;
        if (head == null)
            return 0;
        else {
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
    }

    /**
     * Метод поиска эелемента
     */
    public boolean contains(int value) {
        Node current = head;

        while (current != null) {
            if (current.value == value)
                return true;
            current = current.next;
        }
        return false;
    }

    /**
     * Метод разворота списка
     */
    public MyLinkedList reversed() {
        MyLinkedList reverseadList = new MyLinkedList();
        addRecursiv(head, reverseadList);
        reverseadList.add(head.value);
        return reverseadList;
    }

    private void addRecursiv(Node node, MyLinkedList list) {
        if (node.next != null) {
            addRecursiv(node.next, list);
            list.add(node.next.value);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = head;
        while (current != null) {
            sb.append(current.value).append(" -> ");
            current = current.next;
        }
        int length = sb.length();
        if (length > 4)
            sb.delete(length - 4, length);
        sb.append("]");

        return sb.toString();
    }
}