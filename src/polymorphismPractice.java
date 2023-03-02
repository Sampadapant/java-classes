public class polymorphismPractice {
    public static void main(String[] args) {

        Person12 p = new Person12();
        p.walk(12,23);
        p.walk(45);
        p.walk(12,34,10,67);
        p.walk(2,3);

        Person13 pp = new Person13("Sampada","Pant");
        System.out.println(pp.firstName);
        System.out.println(pp.lastname);
        pp.talk(34);
        pp.talk(322,788);
        pp.talk(7,8,9,4);

        Vehicle11 v = new Vehicle11("silver","toyota", 2022);
        System.out.println(v.color);
        System.out.println(v.brand);
        System.out.println(v.makeYear);
        v.startVehicle();
        v.stopVehicle();

        Toyota t = new Toyota("blue", "RAV4", 2023, "SUV");
        System.out.println(t.color);
        System.out.println(t.brand);
        System.out.println(t.makeYear);
        System.out.println(t.type);
        t.startVehicle(111);
        t.stopVehicle(444);

    }
}
//overloading : same class, same method, different signature
//overriding : different class, same method, same signature via inheritance

class Person12 { //without constructor
    public void walk (int a , int b){
        System.out.println(a+b);
    }
    public void walk ( int c){
        System.out.println(c);
    }
    public void walk (int a, int b, int c, int s){
        System.out.println(a+b-c + s);
    }
    public void walk (int x, int y , int z){
        System.out.println(x*y*z);
    }
}

class Person13 {
    String firstName;
    String lastname;
    public Person13(String fn, String ln){ //calling constructor
        this. firstName = fn;
        this.lastname = ln;
    }
    public void talk (int a1){
        System.out.println(" I am talking " + a1);
    }
    public void talk (int a1, int b1){
        System.out.println( a1 + b1);
    }
    public void talk (int s1, int s2, int s3, int s4){
        System.out.println(s1 * s2*s3*s4);
    }
    }

    //overriding
class Vehicle11 {
    String color;
    String brand;
    int makeYear;
    public Vehicle11 (String color, String brand, int makeYear){ //using constructor
        this. color = color;
        this. brand = brand;
        this.makeYear = makeYear;
    }
    public void startVehicle(){
        System.out.println("start the vehicle");
    }
    public void stopVehicle(){
        System.out.println("stop the vehicle");
    }
    }
class Toyota extends Vehicle11{
String type;
    public Toyota(String color, String brand, int makeYear, String type) {
        super(color, brand, makeYear);
        this.type = type;
    }
    public void startVehicle (int x){
        System.out.println("let's start toyota" + x);
    }
    public void stopVehicle (int y){
        System.out.println("let's stop toyota" + y);
    }
}


