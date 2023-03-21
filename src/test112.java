public class test112 {
    public static void main(String[] args) {
        school12 s = new school12("Sampada", 12);
        System.out.println(s.studentName);
        System.out.println(s.grade);
        s.study(33);
        s.study(33,44);

        academy1 a = new academy1("Sampada Pant", 21);
        System.out.println(a.fullName);
        System.out.println(a.rollNumber);
        a.getExam(122);
        a.getResult(122,76);

        collegee1 c = new collegee1("Sampada Pant",22,"Dhapasi");
        System.out.println(c.address);
        System.out.println(c.fullName);
        System.out.println(c.rollNumber);
        c.getResult(12,23);
        c.getExam(12);
    }
}
    class school12 {
        String studentName;
        int grade;
     public school12(String sName, int gr){
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

class academy1 {
    String fullName;
    int rollNumber;

    public academy1(String fN, int rN) {
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

class collegee1 extends academy{
    String address;
    public collegee1(String fN, int rN, String add) {
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