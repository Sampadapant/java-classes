package Exception;

public class exceptionClass {
    public static void main(String[] args) {
        TestClass.dividedByZeroException();
    }
}

class TestClass{
    public static void dividedByZeroException(){
        throw new ArithmeticException("trying divide by zero"); //giving out to the console //raising the exception with message
    }
}
