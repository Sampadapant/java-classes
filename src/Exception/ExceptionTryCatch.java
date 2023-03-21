package Exception;

public class ExceptionTryCatch {
    public static void main(String[] args) {

        System.out.println("It is raining outside");
        try {
            System.out.println(10/0);
        }
        catch(ArithmeticException e) {
            System.out.println("this is incorrect input");
        }

        System.out.println("I wish the rain could stop now");

        try{ //we write sth that may occur error
            System.out.println(500/0);
        }
        catch(ArithmeticException e){ //if we raise sth then the catch will work
            System.out.println("we are handling exception");

        }
        finally{ // whether pass or fail, this will always run; if we want to execute the code
            System.out.println("it should be executed at last");
        }






    }
}
//Exception: unhandled events, invalid input from user, connect failure, code errors, opening a file which not available
//try catch
//finally
//throw and throws
//we as a tester we need to highlight the error