import java.util.Arrays;

public class ArrayDay3 {
    public static void main(String[] args) {
        int []a = new int [3]; //it means a array has 3 elements
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        //[1,2,3] string representation
        for (int i =0; i<a.length; i++){
            //System.out.println(i); //to represent in index file
            //System.out.println(a[i]); //elements in the array
            System.out.println(Arrays.toString(a));
        }
        //for each loop
        for (int a11 : a){
            System.out.println(a11); //elements in the array
        }

        int []a1 = {91,233,354}; //it is another way to represent array
        for (int i =0; i <a1.length; i++){
            //System.out.println(i);
           // System.out.println(a1[i]);
            System.out.println(Arrays.toString(a1));
        }
        for (int a11: a1){
            //System.out.println(a11);
        }

        //multi dimensional array
        int [][] b = new int [3][2];
        b[0][0] = 1;
        b[0][1] = 2;

        b[1][0] = 11;
        b[1][1] = 22;

        b[2][0] = 111;
        b[2][1] = 222;
        for (int i =0; i <b.length; i++){
            //System.out.println(i);
            //System.out.println(b[i]);
            //System.out.println(Arrays.toString(b[i]));

            int bb []= b[i];
            for (int j =0; j<bb.length;j++){
                //System.out.println(j); // index of every array
                //System.out.println(bb[j]); // every element of array
            }

        }

        // for each loop
        for (int bb1[]: b){
            for(int b1b: bb1){
                System.out.println(b1b); //print every element of array

            }
        }

        int c [][]= {
                {10,20,30,40,50},
                {12,23,34,45,56},
                {9,98,87,76,65},
                {54,43,32,21,11}
        };
        for (int i =0; i<c.length; i++){
            //System.out.println(i);
            //System.out.println(c[i]);
            //System.out.println(Arrays.toString(c[i]));

            int cc [] = c[i];
            for (int j = 0; j< cc.length; j++){
                //System.out.println(j);
                //System.out.println(cc[j]); //print every element of array
            }
        }
        //for each loop

        for (int cc1 [] : c){
            for (int c1c : cc1){
                System.out.println(c1c);// print every element of array
            }
        }

        //three dimensional array

        int [][][] s = new int [4][3][4];
        s[0][0][0]= 1;
        s[0][0][1]= 2;
        s[0][0][2]= 3;
        s[0][0][3]= 4;

        s[0][1][0]= 5;
        s[0][1][1]= 6;
        s[0][1][2]= 7;
        s[0][1][3]= 8;

        s[0][2][0]= 9;
        s[0][2][1]= 10;
        s[0][2][2]= 11;
        s[0][2][3]= 12;

        s[1][0][0]= 13;
        s[1][0][1]= 14;
        s[1][0][2]= 15;
        s[1][0][3]= 16;

        s[1][1][0]= 17;
        s[1][1][1]= 18;
        s[1][1][2]= 19;
        s[1][1][3]= 20;

        s[1][2][0]= 21;
        s[1][2][1]= 22;
        s[1][2][2]= 23;
        s[1][2][3]= 24;

        s[2][0][0]= 25;
        s[2][0][1]= 26;
        s[2][0][2]= 27;
        s[2][0][3]= 28;

        s[2][1][0]= 29;
        s[2][1][1]= 30;
        s[2][1][2]= 31;
        s[2][1][3]= 32;

        s[2][2][0]= 33;
        s[2][2][1]= 34;
        s[2][2][2]= 35;
        s[2][2][3]= 36;

        s[3][0][0]= 37;
        s[3][0][1]= 38;
        s[3][0][2]= 39;
        s[3][0][3]= 40;

        s[3][1][0]= 41;
        s[3][1][1]= 42;
        s[3][1][2]= 43;
        s[3][1][3]= 44;

        s[3][2][0]= 45;
        s[3][2][1]= 46;
        s[3][2][2]= 47;
        s[3][2][3]= 48;

        //for loop
        for (int i =0; i< s.length; i++){
            //System.out.println(i);
            //System.out.println(s[i]);
            //System.out.println(Arrays.toString(s));

            int ss [][] = s[i];
            for (int l = 0; l<ss.length; l++){
                //System.out.println(l);
                //System.out.println(ss[l]);
                //System.out.println(Arrays.toString(ss));

                int sss [] = ss[l];
                for (int m = 0; m< sss.length; m++){
                    ///System.out.println(sss[m]);
                }
            }

        }

        //for each loop
        for (int [][] s1 : s){
            for (int [] s11 : s1)
                for (int sss : s11){
                    System.out.println(sss);
                }
        }

        int []a11 = new int [3]; //it means a11 array has 3 elements
        //int [] a12 = { 10,20,30};
        a11[0] = 1;
        a11[1] = 2;
        a11[2] = 3;
        //[1,2,3] string representation
        for (int i =0; i<a11.length; i++){
            //System.out.println(i); //to represent in index file
            //System.out.println(a[i]); //elements in the array
            //System.out.println(Arrays.toString(a11[i]));
        }
        System.out.println(Arrays.toString(a11));

        int [] x = new int[3];
        System.out.println(x);
        System.out.println(x[2]);




    }
}

