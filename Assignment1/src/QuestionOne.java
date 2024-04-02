import java.util.Scanner;

public class QuestionOne {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number-");
		num = sc.nextInt();
		
		System.out.println("Given Number: "+num);
		System.out.println("Binary Equivalent: "+Integer.toBinaryString(num));
		System.out.println("Octal Equivalent: "+Integer.toOctalString(num));
		System.out.println("Hexadecimal Equivalent: "+Integer.toHexString(num));
		
	}

}
