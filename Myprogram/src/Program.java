import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Binary b=new Binary();
		b.input();
		b.show();
		b.convert();
		b.convert1();
		
	}

}
class Binary{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	void input() {
		a=sc.nextInt();
	}
	void show() {
		System.out.println(a);
	}
	void convert() {	//convert decimal to binary
		int s=0,r1;
		int[] sc=new int[10];
		while(a!=0) {;
		r1=a%2;
		sc[s++]=r1;
		a=a/2;
		}
		for(int i=s-1;i>-1;i--)
			System.out.print(sc[i]);
	}
	void convert1() {//convert binary to decimal
		int i=0;
		while(a!=0) {
			b=a%10;
			c=c+b*(int)Math.pow(2,i);
			a=a/10;
			i++;
		}
		System.out.println(c);
	}
}
class Num{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	void input() {
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	}
}