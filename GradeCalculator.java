import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args)
	{
		Scanner k = new Scanner(System.in);

		System.out.println("Welcome to the grading calculator! Please input your grades:");

		System.out.println("Lab grade:");
		double labs = k.nextDouble();
		System.out.println("Homework grade:");
		double hw = k.nextDouble();
		System.out.println("Final exam grade:");
		double finalExam = k.nextDouble();

		double finalGrade = (labs * .4f) + (hw * .4f) + (finalExam * .2f);

		System.out.println("Your final grade is:" + finalGrade);

		if(finalGrade > 89)
		{
			System.out.println("A");
		}
		else if(finalGrade > 79)
		{
			System.out.println("B");
		}
		else if(finalGrade > 69)
		{
			System.out.println("C");
		}
		else if(finalGrade > 59)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
	}
}

