package q2;

import java.util.Scanner;

public class Drive {
	private double totalMiles;
	private double gallonPrice;
	private double avgMiles;
	private double parkingFee;
	private double toll;
	
	
	public Drive() {
		
	}

	public Drive(double totalMiles, double gallonPrice, double avgMiles, double parkingFee, double toll) {
		
		this.totalMiles = totalMiles;
		this.gallonPrice = gallonPrice;
		this.avgMiles = avgMiles;
		this.parkingFee = parkingFee;
		this.toll = toll;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total miles driven per day:");
		totalMiles = sc.nextDouble();
		System.out.println("Enter Cost per gallon of gasoline");
		gallonPrice = sc.nextDouble();
		System.out.println("Enter Average miles per gallon.");
		avgMiles = sc.nextDouble();
		System.out.println("Enter Parking fees per day");
		parkingFee = sc.nextDouble();
		System.out.println("Enter Tolls per day");
		toll = sc.nextDouble();
	}
	
	public double getTotalMiles() {
		return totalMiles;
	}
	public void setTotalMiles(double totalMiles) {
		this.totalMiles = totalMiles;
	}
	public double getGallonPrice() {
		return gallonPrice;
	}
	public double getAvgMiles() {
		return avgMiles;
	}

	public void setAvgMiles(double avgMiles) {
		this.avgMiles = avgMiles;
	}

	public void setGallonPrice(double gallonPrice) {
		this.gallonPrice = gallonPrice;
	}
	public double getParkingFee() {
		return parkingFee;
	}
	public void setParkingFee(double parkingFee) {
		this.parkingFee = parkingFee;
	}
	public double getToll() {
		return toll;
	}
	public void setToll(double toll) {
		this.toll = toll;
	}
	
	
	public double totalCost() {
		 double totalCost = (totalMiles/avgMiles)*gallonPrice + parkingFee + toll;
		 return totalCost;
	}
	
	
}
