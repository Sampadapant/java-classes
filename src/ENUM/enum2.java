package ENUM;

enum makeupProducts1{
    CONCEALER, BRONZER, CORRECTOR, PRIMER, SETTINGSPRAY;
}

public class enum2 {
    public static void main(String[] args) {
        testMakeup tm = new testMakeup(makeupProducts1.BRONZER);
        tm.getMakeupType();

        newMakeup nm = new newMakeup(makeupProducts1.BRONZER);
        nm.getBeautiful(makeupProducts1.BRONZER);

        newMakeup nm1 = new newMakeup(makeupProducts1.CONCEALER);
        nm1.getBeautiful(makeupProducts1.CORRECTOR);





    }
}
class testMakeup{
    makeupProducts1 mp; //variable has been defined

    public testMakeup(makeupProducts1 m){
        this.mp = m;

    }
    //public void getMakeupType(){
        //switch(mp){
            //case CONCEALER :
               // System.out.println("i already have two");
               // break;
            //case BRONZER:
                //System.out.println("it should be of MAC");
                //break;
            //case CORRECTOR:
              //  System.out.println("i need one");
               // break;
           // case PRIMER:
           //     System.out.println("it should be of MAC");
            //    break;
          //  case SETTINGSPRAY:
             //   System.out.println("please buy from LA Girl");

       // }
   //}



    public String getMakeupType(){
        switch(mp){
            case CONCEALER :
                System.out.println("i already have two");
                return "i already have two";
            case BRONZER:
                System.out.println("it should be of MAC");
               return  "it should be of MAC";
            case CORRECTOR:
                System.out.println("i need one");
                return  "i need one";
            case PRIMER:
                System.out.println("it should be of maybelline");
                return  "it should be of maybelline";
            case SETTINGSPRAY:
                System.out.println("please buy from LA Girl");
                return  "please buy from LA Girl";

        }
        return "not my type";
    }
}

class newMakeup{
    makeupProducts1 mp1;
    public newMakeup(makeupProducts1 mp1){
        this.mp1 =mp1;
    }
    public void getBeautiful(makeupProducts1 m){
        if(m ==makeupProducts1.BRONZER){
            System.out.println("sampada");
        }
        else if (m==makeupProducts1.CORRECTOR){
            System.out.println("anjila");
        }
        else if (m==makeupProducts1.SETTINGSPRAY){
            System.out.println("bhagwati");
        }
        else if (m==makeupProducts1.PRIMER){
            System.out.println("sanjay");
        }
        else if(m==makeupProducts1.CONCEALER){
            System.out.println("vicks");
        } else {
            System.out.println("none");

        }

    }
}
