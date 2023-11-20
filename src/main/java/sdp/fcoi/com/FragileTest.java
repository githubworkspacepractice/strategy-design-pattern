package sdp.fcoi.com;

public class FragileTest {

	public static void main(String[] args) {
		/*
		 * Here code will become fragile(easily broken) 
		 * because if you change the superclass datatype int to float
		 * then sub-classes will get error change to superclass datatype
		 * inheritence not allow with same method with different datatypes
		 * it treat as duplicate methods.
		 * public int m1()
		 * public float m1()
		 */
		FragileClassC fragileClass = new FragileClassC();
		fragileClass.m1();

	}

}
