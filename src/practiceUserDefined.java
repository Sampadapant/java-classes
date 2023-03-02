public class practiceUserDefined {
    public static void main(String[] args) {
        TeacherD d = new TeacherD();
        System.out.println(d.firstName);
        System.out.println(d.lastName);
        System.out.println(d.age);

        TeacherD e = new TeacherD();
        System.out.println(e.firstName);
        System.out.println(e.lastName);
        System.out.println(e.age);

        e.age = 42;
        System.out.println(e.age);

        d.firstName = "dikky";
        System.out.println(d.firstName);

        Teacher1 t = new Teacher1("tim ", "mooray", 32);
        System.out.println(t.firstName);
        System.out.println(t.lastName);
        System.out.println(t.age);
        t.displayFullName();
        t.displayAge();

        Teacher1 r = new Teacher1("ramila ","pradhan",34);
        System.out.println(r.firstName);
        System.out.println(r.lastName);
        System.out.println(r.age);
        r.displayFullName();

        Teacher1 rr = new Teacher1("rita ","rastogi",37);
        System.out.println(rr.firstName);
        System.out.println(rr.lastName);
        System.out.println(rr.age);
        rr.displayFullName();

        Teacher1 rrr = new Teacher1("reegya ","rimal",39);
        System.out.println(rrr.firstName);
        System.out.println(rrr.lastName);
        System.out.println(rrr.age);
        rrr.displayFullName();

        Teacher1 school [] = {
                new Teacher1("tim ", "mooray", 32),
                new Teacher1("ramila ","pradhan",34),
                new Teacher1("rita ","rastogi",37),
                new Teacher1("reegya ","rimal",39),
        };

        for (int i = 0; i < school.length; i++){
            //System.out.println(i);
            //System.out.println(school[i]); //ref
            System.out.println(school[i].firstName);

        }
        for (Teacher1 tc : school){
            //System.out.println(tc);
            System.out.println(tc.firstName);
            System.out.println(tc.lastName);
            System.out.println(tc.age);
        }


    }
}
class TeacherD {
    String firstName = "Daisy";
    String lastName = "Johnson";
    int age = 41;

    public void fullName (){
        System.out.println(this.firstName + this.lastName);
    }
}

class Teacher1 {
    String firstName;
    String lastName;
    int age;
    public Teacher1 (String fn, String ln, int ag) {
       this.firstName = fn;
       this.lastName = ln;
       this.age = ag;
    }
    public void displayFullName (){
        System.out.println(this.firstName + this.lastName);
    }

    public void displayAge(){
        System.out.println(this.age);
    }
}

