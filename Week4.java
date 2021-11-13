import java.lang.Math;
import java.util.Random;

//final class Math{
  //  static int a=1;
//}

public class Week4 {
    public static void main(String[] args) {
        final int x=3; //constant value
        System.out.println(x);

        //Math m= new Math();
        //System.out.println(m.a);
        //m.a=2;
        //System.out.println(m.a);

        //System.out.println(Math.a);

        System.out.println(Math.PI); //3.141592653589793  
        System.out.println(Math.sqrt(4)); //2.0
        System.out.println(Math.abs(-116)); //116

        System.out.println(Math.random()); //between 0 and 1
        //0.16195534871271866

        Random r=new Random();
        System.out.println(r.nextInt(1000));
        
    }
    
}
