package oo.practise.Strategy;

public class car {
	private String make_address;// 制造地
	private int death_year;// 报废年限
	private int speed;// 速度
	private tyre_interface tyre_interface_ref;// 轮胎的样式

	public String getMake_address() {
		return make_address;
	}

	public void setMake_address(String make_address) {
		this.make_address = make_address;
	}

	public int getDeath_year() {
		return death_year;
	}

	public void setDeath_year(int death_year) {
		this.death_year = death_year;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public tyre_interface getTyre_interface_ref() {
		return tyre_interface_ref;
	}

	public void setTyre_interface_ref(tyre_interface tyre_interface_ref) {
		this.tyre_interface_ref = tyre_interface_ref;
	}

	public void start() {
		System.out.println("车的基本信息为：");
		System.out.println("制造地make_address：" + this.getMake_address());
		System.out.println("报废年限death_year：" + this.getDeath_year());
		System.out.println("速度speed：" + this.getSpeed());

		System.out.println("Car 起动了！");

		System.out.println("Car高速行驶，遇到一个大转弯，路面显示：");
		this.getTyre_interface_ref().print_tyre_line();
	}
}
