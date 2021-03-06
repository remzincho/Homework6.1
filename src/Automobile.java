
class Automobile extends Car {
	private float consumption;

	public Automobile(float price, float consumption) {
		super(price);
		this.consumption = consumption;
	}

	public float getConsumption() {
		return consumption;
	}

	public void setConsumption(float consumption) {
		this.consumption = consumption;
	}

	public Automobile() {
		this(0, 0);
	}

	public void fuelConsumption() {
		System.out.println("Fuel consumption is: " + this.consumption);
	}
}