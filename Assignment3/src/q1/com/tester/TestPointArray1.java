package q1.com.tester;

import java.util.Scanner;

import q1.com.app.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Points to Create: ");
		num = sc.nextInt();

		Point2D[] points = new Point2D[num];
		System.out.println("Enter the points: ");
		for (int i = 0; i < points.length; i++) 
		{
			points[i] = new Point2D();
			points[i].accept();
		}

		int choice;

		do {
			System.out.println("Press 0 to Exit");
			System.out.println("Press 1 to Display Details of Specific Point");
			System.out.println("Press 2 to Display X , Y co-ordinates of all Points");
			System.out.println("Press 3 to Validate the Indices");
			System.out.print("Enter Your Choice:");
			choice = sc.nextInt();
			switch (choice) 
			{

			case 0:
				System.out.println("Thank You For Using Our App!!");

				break;

			case 1:
				int index;
				System.out.println("Enter the Index of Desired point: ");
				index = sc.nextInt();
				System.out.println(points[index].getDetails());
				System.out.println("_________________________________________________________");

				break;

			case 2:
				for (int i = 0; i < points.length; i++) {
					System.out.println("The Point at "+i+" index is "+points[i].getDetails());
				}
				System.out.println("_________________________________________________________");
				break;

			case 3: 
				
				System.out.println("Enter the Index of Start point: ");
				int i = sc.nextInt();
				System.out.println("Enter the Index of End Point: ");
				int j = sc.nextInt();
				System.out.println("P1 is Equal to P2:"+points[i].isEqual(points[j]));
				if(!points[i].isEqual(points[j]))
				{
					System.out.println("The Distance Between Two Points is :"+points[i].calculateDistance(points[j])); 
					
				}
				System.out.println("_________________________________________________________");
				break;
			}
		} while (choice != 0);

//		
    }
}