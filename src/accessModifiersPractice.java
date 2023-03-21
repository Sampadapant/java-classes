public class accessModifiersPractice {
    public static void main(String[] args) {
        aa objaa = new aa();
       // System.out.println(objaa.aa1);
        //objaa.getaa1();

        bb objbb = new bb();
        System.out.println(objbb.bb1);
        objbb.getbb1();

    }
}
class aa {
    private int aa1;
    private void getaa1(){
        System.out.println("aa called");
    }
}
 class bb{
    int bb1;
    void getbb1(){
        System.out.println("bb called");
    }
 }

