public class Acending{
	public int isaacsending(int a[]){
         int count=0;
         for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
          	return 0;
            }
            if(a[i]==a[i+1]){
          	count++;
            }

            else{
                if(count>=2){
                   count=0;
                   continue;
                }
                else
                 return 0;
              }

        }


          if(count==1 || count==0){
          	return 0;
          }
          return 1;
    }

public static void main(String[] args) {
	Acending a1=new Acending();
	int a[]={1,1,1,5,5,5,8,8,8};
	System.out.println(a1.isaacsending(a));
	int b[]={1,1,1,5,5,8};
	System.out.println(a1.isaacsending(b));
   }
}