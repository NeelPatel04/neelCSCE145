//Neel Patel

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args){
		//Welcome Message
		System.out.println("Welcome to Triangle Maker! Enter the size of the triangle.");
		Scanner keyboard = new Scanner(System.in);
		//Get triangle size from user
		int TriangleSize = keyboard.nextInt();

		// For increasing the number of *
		for (int i = 1; i <= TriangleSize; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("*");
			}
			//Move to the next line after each row
			System.out.println(); 
		}	

		// For decreasing the number of *
		for (int i = TriangleSize - 1; i >= 1; i--) 
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
