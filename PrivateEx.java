package Main;



public class PrivateEx {
	private int a=3;

	public static void main(String[] args) {
		PrivateEx p = new PrivateEx();
		p.a=10;
		System.out.println(p.a);

	}

}
