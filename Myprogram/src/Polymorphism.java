
public class Polymorphism {

	public static void main(String[] args) {
		Shape s; //reference -
//		s=new Shape();
//		s.draw();
		
		s=new Circle(); //Late binding
		s.draw();
//		s.draw(12.5);
//		Triangle t=new Triangle(); //Early binding
//		t.draw();
	}

}
// early binding
// late binding :- only possible if overriding is possible
class Shape{
	void draw() {
		System.out.println("Draw a Shape");
	}
}

class Circle extends Shape {
	
	void draws() {//overriding same name function in different class when inheritance (latest defination work
		System.out.println("Draw a Circle");
	}
	void draw(double r) {//overloading :- Same name function with different signature
		System.out.println("Area of Circle : "+3.14*r*r);
	}
}

class Triangle extends Shape{
	void draw() {
		super.draw();
		System.out.println("Draw a Circle");
	}
}