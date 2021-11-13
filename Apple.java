public class Apple{
    public static void main(String[] args) {
        System.out.println(1);
        crApple a= new crApple();
        System.out.println("main");
    }
}

class crApple extends Fruit{
    crApple(){
        super("Apple created"); //new Fruit()
        System.out.println(2);
    }
}

class Fruit{
    Fruit(String s){
        System.out.println("fruit");
        System.out.println(s);
    }
}

/*1
fruit
Apple created
2
main
*/