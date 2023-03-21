public class testtt {
    public static void main(String[] args) {

        Citya a = new Citya("sampada");
        Citya a1 = new Citya("sampada");
        Citya a2 = new Citya("sampada");
        Citya a3 = new Citya("sampada");

        Citya.getcount();

    }

}


//write a program to count number of objects


class Citya{

    static int count = 0;

    String name;
    public Citya (String nm) {
        this.name =nm;
        Citya.count = Citya.count +1;

    }

    public static void getcount() {
        System.out.println(Citya.count);
    }
}
