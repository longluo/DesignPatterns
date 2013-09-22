package oo.practise.Decorator;

public class run_main {

	public static void main(String[] args) {
		audi_sub audi_sub_ref = new audi_sub();
		audi_sub_ref.setMake_address("北京市朝阳区");
		audi_sub_ref.setSpeed(200);

		decorator_audi_red decorator_audi_red_ref = new decorator_audi_red();
		decorator_audi_red_ref.setCar_parent_ref(audi_sub_ref);

		decorator_audi_purple decorator_audi_purple_ref = new decorator_audi_purple();
		decorator_audi_purple_ref.setCar_parent_ref(decorator_audi_red_ref);

		decorator_audi_purple_ref.print_face();
	}
}
