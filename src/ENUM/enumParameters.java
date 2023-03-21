package ENUM;
 enum coupleGoals{
     SAMPADA("SANJAY"),
     ANJILA("NABARAJ"),
     BHAWANA("SANDESH");
     private String pair;
     private coupleGoals(String pa){
         this.pair = pa;
     }
     public String getCoupleGoals(){
         return this.pair;
     }
 }
public class enumParameters {
    public static void main(String[] args) {

       coupleGoals [] cg = coupleGoals.values();
       for (coupleGoals cg1: cg){
           //System.out.println(cg1);
          // System.out.println(cg1.ordinal());
           System.out.println(cg1.getCoupleGoals());
       }

       coupleGoals cg2 = coupleGoals.SAMPADA;
       //cg2.getCoupleGoals();
       coupleGoals cg3 = coupleGoals.BHAWANA;
       //cg3.getCoupleGoals();
       coupleGoals cg4 = coupleGoals.ANJILA;
       //cg4.getCoupleGoals();
    }
}
