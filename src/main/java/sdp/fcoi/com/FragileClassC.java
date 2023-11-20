package sdp.fcoi.com;

public class FragileClassC extends FragileClass {

	public int m1()
	{
		int result = super.m1();
		System.out.println("FragileClassC");
		return result;
	}
}
