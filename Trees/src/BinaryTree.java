import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){

    }

    private static class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }

    }
    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the Root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to Enter the left Node value: "+  node.value);
        boolean left =  scanner.nextBoolean();
         if (left){
             System.out.println("Enter the left node value : ");
             int value = scanner.nextInt();
             node.left = new Node(value);
             populate(scanner, node.left);
         }

        System.out.println("Do you want to enter the right Node value: "+ node.value);
         boolean right = scanner.nextBoolean();
         if (right){
             System.out.println("Enter teh right  value of node: ");
             int value = scanner.nextInt();
             node.right = new Node(value);
             populate(scanner, node.right);
         }

    }


}
