class StuDent{
    public String name;
    public String id;
    private double gpa;
    String speciality;

    StuDent(){}

    public double getGpa(){
        return gpa;
    }
    public void setGpa(double g){gpa=g;}

    static void changeNumber(int a){
        a=10;
    }
    static void changeName(StuDent s){
        s.name="Sabyr";
    }
    
}

public class Week4b {
    public static void main(String[] args) {

        StuDent s1=new StuDent();
        System.out.println(s1.name);
        System.out.println(s1.speciality);

        System.out.println(s1.getGpa());

        s1.setGpa(3.95);
        System.out.println(s1.getGpa());

        int x=5;
        System.out.println(x); //5
        StuDent.changeNumber(x);
        System.out.println(x); //5

        System.out.println(s1.name); //null
        StuDent.changeName(s1);
        System.out.println(s1.name); //Sabyr
    }
    
}

/*
TASK-1: Add at least 2 more data fields with different access modifiers
TASK-2: Add at least 2 more methods with different access modifiers
TASK-3: Create a class University that includes Student as a data field (group of students, if possible)
*/