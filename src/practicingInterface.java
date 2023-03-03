public class practicingInterface {
    public static void main(String[] args) {
        Sam ss = new Sam();
        ss.sa(2,4);
        ss.sa(45);

    }
}
// method overloading and overriding - polymorphism

//overloading : same class, same method , different signature

class Sam { //without constructor
    public void sa(int w, int x){
        System.out.println(w*x);
    }
    public void sa (int s){
        System.out.println(s);
    }
}
//overriding without constructo