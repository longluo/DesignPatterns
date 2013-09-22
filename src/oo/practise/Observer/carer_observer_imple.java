package oo.practise.Observer;

public class carer_observer_imple implements carer_observer {
	private carer_subject_parent carer_subject_parent_ref;

	public carer_subject_parent getCarer_subject_parent_ref() {
		return carer_subject_parent_ref;
	}

	public void setCarer_subject_parent_ref(
			carer_subject_parent carer_subject_parent_ref) {
		this.carer_subject_parent_ref = carer_subject_parent_ref;
	}

	public carer_observer_imple(carer_subject_parent carer_subject_parent_ref) {
		super();
		this.carer_subject_parent_ref = carer_subject_parent_ref;
	}

	public void show_info() {
		System.out.println(carer_subject_parent_ref.get_state());
	}
}
