package ENUM;

enum Status1{
    Running, Failed, Pending , Success;
}
public class enumPractice {
    public static void main(String[] args) {
       Status1 [] ab =Status1.values();
        System.out.println(ab[0]);
        //for each
        for (Status1 a : ab){
            System.out.println(a);

        }
        for(int i = 0; i < ab.length; i++){
            //System.out.println(i);
            System.out.println(ab[i]);
        }

    }
}
