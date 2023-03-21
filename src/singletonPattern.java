public class singletonPattern {
    public static void main(String[] args) {
        girl.talk();
        girl.talk();
        girl.talk();
    }
}
class girl{
    static girl gi; //created one reference
    private girl(){

    }
    public  static girl talk(){
        if (gi==null){ // not having object so this is null //this will be true and give the object for girl
            gi = new girl ();
            System.out.println("Sampada");
        }
        return gi;
    }
}

// next time also, it will be still nul and gives the same value as sampada