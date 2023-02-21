

public class day11 {

    public static void main(String[] args) {

        Banks Nabil = new Banks(1000,123,"sampada","current");
        Banks laxmi = new Banks(10000,123,"slesha","savings");
        Banks mahalaxmi = new Banks(1000,123,"slesh","call");

        System.out.println(Nabil.accName);
        System.out.println(Nabil.accNo);
        System.out.println(Nabil.bal);
        System.out.println(Nabil.type);
        System.out.println(Nabil.country);

        int updatedBal = Nabil.deposit(1000);
        System.out.println(updatedBal);
        // default constructor also
        Nabil.withDrawl(3000);

        int updatedBal2 = Nabil.withDrawl(500);
        System.out.println(updatedBal2);
        Nabil.country = "Nepal";

        laxmi.deposit(50000);

        System.out.println(Nabil.accType("current"));
        System.out.println(mahalaxmi.accType("call"));
        System.out.println(laxmi.accType("savings"));

        System.out.println(laxmi.showLastFiveTransactions());
    }
}
class Banks {

    int bal;
    int accNo;
    String accName;
    String type;
    String country;
    int transactions[];

    public Banks(int bal, int accNo, String accName, String type) {
        this.bal = bal;
        this.accNo = accNo;
        this.accName = accName;
        this.type = type;
        this.country = "Nepal";
        this.transactions = new int[5];
    }

    public int deposit(int amount) {
        this.bal = this.bal + amount;
        System.out.println("Deposit successful");
        return this.bal;
    }

    public int withDrawl(int amount) {
        if (this.bal > amount) {
            this.bal = this.bal - amount;
            return this.bal;
        } else {
            System.out.println("In sufficient balance");
            return this.bal;
        }
    }

    public String accType(String type) {
        if (type == "Savings" || type == "savings") {
            return "interest is 5%";
        } else if (type == "Current" || type == "current") {
            return "interest is 10%";
        } else {
            return "invalid accType entered";
        }

    }

    public int showLastFiveTransactions() {
        int amount = 0;
        amount = amount + this.bal;
        return amount;

    }

    // Assignment

    // If the account type is saving  --- interest should  5%
    // If the account type is current --- interest should  10%

    // show the last five transactions
    // {12,33,-44,55,66}


}


