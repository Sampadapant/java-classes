package Interface;

public class interFace4 {
    public static void main(String[] args) {
        //Interface can also have default method
        Artist a = new Artist();
        a.dance();
        a.sing();
        a.dance(23);
    }
}
interface Art {
    public void sing();

    //if we want a default method of a body to implement we have to use default keyword
    default void dance() {
        System.out.println("let's dance");
    }

    default void dance(int x) {
        System.out.println("let's not dance");
    }
}
class Artist implements Art {

    @Override
    public void sing() {
        System.out.println("I always love singing a song");
    }

    public void dance() {
        System.out.println("let's dance together");
    }
}


         //we can override this default method of interface
            //different class same method same signature
            //we can override the method in interface

