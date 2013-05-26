public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//CastTests();
		ConstructorTests();
	}

	private static void ConstructorTests() {
		new Print("start");
		new Extended();
	}

	private static void CastTests() {
		B b = new B();
		A a = (A) (Object) b;
	}

}
