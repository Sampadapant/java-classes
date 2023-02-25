class a {
 private   int b = 10;
 private void s1 (){
     System.out.println(b);
 }
}

class b {
int c = 122;
void a1 (){
    System.out.println(c);
}
}

class c {
    public int i = 5;
    public void t1 (){
        System.out.println(i);
    }
}

class flowers {
    private String color = "yellow";
    private void displayColor (){
        System.out.println(this.color);
    }
    void displayColor2 (){
        this.displayColor();
    }
}

class Toys {
    private String color = "red"; //without constructor
    public void setColor (String clr) {

        this.color = clr;
    }
    public String getColor(){
        return this.color;
    }

}

class Toys1{
private String color;
public Toys1 (String cl) { //using constructor
    this.color = cl;
}
void setColorName(String clr) {
    this.color = clr;
}
String getColorName () {
    return this.color;
}
}

public class accessModifiers {
    public static void main(String[] args) {

        // object for private class a
        a obja = new a ();
        //obja. b = 22; // cannot access because  it is private
        //obja.s1(); // cannot access because  it is private

        //object for default class b

        b objb = new b ();
        objb. c = 233;
        objb. a1();

        // object for public class c
        c objc = new c ();
        objc.i = 322;
        objc.t1();

        //object for flowers
        flowers flw = new flowers();
        //System.out.println(flw.displayColor); because of private it could not get access
        flw.displayColor2();

        //object for toys without constructor
        Toys play = new Toys ();
        play.setColor("red");
        String newColor = play.getColor();
        System.out.println(newColor);

        //object for toys1 with constructor
        Toys1 play1 = new Toys1 ("blue");
        System.out.println(play1.getColorName());

        play1.setColorName("purple");
        System.out.println(play1.getColorName());
    }
}
