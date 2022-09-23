import java.util.Scanner;
class Student_details{
	int[] enrollment_no=new int[10];
	String[] name=new String[10];
	int[] sem =new int[10];
	double[] cpi =new double[10];

void setdata(){
	Scanner sc=new Scanner(System.in);

	for(int i=1;i<=5;i++){
    System.out.println ("student :"+i);
    System.out.println("enter enrollment_no:");
    enrollment_no[i] =sc.nextInt();
    System.out.println("enter name:");
    name[i] =sc.next();
    System.out.println("enter sem:");
    sem[i]=sc.nextInt();
    System.out.println("enter cpi:");
    cpi[i]=sc.nextDouble();
      System.out.println("\n");
   }
}

void displydata(){
	for(int i=1;i<=5;i++){
    System.out.println ("student :"+i);
	System.out.println("enrollment_no:"+enrollment_no[i]);
	System.out.println("name:"+name[i]);
	System.out.println("sem:"+sem[i]);
	System.out.println("cpi:"+cpi[i]);
         System.out.println("\n");
      }
  }
}
class Studentdemo{
	public static void main(String[] args) {
		Student_details s1=new Student_details();
		s1.setdata();
		s1.displydata();
	}
}