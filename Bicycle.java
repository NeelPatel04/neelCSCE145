//Neel Patel

public class Bicycle {
	//1. Instance Variables
	private String make;
	private Wheel frontWheel;
	private Wheel backWheel;
	private Frame frame;
	private static String defaultMake = "none";

	//2. Default Constructors
	public Bicycle() {
		this.make = defaultMake;
		this.frontWheel = new Wheel();
		this.backWheel = new Wheel();
		this.frame = new Frame();
	}

	//3. Parameterized Constructor
	public Bicycle(String make, Wheel frontWheel, Wheel backWheel, Frame frame) {
		setMake(make);
		setFrontWheel(frontWheel);
		setBackWheel(backWheel);
		setFrame(frame);
	}

	//4. Getters and Setters
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		if(make != null && !make.trim().isEmpty()) {
			this.make = make;
		} else {
			this.make = defaultMake;
		}
	}

	public Wheel getFrontWheel() {
		return frontWheel;
	}

	public void setFrontWheel(Wheel frontWheel) {
		if(frontWheel != null) {
			this.frontWheel = frontWheel;
		}else {
			this.frontWheel = new Wheel();
		}
	}

	public Wheel getBackWheel() {
		return backWheel;
	}

	public void setBackWheel(Wheel backWheel) {
		if(backWheel != null) {
			this.backWheel = backWheel;
		} else {
			this.backWheel = new Wheel();
		}
	}

	public Frame getFrame() {
		return frame;
	}

	public void setFrame(Frame frame) {
		if(frame != null) {
			this.frame = frame;
		} else {
			this.frame = new Frame();
		}
	}

	//5. ToString Method
	public String toString() {
		return "[Bicycle] Make: " + make +
				" Front Wheel: " + frontWheel +
				" Back Wheel: " + backWheel +
				" Frame: " + frame;
	}

	//6. Equals Method
	public boolean equals(Bicycle other) {
		if(other == null) return false;
		return this.make.equalsIgnoreCase(other.getMake()) &&
				this.frontWheel.equals(other.getFrontWheel()) &&
				this.backWheel.equals(other.getBackWheel()) &&
				this.frame.equals(other.getFrame());
	}
}
