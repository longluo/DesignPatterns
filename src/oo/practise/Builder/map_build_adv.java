package oo.practise.Builder;

public class map_build_adv {
	private map_interface map_interface_ref;

	public map_build_adv(map_interface map_interface_ref) {
		super();
		this.map_interface_ref = map_interface_ref;
	}

	public void create_map() {
		System.out.println("����һ���߻��ʵĵ�ͼ");

		// ������˳�����Ҫ �������·�洴��
		map_interface_ref.create_weather();
		map_interface_ref.create_house();
		map_interface_ref.create_tree();
		map_interface_ref.create_way();
	}
}
