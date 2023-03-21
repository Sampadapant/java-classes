package Interface;

public class inetrFacePractice11 {
    public static void main(String[] args) {

    }
}
interface sporTs{
    public void cricket();
    public void football();
}
interface muSic{
    public void sing();
    public void playKeyboard();
}
abstract class HobBy{
    String inTerest;
    String passion;
    public HobBy(String in, String pas) {
        this.inTerest = in;
        this.passion = pas;
    }
        abstract public void sinGing();
        public void goLive(){
            System.out.println(this.inTerest);

        }
    }
    class life extends HobBy implements sporTs, muSic{

        public life(String in, String pas) {
            super(in, pas);
        }

        @Override
        public void cricket() {

        }

        @Override
        public void football() {

        }

        @Override
        public void sing() {

        }

        @Override
        public void playKeyboard() {

        }

        @Override
        public void sinGing() {

        }
    }
