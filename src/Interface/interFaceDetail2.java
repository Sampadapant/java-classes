package Interface;

public class interFaceDetail2 {
    public static void main(String[] args) {
        veggies v = new veggies();
        v.getleaf();
        v.getPeel();
        v.getTaste();

    }
}
// interface with abstract method and two default method
//class implements the interface and this class has two regular methods

interface brinjal{
    public void getTaste();
    default void getleaf(){
        System.out.println("green");

    }
    default void getPeel(){

        System.out.println("peel the Interface.brinjal");
    }
}
class veggies implements brinjal {

    @Override
    public void getTaste() {
        System.out.println("it is tasty");

    }

    public void getleaf() {
        System.out.println("green1");

    }

    public void getPeel() {
        System.out.println("peel the brinjal1");
    }

}
