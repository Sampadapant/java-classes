public class interfaceDetail {
    public static void main(String[] args) {
        opSof os = new opSof();
        os.airdrop();
        os.facetime();
        os.message();
        os.phonecalss();
        os.facetime();
        os.screenshot();

        makeUp m = new makeUp();
        m.getBrand();
        m.getColor();
        m.getMakeUp();
        m.matte();
        m.getColor();
        m.getBrand();
    }
}
interface android {
    public void screenshot();
    public void phonecalss();
}
interface iphone {
    public void message();
    public void facetime();
}
interface windows{
    public void airdrop();

}
class opSof implements android,iphone,windows {

    @Override
    public void screenshot() {
        System.out.println("ss taken");
    }

    @Override
    public void phonecalss() {
        System.out.println("dial phone");

    }

    @Override
    public void message() {
        System.out.println("message sent");

    }

    @Override
    public void facetime() {
        System.out.println("let's do facetime");

    }

    @Override
    public void airdrop() {
        System.out.println("connected");

    }

}
//two interface and third interface extends the previous interface
//class implement the third interface

interface lipstick{
    public void getColor();
    public void getBrand();

}
interface eyeshadow {
    public void waterproof();
    public void matte();
}
interface nailpolish extends lipstick, eyeshadow{
    public void getshine();
}
class makeUp implements nailpolish{

    @Override
    public void getColor() {
        System.out.println("pink");
    }

    @Override
    public void getBrand() {
        System.out.println("maybelline");

    }

    @Override
    public void waterproof() {
        System.out.println("longlasting");

    }

    @Override
    public void matte() {
        System.out.println("it doesnot shine");

    }

    @Override
    public void getshine() {
        System.out.println("you are amazing");

    }
    public void getMakeUp(){
        System.out.println("beautiful");
    }
}
