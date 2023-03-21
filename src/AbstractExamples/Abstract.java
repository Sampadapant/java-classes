package AbstractExamples;

public class Abstract {
    public static void main(String[] args) {
// abstraction means hiding
        //abstract class can have method with definitions only
        // abstract class can have normal methods
        //we cannot create object of the abstract class
        Lumbini l = new Lumbini();
        l.loan();
        l.savings();
        l.displayBranchName();
        l.displayCountryName();

        Bus b = new Bus();
        b.start();
        b.stop();
        b.dropPassengers();
        b.carryPassengers();

        Apple a = new Apple("graphite ","macintosh ",1001);
        a.displayDetail();
        a.textMessage();
    }
}
abstract class WorldBank1{
    public abstract void loan(); //abstract method
    public abstract  void savings();

    public void displayCountryName(){ //regular method
        System.out.println("Nepal");
    }

    }
    class Lumbini extends WorldBank1 {

        @Override
        public void loan() {
            System.out.println("AbstractExamples.Lumbini loan");

        }

        @Override
        public void savings() {
            System.out.println("AbstractExamples.Lumbini savings");

        }
       public void displayBranchName(){
           System.out.println("AbstractExamples.Lumbini Branch");

       }
    }
abstract class Vehicle2{
    public abstract void start();
    public abstract void stop();

    public void carryPassengers(){
        System.out.println("Passengers are inside vehicle");
    }

}
class Bus extends Vehicle2{

    @Override
    public void start() {
        System.out.println("AbstractExamples.Bus should start");
    }

    @Override
    public void stop() {
        System.out.println("AbstractExamples.Bus should stop");
    }

    public void dropPassengers(){
        System.out.println("Passengers are coming out of vehicle");
    }
}

abstract class Mobile{
    String color;
    String type;
    public Mobile (String color, String type){
        this.color = color;
        this.type = type;
    }
    abstract public void displayDetail(); //abstract has no body only definition.
}
class Apple extends Mobile{
    int price;
    public Apple(String color, String type, int price) {
        super(color, type);
        this.price = price;
    }

    @Override
    public void displayDetail() {
        System.out.println(this.color +this.type + this.price);
    }
    public void textMessage(){
        System.out.println("Message should be written");
    }
}




