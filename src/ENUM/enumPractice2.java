package ENUM;

enum planets{
    earth, mercury, venus, jupiter, saturn
}


public class enumPractice2 {
    public static void main(String[] args) {

        SolarSystem SS = new SolarSystem();
        planets p = planets.venus;
        SS.getPlanet(p);
        planets p1 = planets.mercury;
        SS.getPlanet(p1);
        planets p2 = planets.saturn;
        SS.getPlanet(p2);




       //ENUM.planets p = ENUM.planets.venus;
       //if (p == ENUM.planets.mercury)
           //System.out.println("all good");
       //else if (p==ENUM.planets.saturn)
           //System.out.println("better");
       //else if (p==ENUM.planets.earth)
           //System.out.println("not sure");
       //else if (p==ENUM.planets.venus)
          // System.out.println("not good");
       //else if (p==ENUM.planets.jupiter)
           //System.out.println("best than better");
       //else
          // System.out.println("perfect match");
    }
}

class SolarSystem{

    public SolarSystem(){

    }
    public void getPlanet(planets p){

        if (p == planets.mercury)
            System.out.println("all good");
        else if (p==planets.saturn)
            System.out.println("better");
        else if (p==planets.earth)
            System.out.println("not sure");
        else if (p==planets.venus)
            System.out.println("not good");
        else if (p==planets.jupiter)
            System.out.println("best than better");
        else
            System.out.println("perfect match");
    }
}
