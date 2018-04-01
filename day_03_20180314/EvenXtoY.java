public class EvenXtoY {
    public static void main(String[] args) {
	int x = Integer.parseInt(args[0]) ;
	int y = Integer.parseInt(args[1]) ;
	for (int i = x ; i < y ; i ++) {
	    if(i % 2 == 0) {
	        System.out.println(i) ;
	    }
	}
    }
}
