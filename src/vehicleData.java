public class vehicleData {
    public static void main(String[] args) {
        String vehicleName = "toyota";
        String q = vehicleName.toUpperCase();
        System.out.println(q);

        //create instance or object of vehicle class
        Vehicle lexus = new Vehicle ("lexus", 121);
        System.out.println(lexus.number);
        System.out.println(lexus.vehiclename);
        lexus.start();
        lexus.stop();


        Vehicle toyota = new Vehicle ( "toyota", 101);
        System.out.println(toyota.number);
        System.out.println(toyota.vehiclename);
        toyota.start();
        toyota.stop();

    }
}
class Vehicle{
    String vehiclename;
    int number;

    public Vehicle (String vehicleName, int number) {
        this.vehiclename = vehicleName;
        this.number = number;
    }

    public void start () {
        System.out.println("you need to start");
    }
    public void stop () {
        System.out.println("you need to stop");
    }
}
