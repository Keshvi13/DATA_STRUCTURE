import java.util.Scanner;
class Employee_details{
	int employee_id;
	String name;
	String designation;
	String salary;

void setdata(){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter employee_id:");
  employee_id=sc.nextInt();
  System.out.println("enter name:");
  name=sc.next();
  System.out.println("enter designation:");
  designation=sc.next();
  System.out.println("enter salary:");
  salary=sc.next();
}

void displydata(){
	System.out.println("employee_id:" +employee_id);
	System.out.println("name:" +name);
	System.out.println("designation:" +designation);
	System.out.println("salary:" +salary);
  }
}

class Employeedemo{
	public static void main(String[] args) {
		Employee_details e1=new Employee_details();
		e1.setdata();
		e1.displydata();
	}
}