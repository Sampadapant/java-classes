public class overRidingoverLoading {
    public static void main(String[] args) {
        //object creation without constructor of university
        univerSity u = new univerSity();
        u.teach();
        u.teach(12,13);
        u.teach(12,13,14);

        //object creation with constructor of school
        school s = new school("Sampada", 12);
        System.out.println(s.studentName);
        System.out.println(s.grade);
        s.study(33);
        s.study(33,44);

        //object creation without constructor of overriding in paathshala
        paathShala p = new paathShala();
        p.read();
        p.write(21);

        campus i = new campus();
        i.write(23);
        i.read();

        //object creation with constructor of overriding in academy
        academy a = new academy("Sampada Pant", 21);
        System.out.println(a.fullName);
        System.out.println(a.rollNumber);
        a.getExam(122);
        a.getResult(122,76);

        collegee c = new collegee("Sampada Pant",22,"Dhapasi");
        System.out.println(c.address);
        System.out.println(c.fullName);
        System.out.println(c.rollNumber);
        c.getResult(12,23);
        c.getExam(12);


    }
}
//method overloading: same class, same method, different signature
//method overriding : different class, same method, same signature with inheritance

class univerSity{ //without constructor
    public void teach(){
        System.out.println("blank called");
    }
    public void teach(int x, int y){
        System.out.println(x +y);
    }
    public void teach (int x, int y, int z){
        System.out.println(x+ y-z);
    }
}
class school { //using constructor
    String studentName;
    int grade;
    public school(String sName, int gr){
        this.studentName = sName;
        this.grade = gr;
    }

    public void study(int a2){
        System.out.println("let's study " + a2);
    }
    public void study (int a2, int a3){
        System.out.println(a2 +a3);
    }
}

//overRiding without constructor

class paathShala{
    public void read(){
        System.out.println("blank method called");
    }
    public void write (int e){
        System.out.println( "students are writing " + e);
    }
}

class campus extends paathShala{
    public void read(){
        System.out.println("students are reading");
    }
    public void write (int e){
        System.out.println("Students are not writing " + e);
    }
}

//overRiding with constructor
class academy {
    String fullName;
    int rollNumber;

    public academy(String fN, int rN) {
        this.rollNumber = rN;
        this.fullName = fN;
    }

    public void getExam(int a) {
        System.out.println("students are appearing exam" + a);
    }

    public void getResult(int a, int b) {
        System.out.println(a + b);
    }
}

    class collegee extends academy{
        String address;
        public collegee(String fN, int rN, String add) {
            super(fN, rN);
            this.address = add;
        }
        public void getExam(int a){
            System.out.println("exam are finished" + a);
        }
        public void getResult (int a, int b){
            System.out.println(a*b);
        }
    }

