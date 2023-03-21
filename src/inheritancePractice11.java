public class inheritancePractice11 {
    public static void main(String[] args) {
        mother m = new mother();
        System.out.println(m.firstName);
        System.out.println(m.lastName);
        m.displayMotherName();

        daughter1 d1 = new daughter1();
        System.out.println(d1.d1FirstName);
        System.out.println(d1.firstName);
        System.out.println(d1.lastName);
        d1.displayDaughetr1Name();
        d1.displayMotherName();

        daughter2 d2 = new daughter2();
        System.out.println(d2.d2FirstName);
        System.out.println(d2.firstName);
        System.out.println(d2.lastName);
        d2.displayDaughter2Name();
        d2.displayMotherName();
    }
}

class mother{
    String firstName = "shakuntala";
    String lastName = "Pant";

    public void displayMotherName(){
        System.out.println(this.firstName + this.lastName);
    }
}

class daughter1 extends mother{
    String d1FirstName = "Sampada";
    public void displayDaughetr1Name(){
        System.out.println(this.d1FirstName + this.lastName);
    }
}

class daughter2 extends mother{
    String d2FirstName = "Binita";
    public void displayDaughter2Name(){
        System.out.println(this.d2FirstName + this.lastName);
    }
}