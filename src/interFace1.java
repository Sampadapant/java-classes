public class interFace1 {
    public static void main(String[] args) {
        Institute i = new Institute();
        i.mobileTopUp();
        i.ticketPayment();
        i.transFer();
        i.viewStatement();

    }
}
interface mobileBanking{
    public void transFer();
    public void viewStatement();
}
interface eSewa{
    public void mobileTopUp();

}
interface ePocket{
    public void ticketPayment();
}
class Institute implements mobileBanking,eSewa,ePocket{

    @Override
    public void transFer() {
        System.out.println("transfer money to institute");
    }

    @Override
    public void viewStatement() {
        System.out.println("bank statement viewed");

    }

    @Override
    public void mobileTopUp() {
        System.out.println("balance loaded through topUp in mobile");

    }

    @Override
    public void ticketPayment() {
        System.out.println("payement done to watch movies");

    }
}