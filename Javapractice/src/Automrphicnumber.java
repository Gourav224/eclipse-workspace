import java.util.*;
public class Automrphicnumber {

	public static void main(String[] args) {
	Autonumber aa=new Autonumber();
	aa.input();
	aa.check();
	aa.show();

	}

}
class Autonumber{
	Scanner inp=new Scanner(System.in);
	int n,s;
	int f=0;
	void input() {
		n=inp.nextInt();
	}
	void check() {
		s=(int)Math.pow(n, 2);
		int t=n;
		while(t!=0) {
			int r=t%10;
			int r1=s%10;
			if(r!=r1)
				f=1;
			t=t/10;
			s=s/10;
		}
	}
	void show() {
		if(f==1)
			System.out.println(n+" is not automorphic number");
		else
			System.out.println(n+" is automorphic number");
	}
}
