package oo.practise.Facade;

public class run_main {
	public static void main(String[] args) {
		car_facade_imple car_facade_imple_ref = new car_facade_imple();
		car_facade_imple_ref.car_go_go(new car());
	}
}
