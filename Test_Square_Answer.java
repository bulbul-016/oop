
public class Test_Square_Answer {

    public static void main (String[] args) {
		double side1 = 5.63;
		Square square1 = new Square(side1);
		System.out.println("square area is " + square1.getArea());
		System.out.println("square perimeter is " + square1.getPerimeter());

		double side2 = 6.58;
		Square square2 = new Square(side2);
		System.out.println("square area is " + square2.getArea());
		System.out.println("square perimeter is " + square2.getPerimeter());

		printBiggerSquareArea(square1, square2);
	}

    public static void printBiggerSquareArea(Square s1, Square s2){
 	    if(s1.getArea()>s2.getArea())
 		    System.out.println(s1.getArea());
 	    else
 		    System.out.println(s2.getArea());
    }

}
  
class Square {

	private double side;
	private static int numberOfObjects;

	public Square(double side) {
		this.side = side;
	}

	public double getArea() {
		return side * side;
	}

	public double getPerimeter() {
		return 4 * side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public static int getNumberOfObjects() { 
		return numberOfObjects;    
	}
	
} 