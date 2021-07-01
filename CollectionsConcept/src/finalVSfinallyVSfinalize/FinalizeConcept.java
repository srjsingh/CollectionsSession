package finalVSfinallyVSfinalize;

public class FinalizeConcept {

	public void finalize() { // finalize is a method used for cleaning process before the garbage collector
		System.out.println("finalize method");
	}
	
	public static void main(String[] args) {

		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		System.gc();
		
	}

}
