//sealed class in java

public class Testing {

	public static void main(String[] args) {
		ajay a=new ajay();
		a.fun();
		vijay ba=new vijay();
		ba.fun();
		Human h=new Human();
		h.fun();
	}

}

sealed class Human permits ajay,vijay{
	
	void fun() {
		System.out.println("I am sealed class Human");
	}
}
non-sealed class ajay extends Human{
	
	void fun() {
		System.out.println("I am non-sealed class ajay");
	}
	
}
final  class vijay extends Human{
	
	void fun() {	
		System.out.println("I am final class vijay");
	}
	
}