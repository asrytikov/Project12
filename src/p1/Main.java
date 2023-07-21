package p1;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Car> cars = new LinkedList<>();
        cars.add(new SpeedCar(1, "car1", 200));
        cars.add(new Trucs(2, "truck1", 10000));

        SpeedCar car = (SpeedCar) cars.getFirst();
        System.out.println(car.getSpeed());

        String s;

        for (int i = 0; i < cars.size(); i++) {
            s = cars.get(i).toString();
            System.out.println(s);
        }


        String line = "M, 10, 12, 3.4, 12";


    }
}