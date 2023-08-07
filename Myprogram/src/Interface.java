
interface Requirement{
	public void input(); //Abstract method
}

public class Interface {

	public static void main(String[] args) {
		Requirement rr=new Implement();
		rr.input();
	}

}
class Implement implements Requirement{
	public void input() {
		System.out.println("Requirement implementation ");
	}
}
interface A{
	public void a();
	public void b();
}
class Ca implements A{
	public void a() {
		System.out.println("a");
	}
	public void b() {
		System.out.println("I am B");
	}
}
