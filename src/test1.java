public class test1 {
    public static void main(String[] args) {
        Sampada11 ss= new Sampada11(31,"Pant","fair");
        ss.displayName();
        ss.displayDetail();
        System.out.println(ss.age);
        System.out.println(ss.complexion);
        System.out.println(ss.lastName);



    }
}
abstract class Sampada{
    int age;
    String lastName;
    public Sampada(int ag, String ln){
        this.age = ag;
        this.lastName = ln;
    }
    abstract public void displayDetail();
    public void displayName(){

    }
}
class Sampada11 extends Sampada{
    String complexion;

    public Sampada11(int ag, String ln, String comp) {
        super(ag, ln);
        this.complexion= comp;
    }

    @Override
    public void displayDetail() {
        System.out.println("Sampada called");
    }
}