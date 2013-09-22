package oo.practise.Prototype;

public class audi_imple implements car_interface, Cloneable {
    private car_tyre car_tyre_ref;
    public void start() {
        System.out.println("°ÂµÏA6Æô¶¯ÁË");
    }

    public void stop() {
        System.out.println("°ÂµÏA6Í£Ö¹ÁË");
    }

    public car_tyre getCar_tyre_ref() {
        return car_tyre_ref;
    }

    public void setCar_tyre_ref(car_tyre car_tyre_ref) {
        this.car_tyre_ref = car_tyre_ref;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        super.clone();
        audi_imple audi_imple = new audi_imple();
        audi_imple.setCar_tyre_ref(new car_tyre());

        return audi_imple;
    }
}