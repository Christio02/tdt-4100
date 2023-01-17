package oving1;

public class Location {

    int x = 0;
    int y = 0;

    public void up() {
        y = y - 1;
    }

    public void down() {
        y = y + 1;
    }

    public void left() {
        x = x - 1;
    }

    public void right() {
        x = x + 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Posisjon: " + "x-verdi: " + x + " , " + "y-verdi: " + y;
    }

    public static void main(String[] args) {
        Location l = new Location();
        System.out.println(l);
        System.out.println(l.getX());
        System.out.println(l.getY());
        l.up();
        System.out.println(l.getY());

    }
}
