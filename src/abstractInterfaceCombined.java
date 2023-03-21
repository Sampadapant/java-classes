public class abstractInterfaceCombined {
    public static void main(String[] args) {
       closet c = new closet("big","coffee brown",12);
        System.out.println(c.cabinet);
        System.out.println(c.color);
        System.out.println(c.size);
        c.getBedSheet();
        c.getRoom();
        c.getCabinet();
        c.getCarpet();
        c.setBedSheet();
        c.setCarpet();
        c.setCarpet();
    }
}
interface carpet{
    public void getCarpet();
    public void setCarpet();
}
interface bedSheet{
    public void getBedSheet();
    public void setBedSheet();
}
abstract class Room{
    String size;
    String color;
    public Room(String size, String color){
        this.color = color;
        this.size = size;
    }
    abstract public void getRoom();
    public void setRoom(){
        System.out.println("room called");
    }
    }
    class closet extends Room implements carpet, bedSheet{
    int cabinet;

        public closet(String size, String color, int cab) {
            super(size, color);
            this.cabinet = cab;
        }

        @Override
        public void getCarpet() {
            System.out.println("grey");
        }

        @Override
        public void setCarpet() {
            System.out.println("color is not attractive");

        }

        @Override
        public void getBedSheet() {
            System.out.println("bedsheet is large");

        }

        @Override
        public void setBedSheet() {
            System.out.println("color is pink");

        }

        @Override
        public void getRoom() {
            System.out.println("room is sea faced");

        }
        public void getCabinet(){
            System.out.println("Cabinet Called");
        }
    }
