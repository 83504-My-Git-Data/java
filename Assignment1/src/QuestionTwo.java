import java.util.Scanner;

public class QuestionTwo {

	public static void main(String[] args) {
		double num1;
		double num2;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		
		if(sc.hasNextDouble()) 
		{
			num1 = sc.nextDouble();
			System.out.print("Enter another Number: ");
			if(sc.hasNextDouble())
			{
				num2 = sc.nextDouble();
				avg = (num1 + num2)/2;
				System.out.println("The Average of the given Numbers: "+avg);
			}else{
				System.out.println("The Number Entered is not Type Double.");
			}
		}else {
			System.out.println("The Number Entered is not Type Double.");
		}	
	}

}
