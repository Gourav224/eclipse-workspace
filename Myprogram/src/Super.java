
public class Super {
	public static void main(String []args) {
		
		BabyDog1 a=new BabyDog1();
		a.eat();
//		Dog1 s=new Dog1();
//		s.eat();
	}
}
class Animal1{
	void eat() {
		System.out.println("Eating");
	}
}
class Dog1 extends Animal1{
	void eat() {
//		super.eat();
		System.out.println("Eating bread");
	}
}
class BabyDog1 extends Dog1{
	void eat() {
		super.eat();
		System.out.println("Drinking Milk");
	}
}
