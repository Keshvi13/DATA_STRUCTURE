
class Delete{
	static class Node{
		int value;
		Node left,right;

		Node(int value){
			this.value=value;
			left=right=null;
		}
	}

	Node root;

	Node temp=root;

	static void inOrder(Node temp){
   	if(temp==null)
   	return;

    inOrder(temp.left);
    System.out.println(temp.value);
    inOrder(temp.right);
   }

   void delete(Node root,Node delNode){
   	
   	Node curent=root;
   	Node parent=null;

   	while(curent!=null && curent.value!=delNode){
   		parent=current;
   		if(delNode<curent.value){
   			curent=curent.left;
   		}
   		else{
   			curent=curent.right;
   		}
   	}
   	if(curent==null){
   		System.out.println("Not found Node in BST");
   		return root;
   	}

   	 if(current.left==null || curent.right==null){
   	 	if(parent.value>curent.value){
   	 		parent.left=null;
   	 	}
   	 	else
   	 		parent.right=null;
   	 }
   }

    public static void main(String[] args) {
   	Delete tree =new Delete();
   	tree.root=new Node(1);
   	tree.root.right=new Node(12);
    tree.root.left=new Node(9);
    tree.root.left.left=new Node(5);
    tree.root.left.right=new Node(6);
    
    System.out.println("IN ORDER TRAVALSAL:");
    tree.inOrder(tree.root);

    tree.delete(root,6);
   }
}