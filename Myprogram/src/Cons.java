
public class Cons {

	public static void main(String[] args) {
		New n=new New(4,5);
		n.show();
		n.swap();
		n.show();
	}

}
class New{
	int a,b;
	New(){	}
	New(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	void show() {
		System.out.println(a+", "+b);
	}
	void swap() {
		a=a+b;
		b=a-b;
		a=a-b;
	}
	
}

