package sdp.fcoi.com;
/*
 * In car class for test each scenario 
 * need to change the code.
 * but .class you will provide for testing is only one class
 * Here for every test scenario change Mockengines 1,2,3
 */
public class Car extends MockEnginee2 {

	public void drive()
	{
		int startCount = super.start();
		if(startCount == 0)
		{
			System.out.println("Enginee not started");
		}
		else if(startCount == 1)
		{
			System.out.println("Manual Enginee started");
		}
	}
}
