public class inheritance {
    public static void main(String[] args) {

        grandFather rohini = new grandFather();
        //System.out.println(rohini.firstName);
        //System.out.println(rohini.lastName);
        //rohini.displayGFatherName();

        father shyam = new father();
        //System.out.println(shyam.fFirstName);
        //System.out.println(shyam.lastName);
        //System.out.println(shyam.firstName);
        //shyam.displayFatherName();
        //shyam.displayGFatherName();

        daughter sampada = new daughter();
        //System.out.println(sampada.daughterName);
        //System.out.println(sampada.fFirstName);
        //System.out.println(sampada.firstName);
        //System.out.println(sampada.lastName);
        //sampada.displayDaughterName();
        //sampada.displayFatherName();
        //sampada.displayGFatherName();

        //with constructor
        GrandFatherA rohinip = new GrandFatherA("Rohini", "Pant");
        //System.out.println(rohinip.firstName);
       // System.out.println(rohini.lastName);
        //rohinip.displayGFatherAname();

        fatherA shyamp = new fatherA("Rohini","Pant","Shyam");
        System.out.println(shyamp.firstName);
        System.out.println(shyamp.fFirstName);
        System.out.println(shyamp.lastName);
        shyamp.displayGFatherAname();
        shyamp.displayFatherAname();

        daughterA sampadap = new daughterA("Rohini","Pant", "Shyam", "Sampada");
        //System.out.println(sampadap.daughterFName);
        //System.out.println(sampadap.lastName);
        //System.out.println(sampadap.firstName);
        //System.out.println(sampadap.fFirstName);
        //sampadap.displayFatherAname();
        //sampadap.displayDaughterName();
       // sampadap.displayGFatherAname();

    }
}

class grandFather{
    String firstName = "Rohini";
    String lastName = "Pant";

    public void displayGFatherName (){
        System.out.println(this.firstName + this.lastName);
    }
}
class father extends grandFather {
    String fFirstName = "Shyam";

    public void displayFatherName (){
        System.out.println(this.fFirstName + this.lastName);
    }
}

class daughter extends father{
    String daughterName = "Sampada";

    public void displayDaughterName (){
        System.out.println(this.daughterName + this.lastName);
    }
}
class GrandFatherA {
    String firstName ;
    String lastName;

    public GrandFatherA (String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }
    public void displayGFatherAname (){
        System.out.println(this.firstName + this.lastName);
    }
}
class fatherA extends GrandFatherA{
    String fFirstName;

    public fatherA(String fn, String ln, String ffn) {
        super(fn, ln); //call the parent constructor
        this.fFirstName = ffn;
    }
    public void displayFatherAname(){
        System.out.println(this.fFirstName + this. lastName);
    }
}
class daughterA extends fatherA {
    String daughterFName;

    public daughterA(String fn, String ln, String ffn, String dfn) {
        super(fn, ln, ffn);
        this.daughterFName = dfn;
    }
    public void displayDaughterName(){
        System.out.println(this.daughterFName + this.lastName);
    }
}

