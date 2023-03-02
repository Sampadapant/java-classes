public class polymorphism {
    public static void main(String[] args) {
        Calculator cl = new Calculator();
        cl.addition(12,14); //called it with two parameters
        cl.addition(12,14,16); //called it with three parameters
        cl.addition(12,14,16,18); //called it with four parameters

        //calculator1 ; CALLING CONSTRUCTOR
        Calculator1 clb = new Calculator1();
        Calculator1 clc = new Calculator1(12);
        Calculator1 cld = new Calculator1(12,14);
        Calculator1 cle = new Calculator1(12,14,16);

        //MBBL
        MBBL m = new MBBL("kathmandu",988,87);
        m.loan(133);
        m.savings(1332);

        //sbl
        SBL s = new SBL("pokhara",877, 232);
        s.loan(44);
        s.savings(900);

        SonD san = new SonD("shyam", "pant","sandesh");
        san.displayName();

    }
}
// over loading ; same class ; same method; different signature
class Calculator {
    public void addition (int x, int y){
        System.out.println(x+y);
    }
    public void addition (int x, int y , int z){
        System.out.println(x+y+z);
    }

    public void addition (int x, int y, int z, int a){
        System.out.println(x+y+z+a);
    }
}
// constructor overloading

class Calculator1 {
    public Calculator1(){
        System.out.println("Default Constructor");
    }
   public Calculator1(int x){
       System.out.println("called with one parameter");
   }
   public Calculator1(int x, int y){
       System.out.println("called with two parameters");
   }
   public Calculator1(int x, int y, int z){
       System.out.println("called with three parameters");
   }
}

/*
METHOD OVERRIDING
 Different class
Same method name
same signature via inheritance
*/

class WorldBank {
    String city;
    int pincode;
    public WorldBank (String city, int pincode){
        this. city = city;
        this.pincode = pincode;
    }
    public void loan (int x){
        System.out.println("wb:Home loan is " + x);
    }
    public void savings (int y){
        System.out.println("wb: personal saving " + y);
    }
}
class MBBL extends WorldBank{
    int code;
    public MBBL(String city, int pincode, int code) {
        super(city, pincode);
        this.code = code;
    }
    public void loan (int x){
        System.out.println("mbbl:Home loan is " + x);
    }
    public void savings (int y){
        System.out.println("mbbl: personal saving " + y);
    }

}
class SBL extends WorldBank{
    int bcode;

    public SBL(String city, int pincode, int bcode){
        super(city, pincode);
        this.bcode = bcode;
    }
    public void loan (int x){
        System.out.println("sbl:Home loan is " + x);
        super.loan(33); //need to ask?
    }
    public void savings (int y){
        System.out.println("sbl: personal saving " + y);
        super.savings(23);
    }
}
class FatherD {
   String firstName;
   String lastName;
    public FatherD(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName= lastName;
    }
    public void displayName (){
        System.out.println(this.firstName + this.lastName);
    }
}
class SonD extends FatherD{
    String sName;

    public SonD(String firstName, String lastName, String sName) {
        super(firstName, lastName);
        this.sName = sName;
    }

    @Override
    public void displayName() {
        System.out.println(this.sName + this.lastName);
        super.displayName();
    }
}
