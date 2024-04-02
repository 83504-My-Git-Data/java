import java.util.Scanner;

public class QuestionThree {

	public static void main(String[] args) {
		int choice;
		double total=0;
		int quantity;
		
		do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Press 0 Exit");
			System.out.println("Press 1 Dosa: Price-Rs.40");
			System.out.println("Press 2 Samosa: Price-Rs.20");
			System.out.println("Press 3 Idli: Price-Rs.30");
			System.out.println("Press 4 Generate Bill");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Choice-");
			choice = sc.nextInt();
			
			
			switch(choice) {
			
			case 0:     System.out.println("Thank You For Visiting!!");
			  			break;
			case 1:		System.out.println("Enter Quantity: ");
						quantity = sc.nextInt();
						System.out.println("Dosa has been Purchased! Have A Great Meal!");
			     		total = total+(quantity * 40);
			     		quantity = 0;
						break;
			case 2:		System.out.println("Enter Quantity: ");
						quantity = sc.nextInt();
						System.out.println("Samosa has been Purchased! Have A Great Meal!");
						total = total+(quantity * 20);
						quantity = 0; 
						break;	
			
			case 3:		System.out.println("Enter Quantity: ");
						quantity = sc.nextInt();
						System.out.println("Idli has been Purchased! Have A Great Meal!");
						total = total+(quantity * 30);
						quantity = 0;
						break;
			
			case 4:		System.out.println("The Total Bill is : "+total);
     					
			break;
			
			
			}	
			
		} while(choice!=0);
	}

}
