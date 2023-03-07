package uke10;

public class Follow implements IFollow {

    String hairColor;
    int hairLength;

    
    private void setHairColor(String newColor) {
        this.hairColor = newColor;

    }
    
    public String getHairColor() {
        return hairColor;
    }

    // need to make method that mekker calls to notify
    public void updateHairColor(String newColor) {
        this.setHairColor(newColor);
    }


    @Override
    public void statusUpdated(Mekker m, String what) {
        if (what.equals("color")) {
            
            this.setHairColor(m.getHairColor());

        }
    }



    public int getHairLength() {
        return this.hairLength;
    }


    public void setHairLength(int hairLength) {
        this.hairLength = hairLength;
    }


    @Override
    public String toString() {
        return "Follow [hairColor=" + hairColor + ", hairLength=" + hairLength + "]";
    }

    
    
}
