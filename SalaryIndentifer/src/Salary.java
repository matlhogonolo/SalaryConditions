import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println();
		System.out.println("enter your monthly salary");
		
		double salary=sc.nextDouble();
		
		String type ="";
		
		if(salary >= 30000)
		{
			type ="High";
		}else if(salary < 3000)
		{
			type ="low";
		}else
		{
			type ="medium";	
		}
		System.out.println();

		System.out.println("salary of BWP "+ salary + " is consired "+ type +" wage");
		System.out.println();

		
		}

	}

}
