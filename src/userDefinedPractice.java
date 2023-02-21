public class userDefinedPractice {
    public static void main(String[] args) {
        Pen maxriter = new Pen();
        System.out.println(maxriter.color);
        System.out.println(maxriter.type);

        //if we create another object, we get the same value

        Pen technotip = new Pen();
        System.out.println(technotip.color);
        System.out.println(technotip.type);

        // if i want to change the value for type of maxriter
        maxriter.type = "gel";
        System.out.println(maxriter.type);

        // if i want to change the value for color of technotip
        technotip.color = "black";
        System.out.println(technotip.color);

        //calling the constructor
        mobile mac = new mobile ("apple","graphite", 14);
        mobile android = new mobile ("samsung", "silver", 20);
        mobile windows = new mobile ("nokia","black", 7);

        mobile phones [] = {mac, android,windows};
        // for loop
        for (int i = 0; i <phones.length; i++){
            //System.out.println(i);
            //System.out.println(phones[i]);
            //System.out.println(phones[i].brand);
            //System.out.println(phones[i].color);
            //System.out.println(phones[i].series);
        }

        //for each loop
        for (mobile m :phones){
            //System.out.println(m);
            System.out.println(m.brand);
            System.out.println(m.color);
            System.out.println(m.series);

        }


    }
}
class Pen{
    String color = "blue";
    String type = "ball";

    public void write(){
        System.out.println(this.color);
    }

        }
class mobile {
    String brand;
    String color;
    int series;

    public mobile (String brand, String color, int series) {
        this.brand = brand;
        this.color= color;
        this.series = series;
    }
    public void call () {
        System.out.println(this.brand);

    }

}


