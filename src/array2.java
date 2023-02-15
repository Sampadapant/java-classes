import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        int[][] a = {

                {1, 2, 3}, //0
                {4, 5, 6, 7},  //1
                {8} //2

        };

        System.out.println(a[0][1]);
        System.out.println(a[2][0]);
        System.out.println(a[1][3]);

        //length
        for (int i = 0; i < a.length; i++) {
            //System.out.println(i); //index
            //System.out.println(a[i]); //reference
            //System.out.println(a[i].length); //number of elements of every row
            int s[] = a[i];
            for (int h = 0; h < s.length; h++) {
                System.out.println(s[h]); // we can print all elements of multi dimensional array
            }

        }

        int s1[][] = {
                {1, 11, 111, 1111},
                {2, 22,},
                {3, 33, 333, 3333, 33333},
                {4, 44, 444}

        };

        //System.out.println(s1); //reference
        System.out.println(s1[0][3]);
        System.out.println(s1[3][2]);

        for (int i = 0; i < s1.length; i++) {
            //System.out.println(i);
            //System.out.println(s1);
            // System.out.println(s1[i].length);

            int s2[] = s1[i];
            for (int j = 0; j < s2.length; j++) {
                System.out.println(s2[j]);
            }
        }

        int[][] num1 = {
                {12, 22, 32, 42},
                {13, 23, 33, 43},
                {14, 24, 34, 44},
                {15, 25, 35, 45}
        };

        for (int i = 0; i < num1.length; i++) { //rows
            //System.out.println(num1[i]); //index
            //System.out.println(num1[i].length);
            //System.out.println(Arrays.toString(num1[i]));
            int num11[] = num1[i]; // it will give total number of columns
            for (int k = 0; k < num11.length; k++) {
                System.out.println(num11[k]);
            }

        }

        int sos[] = {46, 47, 48};
        for (int i : sos) {
            System.out.println(i);
        }

        int sos1[] = {101, 102, 103, 104};
        for (int a1 : sos1) {
            System.out.println(a1);
        }

        int sos2[][] = {
                {111, 222, 333},
                {22, 33, 4},
                {25}
        };
        for (int[] a2 : sos2) {
            //System.out.println(a2);
            //System.out.println(Arrays.toString(a2));
            for (int a3 : a2) {
                System.out.println(a3);
            }

        }

        int sos3[][] = {
                {12, 22, 23, 24},
                {13, 32, 33},
                {2, 5, 3, 6, 8, 7}
        };
        for (int a3[] : sos3) {
            //System.out.println(a3);
            //System.out.println(Arrays.toString(a3));
            for (int a4 : a3) {
                System.out.println(a4);
            }
        }

        // three dimensional array

        // t = [a,b]
        // a = [a1,a2]
        // b = [b1,b2]

        // a1 = [a1a,a1b,a1c,a1d]
        // a2 = [a2a,a2b,a2c,a2d]

        // b1 = [b1a,b1b, b1c,b1d]
        // b2 = [b2a, b2b,b2c,b2d]

        int[][][] ddd = {
                {
                        {17, 27, 37, 47},
                        {18, 28, 38, 48}

                },
                {
                        {16, 26, 36, 46},
                        {19, 29, 39, 49}
                }
        };
        System.out.println(ddd[0][0][1]);
        System.out.println(ddd[0][0][3]);
        System.out.println(ddd[1][1][1]);
        System.out.println(ddd[1][1][3]);

        //for loop


        for (int i = 0; i < ddd.length; i++) {
            //System.out.println(i); //index
            //System.out.println(ddd[i].length);
            //System.out.println(Arrays.toString(ddd[i]));
        }
        //for each loop

        for (int a4[][] : ddd) {
            //System.out.println(a4);
            //System.out.println(Arrays.toString(a4));

            for (int a5[] : a4) {
                //System.out.println(a5);
                //System.out.println(Arrays.toString(a5));

                for (int a6 : a5) {
                    System.out.println(a6);
                }
            }
        }

        int[][][] ddd1 = {
                {
                        {121, 122, 123, 124, 125},
                        {21, 32, 43, 54, 65},
                        {98, 223, 455}
                },
                {
                        {901, 234, 657, 47, 78},
                        {32, 457, 786, 458, 651, 789},
                        {60, 47, 688, 429, 88}
                }
        };
        //for loop
        for (int i = 0; i < ddd1.length; i++) {
            //System.out.println(ddd1[i]);ref
            System.out.println(i); //index
            System.out.println(ddd1[i].length);
            //System.out.println(Arrays.toString(ddd1[i]));ref
        }
        //for each loop

        for (int a7[][] : ddd1) {
            //System.out.println(a7); //ref
            //System.out.println(Arrays.toString(a7)); //ref
            for (int a8[] : a7) {
                //System.out.println(a8); //ref
                System.out.println(Arrays.toString(a8));

                for (int a9 : a8) {
                    System.out.println(a9);
                }
            }
        }

        int[][][] ddd2 = {
                {
                        {321, 322, 323, 724, 325},
                        {51, 72, 13, 24, 66},
                        {99, 22, 45}
                },
                {
                        {90, 23, 677, 87, 100},
                        {10, 457, 432, 600},
                        {259, 671, 6}
                }
        };

        //for loop

        for (int i = 0; i < ddd2.length; i++) {
            System.out.println(ddd2[i].length);
            //System.out.println(Arrays.toString(ddd2[i])); ref
            //System.out.println(i);
        }

        //for each loop

        for (int a10[][] : ddd2) {
            //System.out.println(a10); // ref
            //System.out.println(Arrays.toString(a10)); //ref

            for (int a11[] : a10) {
                //System.out.println(a11); //ref
                //System.out.println(Arrays.toString(a11));

                for (int a12 : a11) {
                    System.out.println(a12);
                }
            }
        }


        String sen22 = "I am learning java";

        for (int i = 0; i < sen22.length(); i++) {
            if (sen22.charAt(i) == 'a') {
                System.out.println(i);
            }
        }

        int[][][] ab = {
                {
                        {111, 222, 333},
                        {444, 555, 666},
                        {777, 888, 999},
                },
                {
                        {11, 22, 33},
                        {44, 55, 66},
                        {77, 88, 99},
                },
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9},
                }
        };
        //for each
        for (int[][] sp : ab) {
            for (int[] spa : sp) {
                for (int spar : spa) {
                    System.out.println(spar);
                }
            }
        }
        //for loop
        for (int i = 0; i < ab.length; i++) {
            int[][] abc = ab[i];
            for (int j = 0; j < abc.length; j++) {
                int[] abc1 = abc[j];
                for (int k = 0; k < abc1.length; k++) {
                System.out.println(abc1[k]);


            }
        }
    }





    }
}

