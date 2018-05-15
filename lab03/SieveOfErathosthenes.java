public class SieveOfErathosthenes {

	public static void main(String[] args) {
		if (args.length < 1) { 
			System.out.println("You need to enter an argument!");
		}
		int upperBound = Integer.parseInt(args[0]);

		// create an aray with last index is upper bound:
		boolean[] isNotPrime = new boolean[upperBound + 1];

		// for loop to find all the primes:
		for (int i = 2; i <= upperBound; i++) {
			if (isNotPrime[i] == false) {
				for (int a = 2; a*i <= upperBound; a++ ) {
					isNotPrime[a*i] = true;
				}
			}


//			if (isNotPrime[i] == true) {
//				// means the index i is a composite number;
//				continue;
//			} else {
//				// if index i is a prime, then set all its integer multiples to
//				// true to mark them as composites:
//
//			}
		}
		for (int i = 2; i <= upperBound; i++) {
			if (!isNotPrime[i]) {
				System.out.println(i + " is a prime number.");
			}
		}
	}
}