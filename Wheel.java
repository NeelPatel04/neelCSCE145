//Neel Patel

public class Wheel {
	//1. Instance Variables
	private double diameter;
	private double width;

	private static double defaultDiameter = 16.0;
	private static double defaultWidth = 1.0;
	private static double maxDiameter = 55.0;
	private static double minDiameter = 16.0;
	private static double maxWidth = 2.5;
	private static double minWidth = 1.0;

	//2. Default Constructors
	public Wheel() {
		this.diameter = defaultDiameter;
		this.width = defaultWidth;
	}

	//3. Parameterized Constructor
	public Wheel(double diameter, double width) {
		this.setDiameter(diameter);
		this.setWidth(width);
	}

	//4. Getters and Setters
	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		if(diameter >= minDiameter && diameter <= maxDiameter) {
			this.diameter = diameter;
		} else { 
			this.diameter = defaultDiameter;
		}
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if(width >= minWidth && width <= maxWidth) {
			this.width = width;
		} else { 
			this.width = defaultWidth;
		}
	}

	//5. ToString
	public String toString() {
		return "[Wheel] Diameter: " + diameter + " Width " + width;
	}

	//6. Equals Method
	public boolean equals(Wheel other) {
		if(other == null) return false;
		return this.diameter == other.getDiameter() &&
				this.width == other.getWidth();
	}
}
