package oo.practise.Proxy;

public class run_main {
	public static void main(String[] args) {
		people people_ref1 = new people();
		people_ref1.setCash(4000);
		people_ref1.setUsername("∏ﬂ∫È—“");

		people people_ref2 = new people();
		people_ref2.setCash(2000);
		people_ref2.setUsername("—“∫È∏ﬂ");

		proxy_buy_car_imple proxy_buy_car_imple = new proxy_buy_car_imple();
		proxy_buy_car_imple.setPeople(people_ref1);
		proxy_buy_car_imple.buy_car();

		proxy_buy_car_imple.setPeople(people_ref2);
		proxy_buy_car_imple.buy_car();
	}
}
