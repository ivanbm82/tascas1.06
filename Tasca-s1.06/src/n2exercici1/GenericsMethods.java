package n2exercici1;

public class GenericsMethods<K> {

	private K a;
	private String apellido;
	private K c;

	public GenericsMethods(K a, String apellido, K c) {
		this.a=a;
		this.apellido=apellido;
		this.c=c;
	}

	public GenericsMethods() {
		this.a=null;
		this.apellido=null;
		this.c=null;
		
	}

	public String getApellido() {
		return apellido;
	}

	

	public K getA() {
		return a;
	}

	

	public K getC() {
		return c;
	}
	public void genericsMethods(K a, String apellido, K c) {
		System.out.println(a+"\n"+apellido+"\n"+c);
	}

	

}