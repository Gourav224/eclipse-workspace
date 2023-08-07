import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		Fib f=new Fib();
		f.input();
		f.print();
	}

}
class Fib{
	Scanner inp=new Scanner(System.in);
	int n;
	void input() {
		System.out.println("Enter the number of terms in Fibonacci series ");
		n=inp.nextInt();
	}
	void print() {
		int n1=0,n2=1,n3=0;
		System.out.print("Fibonacci series : "+n1+" "+n2);
		for(int i= 3;i<=n;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
