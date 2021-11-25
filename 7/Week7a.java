public class Week7a{
	public static void main(String[] args) {

		Apple a = new Apple();
		System.out.println("End of main");
		
	}
}

class Apple extends Fruit{
	//String s = "APPLE";
	Apple(){
		//System.out.println("Start of Apple");
		super("Apple created");	// new Fruit();
		//this(s);	// new Apple(s);
		System.out.println("End of Apple");
	}

	//Apple(String s){}
	
}

class Fruit{
	Fruit(String s){
		System.out.println("Fruit is created");
		System.out.println(s);
	}
}
