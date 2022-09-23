class Stackstring{
   static char c[]=new char [10];
	static int top=-1,aa=0,b=0,d=0;
    int i=0;
	public void push(String a,char c[]){
		top++;
        c[i]=a.charAt(top);
        i++;
	}
    public void pop(char c[]){
    	if(c[top]=='a')
    		aa++;
    	else if (c[top]=='b') {        
    		b++;
    	}
    	else{
    		d++;
    	}
    	top--;
      }

  public static void main(String[] args) {
	String a= new String("cdcdefgg");
	
    Stackstring s1=new Stackstring();
    
    for(int i=0;i<a.length();i++){
    	s1.push(a,c);
    }
    for(int i=0;i<a.length();i++){
    	s1.pop(c);
    }
    if(aa==b && d==0)
    	System.out.println("yes STRING IS VALID");
    else
    	System.out.println("no STRING IS NOT VALID");
   }
}