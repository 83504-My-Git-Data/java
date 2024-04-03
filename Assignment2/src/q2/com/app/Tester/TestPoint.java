package q2.com.app.Tester;
import java.util.Scanner;

import q2.com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		
		Point2D p1 = new Point2D();
		p1.accept();
		Point2D p2 = new Point2D();
		p2.accept();
		System.out.println("P1 is Equal to P2:"+p1.isEqual(p2.getX(),p2.getY()));
		if(!p1.isEqual(p2.getX(),p2.getY())) {
			System.out.println("The Distance Between Two Points is :"+p1.calculateDistance(p2.getX(), p2.getY())); 
			
		System.out.println("Point 1 is : "+p1.getDetails());
		System.out.println("Point 2 is : "+p2.getDetails());
		}
	}

}