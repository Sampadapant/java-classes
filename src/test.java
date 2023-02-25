public class test {
    public static void main(String[] args) {
        Vehicle1 v = new Vehicle1("red", "SUV");
        v.vehicleStop();
        v.vehicleStart();

        Vehicle1 v1 = new Vehicle1("blue", "sedan");
        v1.vehicleStart();
        v1.vehicleStop();

        Vehicle1 v2 = new Vehicle1("pink", "suv");
        v2.vehicleStop();
        v2.vehicleStart();

        Vehicle1 [] v3 = {
                new Vehicle1("red", "SUV"),
                new Vehicle1("blue", "sedan"),
                new Vehicle1("pink", "suv")

        };
        for (Vehicle1 vs :v3){
            vs.vehicleStart();
            vs.vehicleStop();
        }




    }
}
class Vehicle1{
    private String color;
    String type;
    public Vehicle1 (String cl, String typ ){
        this.color = cl;
        this.type = typ;
}

public void vehicleStart(){
    System.out.println("vehicle starts");;
}
public void vehicleStop(){
    System.out.println("vehicle stops");
}



        }

//define a class vehicle; vehicle should have two properties color and type;
// color should be private property
// private property should be access by public method
//class should have method start and stop
// create three objects