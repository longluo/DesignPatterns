package oo.practise.Prototype;

public class run_main {
	public static void main(String[] args) {
		try {
			audi_imple car_ref_my = new audi_imple();
			car_ref_my.setCar_tyre_ref(new car_tyre());
			System.out.println("�ҵİµϳ��Ĳ����ǣ�" + car_ref_my);
			System.out.println("�ҵİµϳ�����̥�����ǣ�" + car_ref_my.getCar_tyre_ref());

			audi_imple car_ref_other = (audi_imple) car_ref_my.clone();
			System.out.println("�����˵İµϳ��Ĳ����ǣ�" + car_ref_other);
			System.out.println("�����˵İµϳ�����̥�����ǣ�"
					+ car_ref_other.getCar_tyre_ref());

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
