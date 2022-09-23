class Node{
	int value;
	Node left,right;


  Node(int a){
	value=a;
	left=right=null;
   }
}



class InOrder{
   Node root;

   InOrder(){
   	root=null;
   }

   void inOrder(Node n){
   	if(n==null)
   	return;

    inOrder(n.left);
    System.out.println(n.value);
    inOrder(n.right);
   }

    public static void main(String[] args) {
   	InOrder tree =new InOrder();
   	tree.root=new Node(16);
   	tree.root.right=new Node(20);
      tree.root.left=new Node(12);
      tree.root.left.left=new Node(11);
      tree.root.left.right=new Node(14);
      tree.root.left.right.left=new Node(13);
      tree.root.right.left=new Node(19);
    
    System.out.println("IN ORDER TRAVALSAL:");
    tree.inOrder(tree.root);
    
   }
}

//using stack::

Stack<Node> s= new Stack<Node>();
Node curr=root;

while(curr!=null || s.size()>0)
{
   while(curr!=null){
      s.push(curr);
      curr=curr.left;
   }
   curr=s.pop();
   System.out.println(curr.value +"");
   curr=curr.right;
}