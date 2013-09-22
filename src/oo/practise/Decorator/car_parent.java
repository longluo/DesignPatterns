package oo.practise.Decorator;

public abstract class car_parent {
	// Æû³µ³éÏó¸¸Àà
	private String make_address;
	private int speed;

	public String getMake_address() {
		return make_address;
	}

	public void setMake_address(String make_address) {
		this.make_address = make_address;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public abstract void print_face();
}
