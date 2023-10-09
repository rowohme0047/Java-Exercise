import java.sql.*;
import java.util.*;
import helo.getins;
import helo.Emp_mgm;
public class jdbcdemo {
		
	public static void main(String[] args) throws Exception{
		getins g=new getins();
		Emp_mgm mm= new Emp_mgm();
		Scanner sc=new Scanner(System.in);
		System.out.println("***********************************************************************************************************************************************************************************");
		System.out.println("\t\t\t\t\t\t\t\t||                                   ||");
		System.out.println("\t\t\t\t\t\t\t\t||    EMP  MANAGEMENT  SYSTEM    ||");
		System.out.println("\t\t\t\t\t\t\t\t||                                   ||");
		System.out.println("***********************************************************************************************************************************************************************************");
		do{
    		g.Menu();
    		switch(g.choice) {
		case 1 : g.subMenu();
		         System.out.println("");
                 System.out.print("Choose an operation : ");
                 int ch1=sc.nextInt();                 
                 outerLoop:
                 do {
                 switch (ch1) {
		         case 1: 
							System.out.print("How many Employee details do you want to enter :");
							int p=sc.nextInt();
						 	for(int m=1;m<=p;m++) {
								System.out.print("Enter employee ID : ");
								g.id =sc.nextInt();
								System.out.print("Enter employee name : ");
								sc.nextLine();
								g.name=sc.nextLine();
								System.out.print("Enter Desgination : ");
								g.desig=sc.nextLine();
								System.out.print("Enter Salary : ");
								g.salary=sc.nextInt();
								System.out.print("Enter branch : ");
								sc.nextLine();
								g.branch=sc.nextLine();
								//insert(z,a,b,c);
								mm.ins(g.id,g.name,g.desig,g.salary,g.branch);
												}	
						 	break;
		         case 2:  System.out.print("Enter new salary : ");
		                  int sal=sc.nextInt();
		                  System.out.print("Enter ID to be updated : ");
		                  int em=sc.nextInt();
		        	      mm.update(sal,em);
		        	      break;
		         case 3: System.out.print("Enter employee ID to delete : ");
		                 int id=sc.nextInt();
		                 mm.delete(id);
		                 break;
		         case 4:  break;
		        default:  System.out.println("Invalid operation");
		        	      break outerLoop;   
		         
		         }
                 }while(ch1!=4 );
                 }
		}while(g.choice !=0);
	}

	
}


