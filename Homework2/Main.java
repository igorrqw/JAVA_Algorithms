package JAVA_Algorithms.Homework2;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        boolean empty = myList.isEmpty();
        if (empty)
            System.out.println("Длина списка: " + myList.size() + " элементов");
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        System.out.println(myList);
        System.out.println("Длина списка: " + myList.size() + " элементов");
        int searchElement = 12;
        boolean hasElement = myList.contains(searchElement);
        if (hasElement)
            System.out.println("Элемент " + searchElement + " есть в списке!");
        else
            System.out.println("Элемента " + searchElement + " нет");
        MyLinkedList newList = new MyLinkedList();
        newList = myList.reversed();
        System.out.println(newList);
    }
}