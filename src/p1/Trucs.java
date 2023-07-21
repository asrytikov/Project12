package p1;

public class Trucs extends Car{

    private int massa;

    public Trucs(int id, String name, int massa) {
        super(id, name);
        this.massa = massa;
    }

    public int getMassa() {
        return massa;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +  massa;
    }
}
