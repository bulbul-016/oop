import java.util.*;

class MyFirstProgram {
    public static void main(String[] args){
        int x=5;
        System.out.println(++x); //6
        System.out.println(x);   //6

        Scanner input = new Scanner(System.in);
        int y = input.nextInt();  //9

        String str=input.next();   //onbes

        System.out.println("Answer: " + (x+y)+"-"+str);  //Answer: 15onbes

        for(int i=0; i<10; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        System.out.print(x+ "\n");
        System.out.println("ok");
    }
    
}
