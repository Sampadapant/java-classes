public class typesOfInheritance {
    public static void main(String[] args) {

        //creating object of Student
        Student s = new Student("Sampada",21,"Pant");
        //System.out.println(s.firstname);
        //System.out.println(s.age);
       // System.out.println(s.lastname);
       // s.displayFullName();

        //creating object of Teacher
        Teacher t = new Teacher("Jitendra",38, "Pradhan",29000);
        System.out.println(t.firstname);
        System.out.println(t.age);
        System.out.println(t.lastname);
        System.out.println(t.salary);
        t.displayBonus();
        t.displayFullName();

        // Multilevel
        //creating object of StudentA
        StudentA aa = new StudentA("Bhawana Pant",30);
        System.out.println(aa.fullName);
        System.out.println(aa.age);
        aa.displayFullName();

        //creating object of TeacherA
        TeacherA tt = new TeacherA("Dinesh Sharma", 31, 30000);
        System.out.println(tt.fullName);
        System.out.println(tt.age);
        System.out.println(tt.salary);
        tt.displayFullName();
        tt.displayAge();
        tt.displaySalary();

        //creating object of ProfessorA
        ProfessorA pp = new ProfessorA("Richard Johnson",46,50000,"english");
        System.out.println(pp.fullName);
        System.out.println(pp.age);
        System.out.println(pp.salary);
        System.out.println(pp.spec);
        pp.displayAge();
        pp.displaySpec();
        pp.displayFullName();
        pp.displaySalary();
    }
}
//single inheritance

class Student {
    String firstname;
    int age;
    String lastname;

    public Student (String fn, int ag, String ln) {
        this. firstname = fn;
        this.age = ag;
        this.lastname = ln;
    }
    protected void displayFullName (){
        System.out.println(this.firstname + this.lastname);
    }
}
class Teacher extends Student {
int salary;
    public Teacher(String fn, int ag, String ln, int salary) {
        super(fn, ag, ln);
        this.salary = salary;
    }
    public void displayBonus (){
        this.displayFullName();
        System.out.println(1000);
    }
}
class StudentA {
    protected String fullName;
    protected int age;
    public StudentA (String fn, int ag) {
        this.fullName = fn;
        this.age = ag;
    }
    public void displayFullName (){
        System.out.println(this.fullName);
    }
}
class TeacherA extends StudentA {
    int salary;

    public TeacherA(String fn, int ag, int salary) {
        super(fn, ag);
        this.salary = salary;
    }
    public void displayAge (){
        System.out.println(this.age);
    }
    public void displaySalary (){
        System.out.println(this.salary);
    }
}
class ProfessorA extends TeacherA {
    String spec;

    public ProfessorA(String fn, int ag, int salary, String spec) {
        super(fn, ag, salary);
        this.spec = spec;
    }
    public void displaySpec(){
        System.out.println(this.spec);
    }
}
