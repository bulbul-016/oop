class House{
    int numOfFloors;
    int area;
    String color;

    static String streetName = "Abylai khan ";
    static int cnt = 0;
    String address;
    
    Boolean parking;
    House(int a, String c, int b, Boolean p){
        area = a;
        color = c;
        numOfFloors = b;
        cnt += 1;
        address = streetName + cnt;
        parking = p;
    }
    void showNumberOfFloors(){
        System.out.println("Number of floors = " + numOfFloors);
    }
    void showArea(){
        System.out.println(area);
    }
    void changeColor(){}

    String IcanPark(){
        if(parking == true){
            return "Yes, you can!";
        }
        else{
            return "No, you can't!";
        }
    }
    static void showStreetName(){
        System.out.println(streetName);
    }
    static void showTotalNumberOfHouses(){
        System.out.println(cnt);
    }

    // done => TASK-1: Add at least one more instance data field;

    // done => TASK-2: Add at least one more instance method;   

    // done => TASK-3: Create a method showTotalNumberOfHouses(); 

    // done => TASK-4: Generate Addresses (Street numbers) automatically (Ex: Abylai khan 1, Abylai khan 2, etc.).
}

public class w3{
    public static void main(String[] args) {
        //House.showStreetName();
        House.showTotalNumberOfHouses();
        House h1 = new House(50, "White", 5, true);
        House h2 = new House(120, "Brown", 8, false);

        //System.out.println(h1.color);
        //System.out.println(h2.color);
        System.out.println(h1.address);
        System.out.println(h2.address);
        
        //h1.showArea();
        //h2.showArea();
        //h1.showNumberOfFloors();
       // h2.showNumberOfFloors();
        //System.out.println(h1.IcanPark());
        //System.out.println(h2.IcanPark());
       
        // System.out.println(h1.streetName);
        // System.out.println(h2.streetName);
        
        // h1.streetName = "Abylai khan";
        // System.out.println(h1.streetName);
        // System.out.println(h2.streetName);
        // System.out.println(House.streetName);

        //House.showArea();
        //House.showStreetName();
        House.showTotalNumberOfHouses();
    }
}
