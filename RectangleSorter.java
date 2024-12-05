//Neel Patel

import java.util.Scanner;

public class RectangleSorter {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		double[] areas = null;
		System.out.println("Welcome to the Rectangel Sorter!");

		//Main loop to display menu and user choices
		while(true) {
			System.out.println("Choose from the following:");
			System.out.println("1. Sort Rectangles by Smallest to Largest");
			System.out.println("2. Sort Rectaangles by Largest to Smallest");
			System.out.println("3. Get Maximum Area");
			System.out.println("4. Get Minimum Area");
			System.out.println("5. Get Average Area");
			System.out.println("9. Re-enter Retangel Data");
			System.out.println("0. To Quit");

			int choice = k.nextInt();

			switch (choice) {
			case 1: 
				if(areas == null) {
					System.out.println("The collection is empty. Please enter rectangle data first.");
				} else  {
					sortAreas(areas, true);
					displayAreas(areas, "Smallest to Largest");	
				}
				break;

			case 2: 
				if(areas == null) {
					System.out.println("The collection is empty. Please enter rectangle data first.");
				} else  {
					sortAreas(areas, false);
					displayAreas(areas, "Largest to Smallest");
				}
				break;

			case 3: 
				if(areas == null) {
					System.out.println("The collection is empty. Please enter rectangle data first.");
				} else  {
					System.out.println("The Maximum Area is: " + MaxArea(areas));
				}
				break;

			case 4: 
				if(areas == null) {
					System.out.println("The collection is empty. Please enter rectangle data first.");
				} else  {
					System.out.println("The Mimimum Area is: " + MinArea(areas));
				}
				break;

			case 5:
				if(areas == null) {
					System.out.println("The collection is empty. Please enter rectangle data first.");
				} else  {
					System.out.println("The Average Area is " + AverageArea(areas));
				}
				break;

			case 9: 
				areas = enterRectangleData(k);
				break;

			case 0:
				System.out.println("Goodbye.");
				return;

			default:
				System.out.println("Invalid Choice.");
			}
		}
	}

	//Method to allow user to enter rectangle data
	private static double [] enterRectangleData(Scanner k) {
		System.out.println("How many Rectangels are we creating?");
		int size;
		while(true) {
			size = k.nextInt();
			if (size > 0) {
				break;
			}
			System.out.println("Invalid size. Please enter a positive number.");
		}

		double[] areas = new double[size];
		for(int i = 0; i < size; i++) {
			System.out.println("Enter the length for Rectangle " + i);
			double length = k.nextDouble();
			System.out.println("Enter the width for Rectangle " + i);
			double width = k.nextDouble();
			areas[i] = length * width;
		}
		return areas;
	}

	//Method to sort the array of areas
	public static void sortAreas(double[]areas, boolean ascending) {
		for(int i = 0; i < areas.length - 1; i++) {
			for(int j = 0; j < areas.length - i - 1; j++) {
				if((ascending && areas[j] > areas[j + 1]) || (!ascending && areas[j] < areas[j +1])) {
					double temp = areas[j];
					areas[j] = areas[j +1];
					areas[j + 1] = temp;
				}
			}
		}
	}

	//Method to display sorted areas
	private static void displayAreas(double[] areas, String order) {
		System.out.println("Areas " + order);
		for(double area : areas) {
			System.out.println(area);
		}
	}

	//Method to find the maximum area
	private static double MaxArea(double[] areas) {
		double max = areas[0];
		for(double area : areas) {
			if(area > max) {
				max = area;
			}
		}
		return max;
	}

	//Method to find the minimum area
	private static double MinArea(double[] areas) {
		double min = areas[0];
		for(double area : areas) {
			if(area < min) {
				min = area;
			}
		}
		return min;
	}
	
	//Method to calculate the average area
	private static double AverageArea(double[] areas) {
		double sum = 0;
		for(double area : areas) {
			sum += area;
		}
		return sum / areas.length;
	}
}
