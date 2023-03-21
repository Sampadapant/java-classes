public class Array {
    public static void main(String[] args) {

        String [] names = new String [4];
        String names1 [] = new String [4];
        // String name [] = {"sampada", "sharmila","shabnam, "anjila"};

        names1 [0] = "Lok";
        names1 [1] = "Priya";
        names1 [2] = "Nil";
        names1 [3] = "Nakul";

        //Array stores elements by index
        System.out.println(names1); //ref
        System.out.println(names1[0]);
        System.out.println(names1[1]);
        System.out.println(names1[2]);
        System.out.println(names1[3]);

        names [0]= "Izak";
        names [1]= "Naemo";
        names [2]= "Rose";
        names [3] = "Slesha";
        System.out.println(names);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);



        String [] elements = {"sodium", "potassium","chlorine","aluminium", "phosphorus"};
        System.out.println(elements[1]);
        System.out.println(elements[0]);
        System.out.println(elements[2]);

        //for printing every element of array

        for (int i =0; i<elements.length; i++) {
            //System.out.println(i); //printing index
            System.out.println(elements[i]); //for printing every element of array
        }

        String [] cosmetics = {"shampoo", "body wash", "Interface.lipstick","moisturizer","powder"};
        for (int i = 0; i< cosmetics.length; i++) {
           // System.out.println(i);
            System.out.println(cosmetics[i]);
        }
        //sum

        int [] numbers = {32,33,34,35,36};
        int [] num2 = new int [5];
        num2[0] = 42;
        num2[1] = 43;
        num2[2] = 44;
        num2[3] = 45;
        num2[4] = 46;

        int sum = 0;
        for (int i=0; i< num2.length; i++) {
               sum = sum + num2[i];
           //         0  + 42 ======>  42
           //         42 + 43 ======>  85
           //         85 + 44 ======>  129
           //         129 +45 ======>  174
           //         174 + 46 =====>  220



        }
        System.out.println(sum);


        int [] num1 = {700,701,702,703};
        int sum1 = 0;
        for(int i =0; i< num1.length; i++){
            //System.out.println(num1); reference
            //System.out.println(i); index
            // System.out.println(num1[i]); //for printing every element of array

            sum1= sum1 + num1[i];

        }
        System.out.println(sum1);

        String sen = "It has sunny weather today";
        String brk []= sen.split(" ");  // ["It", "has", "sunny", "weather", "today"]
        for (int i=0; i< brk.length; i++){
            //System.out.println(brk);reference
            System.out.println(brk[i]);
        }
        String sen1 = "It has sunny weather today";
        String brk1 []= sen1.split("t");
        for (int i=0; i< brk1.length; i++){
            //System.out.println(brk1);reference
            System.out.println(brk1[i]);
        }

        //array of characters

        String countryName = "NewZealand";
        char [] cn = countryName.toCharArray();
        //System.out.println(countryName);
        //System.out.println(cn);

        for (int i = 0; i< cn.length; i++) {
            System.out.println(cn[i]);
        }

        String cityN = "Dharan";
        char [] cc = cityN.toCharArray();
        for (int i =0; i<cc.length; i++){
            System.out.println(cc[i]);
        }
        //for each loop

        int score [] = {80,65,78,92,58};
        //System.out.println("for-each loop");

        for (int i:score) {
            System.out.println(i);
        }



        String [] namesA =  {"shree","yash","veer","krish", "kush"};
        for (String aa :namesA) {
            System.out.println(aa);
        }

        char [] abc = {'a','l','p','h','a','b','e','t'};
        String rev = "";

        for (char abc1:abc){
            rev = rev + abc1;
            //rev =  abc1 +rev;
            //System.out.println(abc1);
        }
        System.out.println(rev);


        char [] thing = {'t','a','b','l','e'};
        String rev1 ="";
        for (char t : thing) {
            rev1 = rev1 + t;

        }
        System.out.println(rev1);


        // sum and average

        int numbersB [] = {1,2,3,4,5,6};
        int sum2 = 0;
        float avg = 0;
        for (int c : numbersB) {
            sum2 = sum2 + c;
        }
        System.out.println(sum2);
        avg = sum2/numbersB.length;
        System.out.println(avg);

        int [][] matrix = {{1,3,5,7,9},{2,4,6,8,10}};
        //  0 1 2 3 4
        // [1,3,5,7,9]----- 0
        // [2,4,6,8,10] ----1

        System.out.println(matrix[0][3]);

        String [][] veg = {{"cauli","broccoli","asparagus","Interface.brinjal","carrot"},{"bean","cucumber","cabbage"}};
        //  0 1 2 3 4
        // [1,3,5,7,9]----- 0
        // [2,4,6,8,10] ----1

        System.out.println(veg[1][2]);





















    }
}
