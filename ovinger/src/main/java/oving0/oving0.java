package oving0;

public class oving0 {
    public static void main(String[] args) {
        // int x = 3;
        // double y = 15.6;

        // double z = x * y;

        // System.out.println(z);

        // int x = 3;
        // int y = 5;

        // if (x > 5 && y < 10) {
        // System.out.println("x er større enn 5 og y er mindre enn 10");

        // }

        // else if (x > 5 || y < 10) {
        // System.out.println("x er større enn 5 eller y mindre enn 10");

        // }

        // else {
        // System.out.println("x er mindre enn 5 og y er større enn 10");
        // }

        // for (int i = 3; i < 10; i++ ) {
        // if (i % 2 ==0) {
        // System.out.println(i);
        // }
        // }

        // int j = 0;
        // while(j < 10) {
        // System.out.println(j);
        // j+=1;
        // }

    }

    // funksjoner i java

    public int Division(int x, int y) {
        return x / y;
    }

    public int Fakultet(int x) {
        int fak = 1;
        for (int i = 1; i < (x + 1); i++) {
            fak *= i;
        }
        return fak;
    }

    public Boolean erPrimtall(int x) {
        if (x < 2) {
            return false;
        }

        for (int i = 2; i < x;) {
            if (x % i == 0) {
                return false;
            }

        }
        return true;

    }

}
