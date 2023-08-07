
public class Peterson {

	public static void main(String[] args) {
		PetersonNumber num=new PetersonNumber();
		num.check(145);

	}

}
class PetersonNumber{
	static int fact(int n)
	{
		if(n==1)
			return 1;
		return n*fact(n-1);
	}
	void check(int n) {
		int t,s=0,r;
		t=n;
		while(t!=0)
		{
			r=t%10;
			s=s+fact(r);
			t=t/10;
		}
		if(n==s)
			System.out.println(n+" is a Peterson Number");
		else
			System.out.println(n+" Is not a Peterson Number");
	}
}
