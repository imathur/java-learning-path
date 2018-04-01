public class XtoYLoop {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);
	for (int i = x; i < y; i++) {
            System.out.println(i);
	}
    }
}
