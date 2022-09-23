import java.io.*;
import java.util.Scanner;
   
// Java program to implement
// a Singly Linked List
public class Linkedlist {
   
    Node head; // head of list
   
    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {
   
        int value;
        Node next;
   
        // Constructor
        Node(int a)
        {
            value = a;
            next = null;
        }
    }
   
    // Method to insert a new node
    public static Linkedlist insert(Linkedlist list, int value)
    {
        // Create a new node with given data
        Node n_node = new Node(value);
         
   
        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = n_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
   
            // Insert the new_node at last node
            last.next = n_node;
        }
   
        // Return the list by head
        return list;
    }
   
    // Method to print the LinkedList.
    public static void printList(Linkedlist list)
    {
        Node lastnode = list.head;
    
        System.out.print("LinkedListed form insert: ");
    
        // Traverse through the LinkedList
        while (lastnode != null) {
            // Print the data at current node
            System.out.print(lastnode.value + " ");
    
            // Go to next node
            lastnode = lastnode.next;
        }
    }
    
    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        Linkedlist list = new Linkedlist();
   
        //
        // ******INSERTION******
        //
   
        // Insert the values
        Scanner sc=new Scanner(System.in);
        System.out.println("how to create in insert elements of Linkedlist:");
        int b = sc.nextInt();
        System.out.print("Enter insert :"+b +" elements");
        for(int i=0;i<b;i++){
          
        list = insert(list, sc.nextInt());
       }
       
        // Print the LinkedList
        printList(list);
    }
}