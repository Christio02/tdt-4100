package uke10;

public class Follow2 implements IFollow {

    
    
    
    
    
    
    @Override
    public void statusUpdated(Mekker m, String what) {

        System.out.println("Follow2: Mekker changed status: " + m);
        if (what.equals("length")) {
            
        }
    }
    
}
