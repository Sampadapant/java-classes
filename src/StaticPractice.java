public class StaticPractice {
    public static void main(String[] args) {
        superStores ss = new superStores();
        System.out.println(ss.location);

        superStores.departmentStore ds = ss.new departmentStore();
        System.out.println(ds.toiletries);
        System.out.println(ds.grocery);
        ds.depStore();


    }
}
class superStores{
    String location = "Dhapasi";

    class departmentStore{
        String grocery = "Interface.veggies";
        String toiletries = "hand soap";

        public void depStore(){
            System.out.println(this.toiletries);
        }
    }
}