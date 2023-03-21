public class test113 {
    public static void main(String[] args) {
        bankAccount3 aa = new bankAccount3("Arlington");
        bankAccount3 a1 = new bankAccount3("Arlington");
        bankAccount3 a2 = new bankAccount3("Arlington");
        bankAccount3 a3 = new bankAccount3("Arlington");

        bankAccount2.displayCount();
        System.out.println(bankAccount3.count);

    }
}
class bankAccount3{
    static int count = 0;
    String branchName;
    public bankAccount3(String bN){
        this.branchName = bN;
        bankAccount3.count= bankAccount3.count +1;

    }
    public static void displayCount(){
        System.out.println(bankAccount3.count);
    }

    }
