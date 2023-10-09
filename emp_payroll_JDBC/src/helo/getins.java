package helo;
import java.util.*;
public class getins {
	Scanner nc= new Scanner(System.in);
	public int id, salary, choice;
	public String name, desig,  branch;

	public void Menu() {
		System.out.println("\t\t\t==========================");
		System.out.println("\t\t\t|         Menu           |");          
		System.out.println("\t\t\t==========================");
		System.out.println("");
		System.out.println("\t\t\t==========================");
		System.out.println("\t\t\t|1| Employee Management  |");
		System.out.println("\t\t\t==========================");
		System.out.println("");
		System.out.println("\t\t\t==========================");
		System.out.println("\t\t\t|2| Exit                 |");
		System.out.println("\t\t\t==========================");
		
		System.out.print("Select : ");
		choice=nc.nextInt();
		}
	public void subMenu() {
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("|1| Add  Employee ");
		System.out.print(" \t|2| Update  Employee ");
		System.out.print(" \t|3| Delete Employee");
		System.out.println(" \t|4| Back ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	
}

	

