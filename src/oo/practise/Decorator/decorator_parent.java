package oo.practise.Decorator;

public abstract class decorator_parent extends car_parent {
	// ×°ÊÎÕß¸¸Àà
	protected car_parent car_parent_ref;

	public void setCar_parent_ref(car_parent car_parent_ref) {
		this.car_parent_ref = car_parent_ref;
	}

	@Override
	public void print_face() {
		car_parent_ref.print_face();
	}
}
