package p1;

public class SpeedCar extends Car{

    private int speed;

    public SpeedCar(int id, String name, int speed) {
        super(id, name);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + speed;
    }
}
