package Interface;

public class interFacewithClassCombined {
    public static void main(String[] args) {

    }
}

interface A{
    public void getA();
    public void setA();
}
interface B{
    public void getB();
    public void setC();
}

class C{
    int c1;
    int c2;

    public C(int c1, int c2){
        this.c1 = c1;
        this.c2 = c2;
    }
    public void getC(){
        System.out.println("Interface.C called");
    }
}

class D extends C implements A, B{

    public D(int c1, int c2) {
        super(c1, c2);
    }

    @Override
    public void getA() {

    }

    @Override
    public void setA() {

    }

    @Override
    public void getB() {

    }

    @Override
    public void setC() {

    }

    public void getD(){
        System.out.println("Interface.D called");
    }
}
