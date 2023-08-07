
public class Bike {

	public static void main(String[] args) {
		SpeedBike s;
		s=new Bike1();
		s.run();
	}

}
interface SpeedBike{
	void run();
}
class Bike1 implements SpeedBike{
	public void run() {
		System.out.println("running");
	}
}
class Splendor extends Bike1{
	public void run1() {
		System.out.println("running safely with 60km");
	}
	
}
