public class FizzBuzz {
    public static void main(String[] args) {
	int n = Integer.parseInt(args[0]) ;
        for(int i = 1 ; i < n ; i++ ) {
            boolean divBy3 = (i % 3 == 0) ;
            boolean divBy5 = (i % 5 == 0) ;
	    if (divBy3 || divBy5) {
		if (divBy3) {
		    System.out.print("Fizz ") ;
	        }
	        if (divBy5) {
		    System.out.print("Buzz") ;
	        }
		System.out.println() ;
	    }
	    else {
		System.out.println(i) ;
	    }
	}
    }
}
