package oo.practise.AbstractFactory;

public class car_factory_low implements Icar_factory {

	public Icar_interface create_audi_car() {
		car_audi_imple_low car_audi_imple_low_ref = new car_audi_imple_low();
		car_audi_imple_low_ref.setName("°ÂµÏA6");
		car_audi_imple_low_ref.setSpeed(300);

		return car_audi_imple_low_ref;
	}

	public Icar_interface create_threeW_car() {
		car_vw_imple_low car_vw_imple_low_ref = new car_vw_imple_low();
		car_vw_imple_low_ref.setName("´óÖÚA6");
		car_vw_imple_low_ref.setSpeed(300);

		return car_vw_imple_low_ref;
	}
}
