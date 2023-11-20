package sdp.fcoi.com;

public class CompositionCar {

	private Enginee enginee;
	
	public CompositionCar(Enginee engine)
	{
		this.enginee = engine;
	}
	
	public void drive()
	{
		int starTCount = enginee.start();
		
		if(starTCount == 0)
		{
			System.out.println("Enginee not started");
		}
		
		else if(starTCount == 1)
		{
			System.out.println("Munual engine started");
		}
		
		else if(starTCount == 2)
		{
			System.out.println("Automatic engine Started");
		}
		
		
	}
	
}
