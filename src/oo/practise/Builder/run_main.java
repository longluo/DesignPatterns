package oo.practise.Builder;

public class run_main {
	public static void main(String[] args) {
		map_cloudy map_cloudy = new map_cloudy();
		map_build_adv map_build_adv = new map_build_adv(map_cloudy);
		map_build_adv.create_map();

		System.out.println();

		map_sunny map_sun = new map_sunny();
		map_build_low map_build_low = new map_build_low(map_sun);
		map_build_low.create_map();
	}
}
