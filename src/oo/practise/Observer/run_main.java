package oo.practise.Observer;

public class run_main {
	public static void main(String[] args) {
		carer_subject_parent carer_subject_parent_ref = new carer_subject_sub();

		carer_observer_imple carer_observer_imple_ref1 = new carer_observer_imple(
				carer_subject_parent_ref);
		carer_observer_imple carer_observer_imple_ref2 = new carer_observer_imple(
				carer_subject_parent_ref);
		carer_observer_imple carer_observer_imple_ref3 = new carer_observer_imple(
				carer_subject_parent_ref);
		carer_observer_imple carer_observer_imple_ref4 = new carer_observer_imple(
				carer_subject_parent_ref);

		carer_subject_parent_ref.add_observer(carer_observer_imple_ref1);
		carer_subject_parent_ref.add_observer(carer_observer_imple_ref2);
		carer_subject_parent_ref.add_observer(carer_observer_imple_ref3);
		carer_subject_parent_ref.add_observer(carer_observer_imple_ref4);
		carer_subject_parent_ref.sub_observer(carer_observer_imple_ref3);

		carer_subject_parent_ref.set_state("µ½´ïÖÕµã");
		carer_subject_parent_ref.notityAllCarer();
	}
}
