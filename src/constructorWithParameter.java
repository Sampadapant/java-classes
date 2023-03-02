public class constructorWithParameter {
    public static void main(String[] args) {
        //constructor
        //constructor with parameter
        // default constructor

        Person1 p = new Person1();
        p.Add(); //returning integer should be stored in the variable?? always??
        int p1 = p.Add();
        System.out.println(p1);
    }
}

class Person1 {
    int i = 0;
    public Person1(){
        System.out.println("calling constructor");
        i =5;
    }
    public int Add(){
        return this.i;
    }

}