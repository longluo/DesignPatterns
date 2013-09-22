package oo.practise.Observer;

public interface carer_subject_parent {
	public void set_state(String state_string);
	public String get_state();
	public void add_observer(carer_observer carer_observer_ref);
	public void sub_observer(carer_observer carer_observer_ref);
	public void notityAllCarer();
}
