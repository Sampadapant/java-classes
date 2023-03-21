package ENUM;

public class enumConstructor  {
    public static void main(String[] args) {
        Rainbow rb = Rainbow.BLUE;
        System.out.println(rb);
        rb.displaycolor();

    }
}
enum Rainbow{
    VIOLET, INDIGO,BLUE, GREEN,YELLOW, ORANGE,RED;

    private Rainbow(){
        System.out.println("constructor called");
    }
    public void displaycolor(){
        System.out.println("rainbow method called");
    }
}
//INTERNALLY CONSTRUCTORS ARE CALLED