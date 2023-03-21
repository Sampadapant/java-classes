import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
      int a1 []   = {2,4,6,8,10};
      for (int i =0; i < a1.length; i ++){
         // System.out.println(a1);
          System.out.println(i);
          System.out.println(a1[i]);

          for (int a11 : a1){
              System.out.println(a11);
          }
      }

      int b2 [] = new int [4];
      b2[0] = 5;
      b2[1] = 10;
      b2[2] = 15;
      b2[3] = 20;

      for (int b22: b2){
          System.out.println(b22);
        }

      int c3 [][] = new int [3][2];
      c3[0][0]= 1;
      c3[0][1] = 2;

      c3[1][0] = 11;
      c3 [1][1] = 22;

      c3 [2][0] = 111;
      c3 [2][1] = 222;

      for (int i = 0; i < c3.length; i ++){
          //System.out.println(i); //index
          // System.out.println(c3[i]); //reference
          System.out.println(Arrays.toString(c3[i]));

         for (int cc [] : c3){
             for (int ccc : cc){
                 System.out.println(ccc);
             }
         }
      }









    }
    }

