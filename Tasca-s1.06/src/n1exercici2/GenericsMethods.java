package n1exercici2;

public class GenericsMethods<K> {

	private K a;
	private K b;
	private K c;
	

	public GenericsMethods(K a, K b, K c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}


	public GenericsMethods() {
		this.a=null;
		this.b=null;
		this.c=null;
	}


	public void genericsMethods(K a, K b, K c) {
		System.out.println(a+"\n"+b+"\n"+c);
	}

}