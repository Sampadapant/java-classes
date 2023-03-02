public class inheritancePractice {
    public static void main(String[] args) {
        GrandMother bk = new GrandMother("Balkumari ","Pant ",83);
        System.out.println(bk.firstname);
        System.out.println(bk.lastname);
        System.out.println(bk.age);
        bk.displayGName();

        Mother sh = new Mother("Balkumari ","Pant",83, "Shakuntala");
        System.out.println(sh.mfName);
        System.out.println(sh.firstname);
        System.out.println(sh.lastname);
        System.out.println(sh.age);
        sh.displayMname();
        sh.displayGName();

        Daughter sm= new Daughter("Balkumari","Pant",83,"Shakuntala","Sampada");
        System.out.println(sm.daughterFName);
        System.out.println(sm.firstname);
        System.out.println(sm.lastname);
        System.out.println(sm.age);
        System.out.println(sm.mfName);
        sm.displayDName();
        sm.displayGName();
        sm.displayMname();


    }
}
class GrandMother {
    String firstname;
    String lastname;
    int age;
    public GrandMother(String fn,String ln, int ag){
        this. firstname = fn;
        this.lastname = ln;
        this.age = ag;
    }
    public void displayGName (){
        System.out.println(this.firstname + this.lastname +this.age);
    }
}
class Mother extends GrandMother{
String mfName;

    public Mother(String fn, String ln, int ag, String mfN) {
        super(fn, ln, ag);
        this.mfName = mfN;
    }
    public void displayMname(){
        System.out.println(this.mfName + this.lastname);
    }
}

class Daughter extends Mother {
    String daughterFName;

    public Daughter(String fn, String ln, int ag, String mfN, String dfN) {
        super(fn, ln, ag, mfN);
        this.daughterFName = dfN;
    }
    public void displayDName(){
        System.out.println(this.daughterFName + this.lastname);
    }
}


