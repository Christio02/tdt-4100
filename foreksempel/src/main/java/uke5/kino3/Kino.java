package uke5.kino3;

import java.util.ArrayList;
import java.util.Collection;

public class Kino {

	private Collection<Sal> saler;

	public Kino() {
		saler = new ArrayList<>() {
			
		};
	}


	public void addSal(Sal sal) {
		saler.add(sal);
	}

	
	
	@Override
	public String toString() {
		return "Kino [saler=" + saler + "]";
	}


	public static void main(String[] args) {

		Kino ullensaker = new Kino();

		Film alexander = new Film("Alexander", 15, "USA");
		Film badsanta = new Film("Bad Santa", 11, "USA");
		Sal nova3 = new Sal("Nova 3", 200);
		Sal prinsen4 = new Sal("Prinsen 4", 120);
		Sal prinsen7 = new Sal("Prinsen 7", 43);
		
		
		Filmvisning fv1 = new Filmvisning(nova3, "20:00", 85, alexander);
		Filmvisning fv2 = new Filmvisning(prinsen4, "17:00", 75, alexander);
		Filmvisning fv3 = new Filmvisning(prinsen4, "20:30", 85, alexander);
		// Den neste går på grunn av at jeg har laget enda en konstruktør, men det er usikkert om det er lurt.
//		Filmvisning fv4 = new Filmvisning("Prinsen 7", "20:30", 12, "Fantorangen har bursdag", 3, "Norsk");
		System.out.println(fv1);
		System.out.println(fv2);
		System.out.println(fv3);
//		System.out.println(fv4);

		ullensaker.addSal(nova3);
		ullensaker.addSal(prinsen4);
		ullensaker.addSal(prinsen7);

		System.out.println(ullensaker);

	}

}
