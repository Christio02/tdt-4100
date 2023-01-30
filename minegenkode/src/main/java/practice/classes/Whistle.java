package practice.classes;

public class Whistle {

    private String sound;

    public Whistle(String sound) {
        this.sound = sound;

    }

    @Override
    public String toString() {
        return sound;
    }

    public static void main(String[] args) {
        Whistle s = new Whistle("Quack!");

        System.out.println(s);
    }

}
