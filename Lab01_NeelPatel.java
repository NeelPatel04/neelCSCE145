//Neel Patel

import java.util.Scanner;

public class Lab01_NeelPatel {

	public static void main(String[] args){
		//TODO Auto-generated method stub
		System.out.println("What is your zodiac? Enter your birthday -- Month followed by Day as numbers.");
		Scanner keyboard = new Scanner(System.in);
		int month = keyboard.nextInt();
		int day = keyboard.nextInt();

		//For Aries
		if(month == 3 && day >= 21 && day<=31) 
		{
			System.out.println("You are an Aries!");
		}
		else if(month == 4 && day >=1 && day<=19)
			System.out.println("You are an Aries!");

		//For Taurus
		if(month == 4 && day >= 20 && day<=30) 
		{
			System.out.println("You are a Taurus!");
		}
		else if(month == 5 && day >=1 && day<=20)
			System.out.println("You are a Taurus!");

		//For Gemini
		if(month == 5 && day >= 21 && day<=31) 
		{
			System.out.println("You are a Gemini!");
		}
		else if(month == 6 && day >=1 && day<=20)
			System.out.println("You are a Gemini!");

		//For Cancer
		if(month == 6 && day >= 21 && day<=30) 
		{
			System.out.println("You are a Cancer!");
		}
		else if(month == 7 && day >=1 && day<=22)
			System.out.println("You are a Cancer!");

		//For Leo
		if(month == 7 && day >= 23 && day<=31) 
		{
			System.out.println("You are a Leo!");
		}
		else if(month == 8 && day >=1 && day<=22)
			System.out.println("You are a Leo!");

		//For Virgo
		if(month == 8 && day >= 23 && day<=31) 
		{
			System.out.println("You are a Virgo!");
		}
		else if(month == 9 && day >=1 && day<=22)
			System.out.println("You are a Virgo!");

		//For Libra
		if(month == 9 && day >= 23 && day <= 30)
		{
			System.out.println("You are a Libra!");
		}
		else if(month == 10 && day >=1 && day <= 22)
			System.out.println("You are a Libra!");

		//For Scorpio
		if(month == 10 && day >= 23 && day <= 31)
		{
			System.out.println("You are a Scorpio!");
		}
		else if(month == 11 && day>= 1 && day <= 21)
			System.out.println("You are a Scorpio!");

		//For Sagittarius
		if(month == 11 && day >= 22 && day <=30)
		{
			System.out.println("You are a Sagittarius!");
		}
		else if(month == 12 && day >= 1 && day <= 22)
			System.out.println("You are a Sagittarius!");

		//For Capricorn
		if(month == 12 && day >= 22 && day <= 31)
		{
			System.out.println("You are a Capricorn!");
		}
		else if(month == 1 && day >= 1 && day <= 19)
			System.out.println("You are a Capricorn!");

		//For Aquarius
		if(month == 1 && day >= 20 && day <= 31)
		{
			System.out.println("You are an Aquarius");
		}
		else if(month == 2 && day >= 1 && day <= 18)
			System.out.println("You are an Aquarius!");

		//For Pisces
		if(month == 2 && day >= 19 && day <= 29)
		{
			System.out.println("You are a Pisces!");
		}
		else if(month == 3 && day >= 1 && day <= 20)
			System.out.println("You are a Pisces!");

		//For invalid month
		if(month < 1 || month > 12) 
		{
			System.out.println("Invalid month. Please enter a month between 1 and 12.");
		}

		//For invalid day
		if((month == 1 || month == 3 || month == 5 || month == 7|| month == 8 || month == 10
				|| month == 12) && (day <= 0 || day >= 32))
			System.out.println("Invalid day. Please enter a day between 1 and 31.");

		if((month == 4 || month == 6 || month == 9 || month == 11) && (day <= 0 || day >= 31))
			System.out.println("Invalid day. Please enter a day between 1 and 30.");

		if((month == 2) && (day <= 0 || day >= 30))
			System.out.println("Invalid day. Please enter a day between 1 and 29.");





	}//End of Main

}//End of Class
