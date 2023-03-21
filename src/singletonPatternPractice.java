public class singletonPatternPractice {
    public static void main(String[] args) {
        stores.getStores();

        Toyota1.letsDrive();

    }
}
// in singleton pattern we can make only one abject from one class

class stores {
    private static stores s; //creating reference variable using private and static

    private stores() {

    }

    public static stores getStores() {
        if (s == null) {
            s = new stores();
            System.out.println("object created once");
        }
        return s;

    }
}

class Toyota1{
    String color = "silver";
    static Toyota1 to;

    private Toyota1(){

    }
    public static Toyota1 letsDrive(){ //static because we have to call in the name of class
        if(to == null) {
            to = new Toyota1();
            System.out.println("the destination is near");
        }
        return to;
    }
}