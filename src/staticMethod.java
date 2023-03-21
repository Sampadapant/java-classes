public class staticMethod {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Module.class);
        System.out.println(Math.abs(-455));
        //HERE MATH is class and we can create object.
        //accessing property and method without creating class through static keyword

        bankAccount bb = new bankAccount("savings",150000,"Arlington");
        System.out.println(bb.type);
        System.out.println(bb.balance);
        bb.displayType();

        System.out.println(bankAccount.branch);
        bankAccount.displayBranch();

        bankAccount1 ba = new bankAccount1();
        System.out.println(ba.balance);
        System.out.println(ba.type);
        ba.displayBalance();
        System.out.println(bankAccount1.branchname);
        bankAccount1.displayBranchName();

    }
}
class bankAccount{
    String type;
    int balance;
    static String branch;
    public bankAccount(String type, int balance, String branch){
        this.type = type;
        this.balance = balance;
    }
    public void displayType(){ //normal method
        System.out.println(this.type);
    }
    public static void displayBranch(){ //static method
        System.out.println("bankAccount.branch");
    }
}
class bankAccount1{
    String type = "loan";
    int balance = 180000;
    static String branchname  = "Hurst";

    public void displayBalance(){

        System.out.println("balance called");
    }
    public static void displayBranchName()
    {
        System.out.println("bankAccount1.branchname");
    }


}
