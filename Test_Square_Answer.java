
public class Test_Square_Answer {

    public static void main (String[] args) {
		double side1 = 5.63;
		Square square1 = new Square(__________);
		System.out.println("square area is " + square1.getArea());
		System.out.println("square perimeter is " + square1.getPerimeter());

		double side2 = 6.58;
		Square square2 = new Square(side2);
		System.out.println("square area is " + square2.getArea());
		System.out.println("square perimeter is " + square2.getPerimeter());

		printBiggerSquareArea(__________, __________);
	}

    public static __________ printBiggerSquareArea(Square s1, Square s2){
 	    if(s1.getArea()__________s2.getArea())
 		    System.out.println(s1.getArea());
 	    else
 		    System.out.println(s2.getArea());
    }

}
  
class Square {

	private double side;
	private __________ int numberOfObjects;

	public __________(double side) {
		this.side = side;
	}

	public double getArea() {
		return side * side;
	}

	public double getPerimeter() {
		return __________ * side;
	}

	public void setSide(double side) {
		__________.side = side;
	}

	public static int getNumberOfObjects() { 
		return __________;    
	}
	
} 