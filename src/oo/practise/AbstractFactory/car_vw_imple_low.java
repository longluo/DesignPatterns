package oo.practise.AbstractFactory;

public class car_vw_imple_low extends base_car_imple {

	public void start() {
		System.out.println("��ͨ�棺" + this.getName() + " ����ר���������ˡ�����ٶ�Ϊ��"
				+ this.getSpeed());
	}

	public void stop() {
		System.out.println("��ͨ�棺" + this.getName() + " ����ר������ͣ����");
	}
}