package Interface;

public class InterFace {
    public static void main(String[] args) {
        square s = new square();
        s.getArea(12,13);

    }
}
interface rectangale {
    public void getArea(int length, int breadth);
}
class square implements rectangale{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("the area of Interface.square is " + (length*breadth)+ ".");
    }
}