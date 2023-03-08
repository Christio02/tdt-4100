package uke9.lambdastreams;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

// Eksempel fra https://www.journaldev.com/2763/java-8-functional-interfaces

public class Prime {
	//Tradisjonell måte 
	private static boolean isPrime(int number) {		
		if(number < 2) return false;
		for(int i=2; i<number; i++){
			if(number % i == 0) return false;
		}
		return true;
	}
	

	private static boolean isPrime2(int number) {		
		return number > 1 && 
			IntStream.range(2, number)
			.noneMatch(index -> number % index == 0);

	}

	private static boolean isPrime3(int number) {		


		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		IntPredicate isDivisible = index -> number % index == 0;
		return number > 1 && 
			IntStream.range(2, number)
			.noneMatch(isDivisible);

	}
	public static void main(String[] args) {

		// for (int i = 0; i < 100; i++) {
		// 	if (isPrime(i)) {
		// 		System.out.println(i +" er et primtall");
		// 	}
		// }

		// Finnes det andre måter, tro...

		IntStream.range(0, 100) // set a range
		.parallel() // parallel stream, not guaranteed that the integers come in correct order
		.filter(n -> Prime.isPrime3(n)) // filter by using method
		.forEach(n -> System.out.println(n)); // go trough range
	}
}
