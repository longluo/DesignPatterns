package oo.practise.AbstractFactory;

public class base_car_imple implements Icar_interface {
    private int speed;
    private String name;
    
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void start() {
    }

    public void stop() {
    }
}
