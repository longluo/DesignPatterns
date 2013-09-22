package oo.practise.Facade;

public class car_facade_imple {
	public void car_go_go(car car_ref) {
		car_ref.check_box();
		car_ref.check_console();
		car_ref.check_stop();
		car_ref.start();
	}
}
