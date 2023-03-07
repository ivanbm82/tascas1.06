package n2exercici2;

import java.util.*;

public class GenericsMethods<K> {

	private List<K> a = new ArrayList<>();
	

	public GenericsMethods(List<K>a) {
		this.a=a;
		
	}

	public GenericsMethods() {
		this.a=null;
		
		
	}

	

	

	public List<K> getA() {
		return a;
	}

	
	public void genericsMethods(List<K>a) {
		System.out.println(a	);
	}

	

}