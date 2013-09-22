package oo.practise.Prototype;

public class run_main {
	public static void main(String[] args) {
		try {
			audi_imple car_ref_my = new audi_imple();
			car_ref_my.setCar_tyre_ref(new car_tyre());
			System.out.println("我的奥迪车的参数是：" + car_ref_my);
			System.out.println("我的奥迪车的轮胎参数是：" + car_ref_my.getCar_tyre_ref());

			audi_imple car_ref_other = (audi_imple) car_ref_my.clone();
			System.out.println("其它人的奥迪车的参数是：" + car_ref_other);
			System.out.println("其它人的奥迪车的轮胎参数是："
					+ car_ref_other.getCar_tyre_ref());

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
