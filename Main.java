import java.util.Scanner;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This program assumes single word String input.
		Scanner input=new Scanner(System.in);
		LinkedListOfEmployees list=new LinkedListOfEmployees();
		int choice;
		String gender;
		int nEmployees;
		
		do {
			System.out.println("\n\n********* Main Menu *********\n");			
			System.out.println("\nChoose one option from the following list ");
			System.out.println("\n\n********* OPTIONS *********\n");
			System.out.println("ENTER 1 To Add a new Employee ");
			System.out.println("ENTER 2 To get the number of Employees of given gender ");
			System.out.println("ENTER 3 To get and display oldest Employee ");
			System.out.println("ENTER 4 To get and display all Employees of a givengender");
			System.out.println("ENTER 5 To view all Male Employees ");
			System.out.println("ENTER 0 To Exit ");
			System.out.println("\nEnter your choice?\n");         
			 
			
			choice=input.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Id, Name, Gender and Age of Employee ");
				Employee e = new Employee(input.nextInt(),input.next(),input.next(),input.nextInt());
				list.insertAtBack(e);
				System.out.println("Guest Added Successfully");
				break;
			case 2:
				System.out.println("Enter Gender");
				gender=input.next();
				System.out.println("No Of "+gender+" Employees are "+list.countEmployees(gender));
				break;
			case 3:
				Employee oldest=list.getOldestEmployee();
				if(oldest!=null)
				{
					System.out.println("Oldest Employee in the List is");
					oldest.displayEmployeeInfo();
				}
				else
					System.out.println("List is Empty");
				break;
			case 4:
				System.out.println("Enter Gender");
				gender=input.next();
				nEmployees=list.countEmployees(gender);
				if(nEmployees==0)
					System.out.println("No Employee of this Gender Found");
				else
				{
					LinkedListOfEmployees l=list.getEmployees(gender);
					l.display();
				}
				break;
			case 5:
				nEmployees=list.countEmployees("Male");
				if(nEmployees==0)
					System.out.println("No Employee of Male Gender Found");
				else
				{
					LinkedListOfEmployees l=list.getEmployees("Male");
					l.display();
				}
				break;
			}
		}
		while(choice !=0);
	}
}