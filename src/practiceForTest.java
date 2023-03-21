public class practiceForTest {
    public static void main(String[] args) {
        waterBottle wb = new waterBottle("x-l","blue");
        System.out.println(wb.color);
        System.out.println(wb.size);
        wb.displayBottle();
        wb.drinkWater();
        wb.displayWater();
    }
}
abstract class Bottle{
    String size;
    String color;
    public Bottle (String size, String color){
    this.color = color;
    this.size = size;
    }
        abstract public void displayBottle();
    public void drinkWater(){
        System.out.println("we can drink water");
    }
    }
    class waterBottle extends Bottle{

        public waterBottle(String size, String color) {
            super(size, color);
        }

        @Override
        public void displayBottle() {
            System.out.println("bottle is empty");
        }
        public void displayWater(){
            System.out.println("water bottle called");
        }
    }

