package PracticeSession;

public class Practice1 {
    public static void main(String[] args) {
        Fruit f = new Fruit("Banana");
        Fruit f1 = new Fruit("Mango");
        Fruit f2 = new Fruit("Papaya");
        //Fruit.displayFruit();
        System.out.println(Fruit.count);


    }
}
class Fruit{
    static int count = 0;
    String fruitName;
    public Fruit(String fN){
        this. fruitName = fN;
       //Fruit. count = Fruit.count +1;
       getFruit();
    }
    //public static void displayFruit(){
        //System.out.println(Fruit.count);
    //}
    public static void getFruit(){
        Fruit. count = Fruit.count +1;
    }
}