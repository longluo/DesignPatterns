package oo.practise.Builder;

public class map_build_low {
	private map_interface map_interface_ref;

	public map_build_low(map_interface map_interface_ref) {
		super();
		this.map_interface_ref = map_interface_ref;
	}

	public void create_map() {
		System.out.println("����һ���ͻ��ʵĵ�ͼ");
		
		// ������˳�����Ҫ �������·�洴��
		map_interface_ref.create_weather();
		map_interface_ref.create_house();
		// map_interface_ref.create_tree();���������Ĺ���ȥ��
		map_interface_ref.create_way();
	}
}
