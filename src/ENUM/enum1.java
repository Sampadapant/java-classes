package ENUM;

enum banks1{
    wellsFargo, bankofAmerica, chase
}
public class enum1 {
    public static void main(String[] args) {
        Testbanks T = new Testbanks(banks1.bankofAmerica);
        T.getBank();

    }
}
class Testbanks{
    banks1 bn;

    public Testbanks(banks1 b){
        this.bn = b;
    }

    public void getBank(){
        switch(bn){
            case wellsFargo:
                System.out.println("near");
                break;
            case bankofAmerica:
                System.out.println("far");
                break;
            case chase:
                System.out.println("on the way to work");
        }
    }
}