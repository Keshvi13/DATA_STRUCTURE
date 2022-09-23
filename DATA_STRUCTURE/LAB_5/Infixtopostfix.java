import java.util.*;
class Infixtopostfix{
	String infix;

	
	char a[];
	int top;

	 Infixtopostfix(String st)
	 {
		infix=st;
		a=new char[infix.length()];
		top=-1;
	}

	int precedence(char op){
		switch(op){
			case'^':return 5;
			case'/':
			case'*':return 4;
			case'+':
			case'-':return 3;
			default:return 0;
		}
	}

	void push(char val){
		if(top==a.length-1){
			System.out.println("Stack Overflow Error");
		}
		else{
			top++;
			a[top]=val;
		}
	}
   
   char pop(){
   	    if(top==-1)
   	    	return '#';
   	    else{
   	    	char k=a[top];
   	    	top--;
   	    	return k;
   	    }
   }
   String converttopostfix(){
   	String post="";
   	char k;
   	infix="("+infix+")"; //adding parenthesis at both the sides of infix

   	for(int i=0;i<infix.length();i++)
   	{
   		k=infix.charAt(i);
   		if(k!='^' && k!='/' && k!='*' && k!='+' && k!='-' && k!=')' && k!='(')
   			post=post+k;
   		else
   			if(k=='(')
   				push(k);
   			else
   				if(k==')')
   				{
   					while((k=pop())!='(')
   					{
   						post=post+k;
   					}
   				}
   				else
   				{
   					int p1=precedence(k);
   					int p2=precedence(a[top]);
   					if(p1>p2)
   					{
   						push(k);
   					}
   					else
   					{
   					    char ch;
   						while (p1<=p2)
   						{
   							ch=pop();
   							post=post+ch;
   							p2=precedence(a[top]);
   						}
   						push(k);
   					 }
   				}
        }
     return post;      
   } 

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter infix expression");
	String st = sc.nextLine();
	Infixtopostfix obj1 = new Infixtopostfix(st);
	String postfix = obj1.converttopostfix();
	System.out.println("postfix expression:"+postfix);
  }
}