
public class SunnyNumber {

	public static void main(String[] args) {
		Sunny su=new Sunny();
		for(int i=0;i<200000;i++)
		su.check(i);

	}

}
class Sunny{
	void check(int n) {
		double t=Math.sqrt(n+1);
		if(t-Math.floor(t)==0)
			System.out.println(n+" is Sunny number ");
//		else
//			System.out.println(n+" is not sunny number");
	}
}
