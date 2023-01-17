package practice.scratch;

public class Year {
    
    private int year; // initialzing the variables
    private float temp;


    public Year(int year, float temp) { // make the constructor 
        this.year = year;
        this.temp = temp;
    }

    public float getTemp() { // get current temp
        return temp;
    }

    public int getYear() { // get current year
        return year;
    }

    @Override // turn the object into a string
    public String toString() {
        return year + ": " + temp;
    }

    public static void main(String[] args) {
        Year y1 = new Year(1973, 33);
        System.out.println(y1.getTemp());
        System.out.println(y1);
    }




    












}
