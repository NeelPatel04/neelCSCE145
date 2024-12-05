//Neel Patel

public class Apple {

	//1. Instance Variables
	private String name;
	private double weight;
	private double price;

	//2. Default Constructors
	public Apple() {
		this.name = "Gala";
		this.weight = 0.0;
		this.price = 0.0;
	}

	//3. Parameterized Constructor
	public Apple(String name, double weight, double price) {
		this.setName(name);
		this.setWeight(weight);
		this.setPrice(price);
	}

	public void setName(String name) {
		if(name != null && (name.equals("Gala")) || name.equals("Granny Smith"))
		{
			this.name = name;
		}
		else {
			this.name = "Gala";
		}
	}

	public void setWeight(double weight) {
		this.weight = (weight > 0) ? weight : 0.0;
	}

	public void setPrice(double price) {
		this.price = (price >= 0) ? price : 0.0;
	}

	//4.Getters and Setters
	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public double getPrice() {
		return price;
	}

	//5. ToString
	public String toString() {
		return "Type: " + this.name + " " +
				"Weight: " + this.weight + " " +
				"Price: " + this.price;
	}

	//6. Equals Method
	public boolean equals(Apple other) {
		if(other == null) return false;
		return	this.name.equals(other.getName()) &&
				this.weight == other.getWeight() &&
				this.price == other.getPrice();
	}

}
