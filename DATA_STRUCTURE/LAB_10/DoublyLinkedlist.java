import java.io.*;
import java.util.Scanner;
   
  class Doubly_Linkedlist{
   
    Node head,last; 

     class Node {
   
        int value;
        Node next;
        Node prev;
   
        // Constructor
        Node(int a)
        {
            value = a;
            next = null;
            prev = null;
        }
    }

    //insert a node at frout of the linked list

    public void insertatend(int new_value)
    {
        // Create a new node with given data
        Node n_node = new Node(new_value);
        n_node.next=null;
        if(head==null){
            head=n_node;
            last=n_node;
        }
       
        else{
            last.next=n_node;
            n_node.prev=last;
            last=n_node;

        }
    }

    public void insertatfront(int new_value)
    {
        // Create a new node with given data
        Node n_node = new Node(new_value);
        if(head==null){
            head=last=n_node;
            head.prev=null;
            last.next=null;
        }
        else{
            head.prev=n_node;
            n_node.next=head;
            n_node.prev=null;
            head=n_node;
        }
    }

    public void display(){
       Node d_node=head;       
        while(d_node!=null){
        System.out.print(d_node.value+" ");
        d_node=d_node.next;       
      }
    }

   public void deleteposition(int position)
    {
        if(head==null || position<=0)
            return ;

        Node temp=head;


        //find previous node of the node to be deleted
        for(int i=1;temp!=null && i<position;i++){
            temp=temp.next;         
         }

            if(temp==null)
                return ;

            Node next=temp.next.next;
            temp.next=next;        
    }
    
}

  public class  DoublyLinkedlist{
    public static void main(String[] args) {
        Doubly_Linkedlist list = new Doubly_Linkedlist();
        Scanner sc=new Scanner(System.in);
        while(true){
               System.out.print("\n1.insert a node at the front of the stack in Linkedlist:\n2.display node:\n3.insert at end of the linked list\n4.delete a node from specifice position\n5.exit\n\nenter opration number:");
               int n=sc.nextInt();
            
               if(n==1){
                        System.out.println("how to create in insert elements of Linkedlist in stack:");
                        int b = sc.nextInt();
                        System.out.print("Enter insert = "+b+" elements :\n");
                        for(int i=0;i<b;i++){
                           list.insertatfront(sc.nextInt());
                                  }
                           System.out.println("insert elements is:");
                           list.display();
                           System.out.println("\n");
                       }

                else if(n==2){
                      System.out.print("display elements is:");
                       list.display();
                  System.out.println("\n"); 
                 }  
                 else if(n==3){
                       System.out.println("how to create in insert elements of Linkedlist in stack:");
                        int b = sc.nextInt();
                        System.out.print("Enter insert = "+b+" elements :\n");
                        for(int i=0;i<b;i++){
                           list.insertatend(sc.nextInt());
                                  }
                           System.out.println("insert elements is:");
                           list.display();
                           System.out.println("\n");
                 }  
                 else if(n==4){
                System.out.println("enter delete position:");
                int c= sc.nextInt();
                list.deleteposition(c);
                System.out.println("linked list after deletion at position:"+c);
                list.display();
                  System.out.println("\n");                     
               }
                 else if(n==5){
                    break;
                 }
    }
}   
}