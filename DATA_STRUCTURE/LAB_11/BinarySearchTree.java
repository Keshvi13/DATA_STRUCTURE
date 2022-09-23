import java.util.Scanner;
public class BinarySearchTree

{
     class Node{
        int value;
        Node left,right;

        Node(int value){
             this.value = value;
             this.left=this.right=null;
        }
    }

    Node root;

    //constructor

    BinarySearchTree(){
        root=null;
    }

    public void insert(int value)
    {   
    
        Node nnode=new Node(value);
        
        if(root==null){
            root=nnode;
            System.out.println(root.value);
            return;
        }
        else{

            Node current=root,parent=null;

        
        while(true){
            parent=current;

            if(value<current.value){
                current=current.left;
                
            if(current==null){
                parent.left=nnode;
                    System.out.println(value);
                return;
            }           
        }
    
            else{
                current=current.right;
                if(current==null){
                parent.left=nnode;
                    System.out.println(value);
                return;
               }   
            }
       }
   }
  
}
  
 
 public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();
    System.out.println("BinarySearchTree insert:");
    tree.insert(50);
    tree.insert(30);
    tree.insert(70);
    tree.insert(60);
    tree.insert(10);
    tree.insert(90);
    
 }  
}