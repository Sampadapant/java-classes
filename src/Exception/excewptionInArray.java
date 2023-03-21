package Exception;

public class excewptionInArray {
    public static void main(String[] args) {
        int [] a = new int[3];
        a[0] = 23;
        a[1] = 33;
        a[2] = 43;


        try {
            for (int i = 0; i < a.length ; i++)
                System.out.println(a[i]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("this has to be printed");
        }
        System.out.println("we are trying array index exception");


    }
}
