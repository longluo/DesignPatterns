package oo.practise.Strategy;

public class car {
	private String make_address;// �����
	private int death_year;// ��������
	private int speed;// �ٶ�
	private tyre_interface tyre_interface_ref;// ��̥����ʽ

	public String getMake_address() {
		return make_address;
	}

	public void setMake_address(String make_address) {
		this.make_address = make_address;
	}

	public int getDeath_year() {
		return death_year;
	}

	public void setDeath_year(int death_year) {
		this.death_year = death_year;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public tyre_interface getTyre_interface_ref() {
		return tyre_interface_ref;
	}

	public void setTyre_interface_ref(tyre_interface tyre_interface_ref) {
		this.tyre_interface_ref = tyre_interface_ref;
	}

	public void start() {
		System.out.println("���Ļ�����ϢΪ��");
		System.out.println("�����make_address��" + this.getMake_address());
		System.out.println("��������death_year��" + this.getDeath_year());
		System.out.println("�ٶ�speed��" + this.getSpeed());

		System.out.println("Car ���ˣ�");

		System.out.println("Car������ʻ������һ����ת�䣬·����ʾ��");
		this.getTyre_interface_ref().print_tyre_line();
	}
}
