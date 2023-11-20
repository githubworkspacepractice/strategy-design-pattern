package sdp.fcoi.com;

public class TestablityCompositionTest {

	public static void main(String[] args) {
/*
 * One short we will test car with all test scenario 
 * and also only one .class will give to testing team.
 */
		CompositionCar car1 = new CompositionCar(new MockEnginee1());
		car1.drive();
		CompositionCar car2 = new CompositionCar(new MockEnginee2());
		car2.drive();
		CompositionCar car3 = new CompositionCar(new MockEnginee3());
		car3.drive();
	}

}
