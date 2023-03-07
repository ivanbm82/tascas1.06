package n1exercici1;

public class App {

	public static void main(String[] args) {

		NoGenericMethods<String> persona = new NoGenericMethods<>("Ivan", "Garcia", "Fernandez");
		NoGenericMethods<String> persona1 = new NoGenericMethods<>("Garcia", "Fernandez", "Ivan");

		System.out.println(persona.getA()+" "+persona.getB()+" "+persona.getC());
		System.out.println(persona1.getC()+" "+persona1.getA()+" "+persona1.getB());
	
	}

}
