package Exception;

public class ExcepetionPractice {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println("i doubt this is mistake");
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("exception occured");
            //System.out.println(e.getStackTrace()); //it gives info about exception
            //e.getStackTrace();
            String a1 = e.toString(); //info about exception in string
            System.out.println(a1);

        } finally {
            System.out.println("this has to printed any how");


        }
        System.out.println("it is an end");
    }
}
