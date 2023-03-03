public class interFace3 {
    public static void main(String[] args) {
        //EXAMPLE OF EXTEND
        Life l = new Life("novels","success","documentries");
        System.out.println(l.enjoy);
        System.out.println(l.interest);
        System.out.println(l.passion);
        l.cooking();
        l.cricket();
        l.football();
        l.playGuitar();
        l.showInterest();
        l.sing();
    }
}
interface SpoRts{
    public void cricket();
    public void football();
}
interface MuSic{
    public void sing();
    public void playGuitar();
}
abstract class Hobby{
    String interest;
    String passion;
    public Hobby(String inTe,String pass ){
       this.interest = inTe;
       this.passion = pass;
    }
    abstract public void cooking();
    public void showInterest(){
        System.out.println(this.interest);
    }
}
class Life extends Hobby implements SpoRts,MuSic{
    String enjoy;
    public Life(String inTe, String pass, String enj) {
        super(inTe, pass);
        this.enjoy = enj;
    }

    @Override
    public void cricket() {
        System.out.println("I enjoy watching cricket");
    }

    @Override
    public void football() {
        System.out.println("Football never gets old");
    }

    @Override
    public void sing() {
        System.out.println("I used to sing a song");
    }

    @Override
    public void playGuitar() {
        System.out.println("I always wanted to play guitar");
    }

    @Override
    public void cooking() {
        System.out.println("cooking is my hobby");
    }
}