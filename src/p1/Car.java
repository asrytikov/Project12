package p1;

public class Car {

    private int id;
    private String name;


    public Car(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "id=" + id +", "+ "name=" + name;
    }
}
