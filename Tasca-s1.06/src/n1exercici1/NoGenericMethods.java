package n1exercici1;

public class NoGenericMethods<K> {

	private K a;
	private K b;
	private K c;

	public NoGenericMethods(K a, K b, K c) {
		this.setA(a);
		this.setB(b);
		this.setC(c);
	}

	public K getA() {
		return a;
	}

	public void setA(K a) {
		this.a = a;
	}

	public K getB() {
		return b;
	}

	public void setB(K b) {
		this.b = b;
	}

	public K getC() {
		return c;
	}

	public void setC(K c) {
		this.c = c;
	}

}
