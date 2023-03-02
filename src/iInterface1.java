public class iInterface1 {
    public static void main(String[] args) {
        Sunrise s = new Sunrise();
        s.autoLoan();
        s.homeLoan();
        s.discount();
        s.loan();
        s.save();

    }
}
interface NRBankRules{
    public void loan();
    public void save();
    public void discount();

}
interface RBB{
    public void homeLoan();
    public void autoLoan();

}
class Sunrise implements NRBankRules,RBB{
// one class can implement more than one interface //implementing method
    @Override
    public void loan() {
        System.out.println("Sunrise loan");
    }

    @Override
    public void save() {
        System.out.println("Sunrise save");

    }

    @Override
    public void discount() {
        System.out.println("Sunrise discount");

    }

    @Override
    public void homeLoan() {
        System.out.println("Sunrise homeLoan");

    }

    @Override
    public void autoLoan() {
        System.out.println("Sunrise autoLoan");

    }
}




