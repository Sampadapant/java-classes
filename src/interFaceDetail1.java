public class interFaceDetail1 {
    public static void main(String[] args) {
        Fruits f = new Fruits("red","small", "round");
        System.out.println(f.shape);
        System.out.println(f.size);
        System.out.println(f.color);
        f.getShape();
        f.getColor();
        f.color();
        f.getSize();
        f.getShape();
        f.taste();
        f.getTaste();

    }
}
//two interface ; one abstract class;
//class extends abstract class which has constructor implements interface
// abstract class has constructor, abstract method and normal method

interface grapes {
    public void taste();
    public void color();
}
interface blueberry {
    public void getTaste();
    public void getColor();
}
abstract class apple{
    String color;
    String size;
    public apple(String c, String s){
        this.color = color;
        this.size = size;
    }
    abstract public void getSize();
    public void displayColor(){
        System.out.println(this.color + this. size);
    }
}

class Fruits extends apple implements blueberry,grapes{
    String shape;

    public Fruits(String c, String s, String sh) {
        super(c, s);
        this.shape = sh;
    }

    @Override
    public void taste() {
        System.out.println("sweet");
    }

    @Override
    public void color() {
        System.out.println("red");

    }

    @Override
    public void getTaste() {
        System.out.println("bitter");

    }

    @Override
    public void getColor() {
        System.out.println("pink");

    }

    @Override
    public void getSize() {
        System.out.println("small");

    }
    public void getShape(){
        System.out.println(this.shape);
    }
}