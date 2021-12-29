public class Week8a{
	public static void main(String[] args) {

		Apple a = new Apple();
		System.out.println(a);

		Fruit f = new Fruit();
		System.out.println(f.toString());

		Fruit f2 = new Apple();
		Fruit f3 = new Banana();

		//Apple a2 = new Fruit();

		a.printAppleType();
		//f2.printAppleType();
		System.out.println(f2);
		f2.eat();

		Fruit[] fruits = {a, f, f2, f3, new Apple(), new Banana(), new Orange()};
		for(Fruit fruit: fruits)
			System.out.println(fruit);
	}
}

class Apple extends Fruit{
	@Override
	public String toString(){
		return "This is an Apple";
	}
	void printAppleType(){
		System.out.println("This is APORT");
	}
}

class Fruit extends Object{
	@Override
	public String toString(){
		return "This is a Fruit";
	}

	void eat(){
		System.out.println("Eating ...");
	}
}

class Banana extends Fruit{
	@Override
	public String toString(){
		return "This is an Banana";
	}
}

class Orange extends Fruit{
	// @Override
	// public String toString(){
	// 	return "This is an Orange";
	// }
}