package ENUM;

public class enumWithParameters {
    public static void main(String[] args) {


        Festivals [] fun = Festivals.values();
        for(Festivals fes : fun){
            System.out.println(fes.getCelebration());
        }
        Festivals f = Festivals.DASHAIN;
        System.out.println(f.getCelebration());

    }
}
enum Festivals{
    DASHAIN("TIKA"), //custom values
    DEEPAWALI("LIGHTS"),
    HOLI("COLORS");

    private String celebration; //setting variables to access tika, lights and color

    private Festivals(String cel){
        this.celebration = cel;
    }
    public String getCelebration(){
        return this.celebration;
    }
}