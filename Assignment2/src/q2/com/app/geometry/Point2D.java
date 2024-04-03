package q2.com.app.geometry;

import java.lang.Math;
import java.util.Scanner;

public class Point2D {
	private int x;
	private int y;

	public Point2D() {

	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Point: ");
		System.out.println("Enter X Co-ordinate: ");
		x = sc.nextInt();
		System.out.println("Enter Y Co-ordinate:");
		y = sc.nextInt();
	}

	public String getDetails() {
		String details = "("+ x + "," + y + ")";
		return details;
	}

	public boolean isEqual(int p, int q) {
		return x == p && y == q;
	}

	public double calculateDistance(int p, int q) {
		double distance = Math.sqrt(Math.pow((p - x), 2) + Math.pow((q - y), 2));
		return distance;
	}
}
