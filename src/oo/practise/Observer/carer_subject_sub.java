package oo.practise.Observer;

import java.util.ArrayList;
import java.util.List;

public class carer_subject_sub implements carer_subject_parent {
	List<carer_observer> list_observer = new ArrayList<carer_observer>();
	private String state;

	public void set_state(String state_string) {
		this.state = state_string;
	}

	public String get_state() {
		return state;
	}

	public void add_observer(carer_observer carer_observer_ref) {
		list_observer.add(carer_observer_ref);
	}

	public void sub_observer(carer_observer carer_observer_ref) {
		list_observer.remove(carer_observer_ref);

	}

	public void notityAllCarer() {
		state = "µ½´ïÖÕµã";
		for (int i = 0; i < list_observer.size(); i++) {
			list_observer.get(i).show_info();
		}
	}
}
