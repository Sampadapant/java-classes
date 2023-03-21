package ENUM;
enum fiveOrgans{
    EYE,EAR,NOSE,MOUTH,SKIN;
}

class fiveOrganTest{
    public fiveOrganTest(){

    }
    public void getFiveOrgan(fiveOrgans f){
        if (f == fiveOrgans.EAR)
        System.out.println("it is to hear");
        else if (f== fiveOrgans.NOSE)
            System.out.println("it is to smell");
        else if (f== fiveOrgans.MOUTH)
            System.out.println("it is to taste");
        else if (f==fiveOrgans.SKIN)
            System.out.println("it is to feel");
        else if (f==fiveOrgans.EYE)
            System.out.println("it is to see");
        else
            System.out.println("unsure");
    }
}

public class enumAnj {
    public static void main(String[] args) {
        fiveOrganTest fo = new fiveOrganTest();
        fo.getFiveOrgan(fiveOrgans.EYE);
        fo.getFiveOrgan(fiveOrgans.EAR);
        fo.getFiveOrgan(fiveOrgans.MOUTH);
        fo.getFiveOrgan(fiveOrgans.NOSE);
        fo.getFiveOrgan(fiveOrgans.SKIN);

       fiveOrgans f1 [] = fiveOrgans.values();



    }
}
