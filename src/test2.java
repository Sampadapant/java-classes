public class test2 {
    public static void main(String[] args) {
        person123 pp = new person123();
        pp.sleep();
        pp.talk();
        pp.walk();
        pp.displayName();

    }
}
interface human{
   abstract public void talk();
    public void walk();


}
interface human1{
    public void sleep();

}

abstract class sampada{
    abstract public void sleep();
    public void displayName(){
        System.out.println("name is sampada");
    }
}
class person123 extends sampada implements human{

    @Override
    public void talk() {
        System.out.println("let's talk");
    }

    @Override
    public void walk() {
        System.out.println("lets walk");

    }

    @Override
    public void sleep() {
        System.out.println("let's not sleep");

    }
}
