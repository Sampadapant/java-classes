public class iInterface {
    public static void main(String[] args) {
        Everest e = new Everest();
        e.discount(44);
        e.save(0);
        e.loan(0);

        NABIL n = new NABIL();
        n.discount(4);
        n.save(4);
        n.loan(4);

    }
}
// interface is rule implementation
// we cannot create object of interface
// before java 8 interface used to have abstract method ;without body
// interface will not have constructor because they are not inherited ; they are interfaced
interface NRBRules{
    abstract public void save (int x);
    abstract public void loan (int x);
    abstract public void discount (int x);

}
// let's implement //WE NEED TO DEFINE THE BODY MANDATORY
class Everest implements NRBRules {

    @Override
    public void save(int x) {
        System.out.println("savings: Everest");
    }

    @Override
    public void loan(int x) {
        System.out.println("loan:Everest");

    }

    @Override
    public void discount(int x) {
        System.out.println("discount: Everest");

    }
}
class NABIL implements NRBRules{

    @Override  //it is giving the body for unimplemented methods
    public void save(int x) {
        System.out.println( "NABIL save");

    }

    @Override
    public void loan(int x) {
        System.out.println("NABIL loan");

    }

    @Override
    public void discount(int x) {
        System.out.println("NABIL discount");

    }
}