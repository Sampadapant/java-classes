public class staticInnerClass {
    public static void main(String[] args) {
        departmentStores ds = new departmentStores();
        departmentStores.groceries gr = ds. new groceries();
        gr.displayCityD();

        departmentStores .fruitNut fn =  new departmentStores.fruitNut();
        fn.displayCityF();

    }
}

// how can we access the methods of both the classes
class departmentStores{
    class groceries{
        public void displayCityD(){
            System.out.println("groceries available");
        }

    }
    static class fruitNut{

        public void displayCityF(){
            System.out.println("fruit and nuts available");
        }
    }
}