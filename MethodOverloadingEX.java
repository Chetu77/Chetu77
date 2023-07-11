package Main;

public class MethodOverloadingEX {
	public void add() {
		int a=10,b=20;
		System.out.println(a+b);
	}
	void add(int a) {
	  int	b=6;
		System.out.println(a+b);
	}
	void add(int a, int b) {
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		MethodOverloadingEX m=new MethodOverloadingEX();
		m.add();
		m.add(3);
		m.add(20, 58);

	}

}
