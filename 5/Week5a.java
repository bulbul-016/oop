public class Week5a{
    public static void main(String[] args) {
        Student3 s1=new Student3("Kaisar");
        System.out.println(s1.getGPA());
        s1.setGPA(3.98);
        System.out.println(s1.getGPA());

        int [] arr=new int[10];
        Student3[] student3s = new Student3[10];

        student3s[0]=new Student3("Ali");
        student3s[1]= new Student3("Zere");

        for(int i=2; i<student3s.length; i++){
            student3s[i]=new Student3("Other");
        }
        for(int i=0; i<student3s.length; i++){
            System.out.println(student3s[i].getName());
        }

    }
}

class Student3{
	private String name;
	public String id;
	private double gpa = 4;
	String specialty;
	private static int x;

    Student3(String n){
        name=n;
    }

    public double getGPA(){return gpa;}
    public void setGPA(double gpa){
        this.gpa=gpa;
    }
    static void changeNumber(int s){
        s=10;
        Student3.x=10;
    }
    static void changeName(Student3 s){
        s.name="Almas";
    }
    public String getName(){
        return "Student3: "+ this.name;
    }
    public void printStudent3(){
        System.out.println("Student3: "+ name);
        double gpa=3.95;
        System.out.println(gpa);
    }

}
