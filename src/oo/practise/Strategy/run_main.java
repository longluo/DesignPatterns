package oo.practise.Strategy;

public class run_main {
	public static void main(String[] args) {
		tyre_long_implement tyre_long_implement = new tyre_long_implement();
		tyre_short_implement tyre_short_implement = new tyre_short_implement();
		
		car car = new car();
		car.setDeath_year(8);
		car.setMake_address("±±¾©³¯ÑôÇø");
		car.setSpeed(200);
		car.setTyre_interface_ref(tyre_long_implement);
		car.start();
	}
}
