//Neel Patel
import java.util.Scanner;
public class HomeWork2 {


	public static void main(String [] args) {
		Scanner k = new Scanner(System.in);


		System.out.println("Enter a 4-bit binary number:");
		String binary1 = k.nextLine();
		
		System.out.println("Enter another 4-bit binary number:");
		String binary2 = k.nextLine();


		int decimal1 = binaryToDecimal(binary1);
		int decimal2 = binaryToDecimal(binary2);
		int sum = decimal1 + decimal2;


		System.out.println("The first number is " + decimal1);
		System.out.println("The second number is " + decimal2);
		System.out.println("Added together is " + sum);
	}


	public static int binaryToDecimal(String binary) {
		int decimal = 0;
		int power = 0;

		for(int i = binary.length() - 1; i >= 0; i--)
		{
			int bit = Character.getNumericValue(binary.charAt(i));
			decimal += bit * Math.pow(2, power);
			power++;
		}
		return decimal;
	}

}
