//Neel Patel

public class AppleTester {
	public static void main(String[] args) {
		System.out.println("Welcome to the apple tester");
		System.out.println();
		
		System.out.println("Creating a default apple");
		Apple DefaultApple = new Apple();
		
		System.out.println("Printing the default apple's value");
		System.out.println(DefaultApple.toString());
		System.out.println();
		
		System.out.println("Creating another apple");
		Apple ValidApple = new Apple("Granny Smith", 0.75, 0.99);
		System.out.println("Printing the new apple's values");
		System.out.println(ValidApple.toString());
		System.out.println();
		
		System.out.println("Creating another default apple");
		Apple InvalidApple = new Apple();
		InvalidApple.setName("iPad");
		InvalidApple.setWeight(-2.5);
		InvalidApple.setPrice(-200);
		System.out.println("Then setting the new apple's values to the following, invalid values \"iPad 2.5 -200\"");
		System.out.println("Printing the newest apple's values which should not have changed from the default values");
		System.out.println(InvalidApple.toString());
		System.out.println();
		
		System.out.println("Checking if the first and last apple have the same values.");
		System.out.println(DefaultApple.equals(InvalidApple));
			
	}

}
