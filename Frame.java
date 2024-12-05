//Neel Patel

public class Frame {
	//1. Instance Variables
	private double size;
	private String type;

	private static double defaultSize = 18.5;
	private static double minSize = 18.5;
	private static double maxSize = 60.0;
	private static String defaultType = "Dimond";
	private static String [] ValidTypes = {"Dimond", "Step-Through", "Truss", "Penny-Farthing"};

	//2.Default Constructors
	public Frame() {
		this.size = defaultSize;
		this.type = defaultType;
	}

	//3. Parameterized Constructor
	public Frame(double size, String type) {
		setSize(size);
		setType(type);
	}

	//4.Getters and Setters
	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		if(size >= minSize && size <= maxSize) {
			this.size = size;
		} else { 
			this.size = defaultSize;
		}
	}

	public String getType() {
		return type;
	}

	//Helper method to check frame type is valid
	public void setType(String type) {
		if(isValidType(type)) {
			this.type = type;
		} else { 
			this.type = defaultType;
		}
	}

	public boolean isValidType(String type) {
		for(String validType : ValidTypes) {
			if(validType.equals(type)) {
				return true;
			}	
		}
		return false;
	}

	//5. ToString Method
	public String toString() {
		return "[Frame] Size: " + size + " Type: " + type;
	}

	//6. Equals Method
	public boolean equals(Frame other) {
		if(other == null) return false;
		return this.size == other.getSize() &&
				this.type.equals(other.getType());
	}
}
