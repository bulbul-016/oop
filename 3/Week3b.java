class Student{
    static String university= "KBTU";
    int id;
    static int cnt=0;
    float gpa;
    int course;
    
    Student(){

        cnt+=1;
        id=cnt;

    }
    Student(String u,  float g, int c){
        university=u;
        cnt+=1;
        id=cnt;
        gpa=g;
        course=c;
        
    }

    void showGpa(){
        System.out.println(gpa);
    }

    void showUniversity(){
        System.out.println(university);
    }

    void showId(){
        System.out.println("ID of student: "+ id);
    }

    static void showNumOfStud(){
        System.out.println(cnt);
    }

}
public class Week3b {
    public static void main(String[] args) {
        Student.showNumOfStud();


        Student s1=new Student();
        //System.out.println(s1.university);
        System.out.println(s1.id);
        //System.out.println(s1.gpa);

        Student s2=new Student("KBTU",  3.95f, 2);
        //System.out.println(s2.university);
        System.out.println(s2.id);
        //System.out.println(s2.gpa);
        //System.out.println(s2.course);
        Student s3=new Student();
        Student s4=new Student();
        Student s5=new Student();
        Student s6=new Student();

        //s1.showGpa();
        //s2.showGpa();

        //s1.showId();
        //s2.showId();

        //s1.showUniversity();

        Student.showNumOfStud();

    }
  
}

    // TASK-1: Add at least one more instance data field;
        //examle: the radius of this circle - data field

	// TASK-2: Add at least one more instance method;	
        //methods example: void showUniversity(){}

	// TASK-3: Create a method showTotalNumberOfStudents();

	// TASK-4: Generate IDs automatically.
