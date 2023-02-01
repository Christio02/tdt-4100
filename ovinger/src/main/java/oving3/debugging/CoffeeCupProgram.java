package oving3.debugging;

import java.util.Random;

public class CoffeeCupProgram {

	private CoffeeCup cup;
	private Random r;

	public void init() {
		cup = new CoffeeCup();
		r = new Random(123456789L);
	}

	public void run() {
		part1();
		part2();
	}

	private void part1() {
		cup.increaseCupSize(40.0);
		cup.fillCoffee(20.5);
		cup.drinkCoffee(Math.floor(r.nextDouble() * 20.5));
		cup.fillCoffee(32.5);
		cup.drinkCoffee(Math.ceil(r.nextDouble() * 38.9));
		cup.drinkCoffee(Math.ceil(r.nextDouble() * 42));
		cup.increaseCupSize(17);
		// cup.drinkCoffee(40); // The drinkbefore increaseCupsize, the currentvolume is
		// set to 5. This is where the exception is thrown,
		// and you can't drink more than current volume. The capacity is at 57.
		// the exception is thrown at canDrink method, because drinkCoffee (40) is
		// larger than currentvolume (5)
		// cup.drinkCoffee(Math.ceil(r.nextDouble() * 42)); Same here (currvolume = 5)
		// cup.drinkCoffee(Math.floor(r.nextDouble() * 20.5));
		cup.fillCoffee(32.5); // curr volume 37.5
		cup.drinkCoffee(Math.ceil(r.nextDouble() * 38.9));
		// cup.drinkCoffee(Math.ceil(r.nextDouble() * 42)); // currvolume 2.5, also
		// exception here.
		cup.increaseCupSize(17);
	}

	// overall in part1 it is the currentvolume that is smaller than
	// the volume one is trying to drink, therefore the canDrink() method is
	// returning false and throwing an exception

	private void part2() {
		cup = new CoffeeCup(40.0, 20.5); // capacity: 40, currvol = 20.5
		r = new Random(987654321L);
		cup.drinkCoffee(Math.floor(r.nextDouble() * 20.5)); // curr vol = 14.5
		cup.fillCoffee(Math.floor(r.nextDouble() * 30)); // curr vol = 38.5
		cup.drinkCoffee(Math.ceil(r.nextDouble() * 38.9)); // curr vol = 36.5
		cup.drinkCoffee(Math.ceil(r.nextDouble() * 42)); // curr vol = 6.5
		cup.increaseCupSize(Math.floor(r.nextDouble() * 26)); // curr vol = 6.5
		// cup.fillCoffee(Math.ceil(r.nextDouble() * 59)); // Throws exception because
		// the volume
		// filled is 40, and there is alreaddy 6.5 curr vol, so therefore the
		// isValidVolume
		// throws exception because volume becomes more than capacity.
		// cup.drinkCoffee(Math.ceil(r.nextDouble() * 42)); // throws exception, because
		// volume drinked is 29
		// the canDrink() method throws the error illegalargument
		cup.increaseCupSize(Math.floor(r.nextDouble() * 35)); // capacity increased to 63, curr vol = 6.5
		cup.fillCoffee(Math.floor(r.nextDouble() * 30)); // returned 0, so no change
		cup.increaseCupSize(Math.floor(r.nextDouble() * 26)); // capactiy to 65
	}

	public static void main(String[] args) {
		CoffeeCupProgram program = new CoffeeCupProgram();
		program.init();
		program.run();
	}

}
