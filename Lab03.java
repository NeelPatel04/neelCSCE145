//Neel Patel

import java.util.Scanner;

public class Lab03 {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		System.out.println("Welcome to the below average temperature tester program.");
		//Declare an array to store the temperature or 10 days
		double temp[] = new double[10];

		//Loop to collect temperatures for 10 days from the user
		for(int i = 0; i < temp.length; i++)
		{
			System.out.println("Please enter the temperature for day " + (i + 1) + ":");
			temp[i] = k.nextInt();
		}
		for(int i = 0; i < temp.length; i++)
		{
			System.out.println(temp[i]);
		}
		double sum = 0;
		//Loop to calculate the sum of all the temperatures
		for (int i = 0; i < temp.length; i++) 
		{
			sum += temp[i];	//Add each day's temperature to the sum
		}
		double average = sum / temp.length;
		System.out.println("Average temperature: " + average);

		//Loop to identify and display days with below average temperature
		System.out.println("Days with below average temperature:");
		for(int i = 0; i < temp.length; i++)
		{
			if(temp[i] < average)
			{
				System.out.println("Day " + (i+1) + ": " + temp[i]);
			}
		}
	}
}
