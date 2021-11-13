public class This {
    public static void main(String[] args) {
        Cherry c= new Cherry();
        System.out.println("main");
    }
}
class Cherry extends Fruit1{
    
    private String s;

    Cherry(){
        this("Ailan");
        //System.out.println("this");
    }
    Cherry(String e){
        System.out.println(e);
    }
}
class Fruit1{
    Fruit1(){
        System.out.println(2);
    }
}
