package CRUD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

class Employee{
	int employeeId;
	String employeename;
	int employeesalary;
	

	public Employee(int employeeId, String employeename, int employeesalary) {
		super();
		this.employeeId = employeeId;
		this.employeename = employeename;
		this.employeesalary = employeesalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeename() {
		return employeename;
	}


	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}


	public int getEmployeesalary() {
		return employeesalary;
	}


	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeename=" + employeename + ", employeesalary="
				+ employeesalary + "]";
	}


	

}

public class Employ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		ArrayList<Employee> employee = new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		do
		{
		System.out.println("1. Insert");
		System.out.println("2. Display");
		System.out.println("3. Search");
		System.out.println("4. Update");
		System.out.println("5. Delete");
		System.out.println("6. Exit");

		choice=sc.nextInt();
		switch(choice) {
		case 1:

			System.out.println("eneter the Employee id");
			int employeeId=sc.nextInt();
			System.out.println("eneter the Employee name");
			String employeename=sc1.nextLine();
			System.out.println("eneter the Employee salary");
			int employeesalary=sc.nextInt();
			Employee e=new Employee(employeeId,employeename,employeesalary);
			employee.add(e);
			System.out.println("employee details added sucessfully");
            break;
            
            
		case 2:
			Iterator<Employee> itr=employee.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			break;
			
		case 3:
			boolean status=false;
			System.out.println("enter the employee id");
			int employeeId2 = sc.nextInt();
			Iterator<Employee> itr1=employee.iterator();
			while(itr1.hasNext()) {
				Employee e1=itr1.next();
				if(e1.getEmployeeId()==employeeId2) {
				
					System.out.println(e1);
					status=true;
				}
			}
			if(status==false) {
				System.out.println("employee details not found");
			}
			break;
			
			
		case 4:
			/*System.out.println("enter the employee name");
			String employeename1 = sc1.nextLine();
			System.out.println("enter name to update");
			String empname = sc1.nextLine();
			Iterator<Employee> itr3=employee.iterator();
			while(itr3.hasNext()) {
				Employee e1=itr3.next();
				if(e1.getEmployeename().equals(employeename1)) {
					e1.setEmployeename(empname);
				}
			}
			break;*/
			boolean found=false;
			System.out.println("enter the employee id");
			int Id2 = sc.nextInt();
			ListIterator<Employee> itr2=employee.listIterator();
			while(itr2.hasNext()) {
				Employee e1=itr2.next();
				if(e1.getEmployeeId()==Id2) {
				
					System.out.println("Please enter the new name");
					String newname=sc1.nextLine();
					System.out.println("Enter the new salary");
					int newsalary=sc.nextInt();

					Employee e3=new Employee(Id2,newname,newsalary);
					itr2.set(e3);
					
					found=true;
				}
			}
			if(found==false) {
				System.out.println("employee details not found");
			}
			else
			{
				System.out.println("Details updated sucessfully");
			}
			break;
			
			
			
			
		case 5:
			/*System.out.println("enter the employee id");
			int employeeId3 = sc.nextInt();
			Iterator<Employee> itr3=employee.iterator();
			while(itr3.hasNext()) {
				Employee e1=itr3.next();
				if(e1.getEmployeeId()==employeeId3) {
					itr3.remove();
				}
			}
			
			break;*/
		
			boolean found1=false;
			System.out.println("enter the employee id to be deleted");
			int Id3 = sc.nextInt();
			ListIterator<Employee> itr3=employee.listIterator();
			while(itr3.hasNext()) {
				Employee e1=itr3.next();
				if(e1.getEmployeeId()==Id3) {
					itr3.remove();
					
					found1=true;
				}
			}
			if(found1==false) {
				System.out.println("employee details not found");
			}
			else
			{
				System.out.println("employee details are deleted");
			}
			break;
			
			
			
		default:
			System.out.println("Invalid input");
			break;
		}

		
		
		
		
		}while(choice!=0);
	}

	private static Scanner nextLine() {
		// TODO Auto-generated method stub
		return null;
	}

}
