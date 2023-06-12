package JAVA_Algorithms.Homework3;

public class Main {

    public static void main(String[] args) {

        Tree<Integer> tree = new Tree<>();
        tree.add(2);
        tree.add(3);
        tree.add(9);
        tree.add(1);
        tree.add(5);
        tree.add(14);
        tree.add(4);
        tree.add(12);
        System.out.println(tree.contains(12));
    }

}