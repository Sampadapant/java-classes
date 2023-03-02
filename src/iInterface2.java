public class iInterface2 {
    public static void main(String[] args) {
        GandakiH h = new GandakiH("Pokhara", "western");
        System.out.println(h.location);
        System.out.println(h.region);
        h.displayLocation();

        GandakiPKH pk = new GandakiPKH("Damauli","western");
        System.out.println(pk.location);
        System.out.println(pk.region);
        pk.depoRate();
        pk.discount();
        pk.loanRate();
        pk.loan();
        pk.save();
        pk.displayLocation();

    }
}
interface NRBankRules1 {
    public void save();
    public void loan ();
    public void discount ();


}

interface RBBRules1 {
    public void  loanRate();
    public void depoRate();
}
class GandakiH {
     String location;
     String region;
     public GandakiH(String lc, String rg){
         this.location = lc;
         this.region = rg;
     }
     public void displayLocation() {
         System.out.println(this.location);
     }

}
class GandakiPKH extends GandakiH implements NRBankRules1,RBBRules1  {

    public GandakiPKH(String lc, String rg) {
        super(lc, rg);
    }

    @Override
    public void save() {
        System.out.println("GandakiPKH save");

    }

    @Override
    public void loan() {
        System.out.println(" GandakiPKH loan");

    }

    @Override
    public void discount() {
        System.out.println("GandakiPKH discount");

    }

    @Override
    public void loanRate() {
        System.out.println("GandakiPKH loanRate");

    }

    @Override
    public void depoRate() {
        System.out.println("GandakiPKH depoRate");

    }
}