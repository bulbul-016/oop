//week2

import java.util.Scanner;

public class SimpleCircle {
    public static void main(String[] args) {

        Circle circle1=new Circle();
        System.out.println("The area of the circle of radius "
            + circle1.radius+" is "+circle1.getArea());
            
        Circle circle2=new Circle(25);
        System.out.println("The area of the circle of radius "
            + circle2.radius+" is "+circle2.getArea());

        Circle circle3=new Circle(125);
        System.out.println("The area of the circle of radius "
           + circle3.radius+" is "+circle3.getArea());

        circle2.radius=100;
        System.out.println("The area of the circle of radius "
            + circle2.radius+" is "+circle2.getArea());


        Rectangle r1=new Rectangle();
        System.out.println(r1); //Rectangle@4517d9a3
        System.out.println(r1.width); //0 defalt value
        r1.width=2;
        System.out.println(r1.width); //2

        Rectangle r2=new Rectangle(16);
        System.out.println(r2.width);
    }
    
}

class Circle{
    double radius;

    Circle(){
        radius=1;
    }

    Circle(double newRadius){
        this.radius=newRadius;
    }

    double getArea(){
        return radius*radius*Math.PI;
    }

    double getPerimeter(){
        return 2*radius*Math.PI;
    }

    void setRadius(double newRadius){
        radius=newRadius;
    }

}

class Rectangle{
    int width;

    Rectangle(int w){
       width=w;
    }

    Rectangle(){
        width=3;
    }
}
