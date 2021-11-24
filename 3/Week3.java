import java.util.Random;

class A{
    int x;
    void f(){
        int x;
    }

    A(){
        this.x=0;
    }
}

public class Week3 {
    public static void main(String[] args) {
        A a=new A();
        int x=2;
        System.out.println(a.x); //0
        System.out.println(x); //2

        int y=x;
        x++;
        System.out.println(x); //3
        System.out.println(y); //2

        A b= new A();
        System.out.println(b.x); //0 defalt value

        A c=b;
        System.out.println(c.x);

        b.x=10;
        System.out.println(b.x); //10
        System.out.println(c.x); //10

        java.util.Date d= new java.util.Date();
        System.out.println(d); //Mon Oct 18 09:43:19 ALMT 2021

        d.setTime(163765784);
        System.out.println(d); //Mon Jan 12 19:46:40 ALMT 1970

        Random random1=new Random(3);
        System.out.print("From random1: ");
        for(int i=0; i<10; i++){
            System.out.print(random1.nextInt(1000)+ " ");
        }
        Random random2=new Random(3);
        System.out.print("\nFrom random2: ");
        for(int i=0; i<10; i++){
            System.out.print(random2.nextInt(1000)+ " ");
        }
        Random random3=new Random(8);
        System.out.print("\nFrom random3: ");
        for(int i=0; i<10; i++){
            System.out.print(random3.nextInt(1000)+ " ");
        }

        //From random1: 734 660 210 581 128 202 549 564 459 961
        //From random2: 734 660 210 581 128 202 549 564 459 961
        //From random3: 364 956 930 21 372 158 331 931 853 0
        


    }
    
}
