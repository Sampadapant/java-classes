package ENUM;
enum flowers{
    LILY, DAISY, ROSE,JASMINE;


}

class flowersTest{
    flowers f;
    public flowersTest(flowers f){
        this. f = f;
    }
    public void getFlowers(){
        switch(f){
            case LILY:
                System.out.println("i have lily flowers");
                break;
            case ROSE:
                System.out.println("i have rose flowers");
                break;
            case DAISY:
                System.out.println("i have daisy flowers");
                break;
            case JASMINE:
                System.out.println("i have jasmine flowers");
                break;
        }
    }
}
public class enumSwitch {
    public static void main(String[] args) {
        flowersTest ft = new flowersTest(flowers.JASMINE);
        ft.getFlowers();
        flowersTest ft1 = new flowersTest(flowers.DAISY);
        ft1.getFlowers();
      flowers f11 []  =flowers.values();
      for(flowers f12 : f11){
          System.out.println(f12);
          System.out.println(f12.ordinal());
      }

    }
}
