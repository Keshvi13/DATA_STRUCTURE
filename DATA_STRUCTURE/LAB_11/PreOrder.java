class Node{
	int value;
	Node left,right;

 Node(int a){
	value=a;
	left=right=null;
  }
}


class PreOrder{
	Node root;

	PreOrder(){
		root=null;
	}

	void preOrder(Node n){
		if(n==null){
			return;
		}
		System.out.println(n.value);
	    preOrder(n.left);
	    preOrder(n.right);
	    
	}

	 public static void main(String[] args) {
	  PreOrder tree=new PreOrder();
	  tree.root=new Node(16);
   	  tree.root.right=new Node(20);
      tree.root.left=new Node(12);
      tree.root.left.left=new Node(11);
      tree.root.left.right=new Node(14);
      tree.root.left.right.left=new Node(13);
      tree.root.right.left=new Node(19);
      tree.preOrder(tree.root);
	}
}

//using Stack::

Stack<Node> s= new Stack<Node>();
Node curr=root;

while(curr!=null || s.size()>0)
{
   while(curr!=null){
      s.push(curr);
       System.out.println(curr.value +"");
      curr=curr.left;
   }
   curr=s.pop();
   curr=curr.right;
}