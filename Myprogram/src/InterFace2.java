
public class InterFace2 {

	public static void main(String[] args) {
		Polygon r=new Rectangle(); //upcasting
		r.getarea();
		r.print();
		Polygon s=new Square();
		s.getarea();
		s.print();
	}	

}
interface Polygon{
	void getarea();
	
	default void print() {
		System.out.println("No.of side in polygon ");
	}
}
class Rectangle implements Polygon{
	public void getarea(){
		System.out.println("Area of rectangle : "+4*9);
	}
	public void print() {
		System.out.println("No. of side in rectangle is 4");
	}
}
class Square implements Polygon{
	public void getarea() {
		System.out.println("Area of Square : "+4*4);
	}
}
