public class staticMethod1 {
    public static void main(String[] args) {
        bankAccount2 aa = new bankAccount2("Arlington");
        bankAccount2 a1 = new bankAccount2("Arlington");
        bankAccount2 a2 = new bankAccount2("Arlington");
        bankAccount2 a3 = new bankAccount2("Arlington");

        bankAccount2.displayCount();
        System.out.println(bankAccount2.count);

    }
}
class bankAccount2{
    static int count = 0;
    String branchName;
    public bankAccount2(String bN){  //constructor created
        this.branchName = bN;
       //bankAccount2.count= bankAccount2.count +1;
       bankAccount2.getCount();
    }
    public static void displayCount(){
        System.out.println(bankAccount2.count);
    }
    public static void getCount(){
        bankAccount2.count= bankAccount2.count +1;
    }

}
