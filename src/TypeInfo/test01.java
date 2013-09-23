package TypeInfo;

public class test01 {

	public test01() {
		System.out.println("constructor");
	}

	static {
		System.out.println("static method");
	}

	public static void main(String args[]) {
		test01 t = new test01();
	}

}
