package oo.practise.Proxy;

public class proxy_buy_car_imple implements buy_car_package {
	private people people;

	public people getPeople() {
		return people;
	}

	public void setPeople(people people) {
		this.people = people;
	}

	public void buy_car() {
		if (people.getCash() > 3000) {
			System.out.println(people.getUsername() + "��" + people.getCash()
					+ "�顡�����³������׽���");
		} else {
			System.out.println(people.getUsername() + "��Ǯ���������������!");
		}
	}
}
