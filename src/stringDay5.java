import java.util.Arrays;

public class stringDay5 {
    public static void main(String[] args) {
        // p u r p l e
        // 0 1 2 3 4 5

        String color = "purple";
        int a = color.indexOf('p');
        System.out.println(a);

        //String color1 = "purple";
        //int a1 = color.indexOf('p', 1);
        //System.out.println(a1);

        int count = 0 ;
        for (int i1 =0; i1 < color.length(); i1++) {


            //for (int i = 0; i < color.length(); i++) {
                if (color.charAt(i1) == 'p') {
                    System.out.println(i1);
                    count = count + 1;
                }
            }

            System.out.println(count);

        //Array

        int nums [] = new int [4];
        nums[0] = 50;
        nums[1]= 60;
        nums[2] = 70;
        nums[3] = 80;

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);


        int numsp [] = new int [4];
        numsp[0] = 20;
        numsp[1]= 30;
        numsp[2] = 40;
        numsp[3] = 50;

        System.out.println(numsp.length); //how many are there?

        for (int i = 0; i< numsp.length; i++) {
            //System.out.println(i);
            System.out.println(numsp[i]);
        }

        //program4
        String cities [] = new String [3];
        cities[0] = "kathmandu";
        cities[1] = "paris";
        cities [2] = "arlington";
        for (int i = 0; i <cities.length; i++) {
            //System.out.println(i);
            System.out.println(cities[i]);
        }

        String color1 [] = new String [5];
        color1[0] = "pink";
        color1[1] = "red";
        color1[2] = "blue";
        color1[3] = "black";
        color1[4] = "brown";

        for(int i= 0; i < color1.length; i++) {
            //System.out.println(i);
            System.out.println(color1[i]);
        }

        //program5

        int number12 []= {41,51,61,71,81};

        for(int i= 0; i<number12.length; i++) {
            //System.out.println(i);
            System.out.println(number12[i]);

        }
        String capital [] = {"kathmandu", "newDelhi", "thimpu", "bangkok","beijing"};

        for(int i=0; i < capital.length; i++){
            //System.out.println(i);
            System.out.println(capital[i]);
        }

        String language [] = {"java","python","c", "c++", "selenium"};

        for (int i= 0; i< language.length; i++){
            //System.out.println(i);
            System.out.println(language[i]); //if you want every string
        }

        char bing [] = {'s','a', 'm', 'p', 'a', 'd', 'a'};
        for (int i= 0; i< bing.length; i++ ) {
            //System.out.println(i);
            System.out.println(bing[i]); //if you want every characters
        }

        //charArray it is method of string but it gives you the character array

        String myName = "sampada";
        char[] ss =  myName.toCharArray();
        for (int i= 0; i <ss.length; i++) {
            //System.out.println(i);
            System.out.println(ss[i]);
        }

        //Returing to array of string []

        String sen = "I am practicing java";
        String pp [] = sen.split(" ");

        for (int i = 0; i< pp.length; i++){
            //System.out.println(i);
            System.out.println(pp[i]);
        }

        String sen1 = "the weather today is very cold";
        String q [] = sen1.split(" ");
        for (int i= 0; i < q.length; i++) {
            //System.out.println(i);
            System.out.println(q[i]);
        }

        String sen2 = "the weather today is very hot";
        String r [] = sen2.split("a");
        for (int i= 0; i < r.length; i++) {
            //System.out.println(i);
            System.out.println(r[i]);
        }

            String sen3 = "i am going to attend party today";
            String s [] = sen3.split("a");
            for (int i= 0; i < s.length; i++) {
                //System.out.println(i);
                System.out.println(s[i]);

        }

        String sen4 = "try/try until you die";
        String t [] = sen4.split("/");
        for (int i= 0; i < t.length; i++) {
            //System.out.println(i);
            System.out.println(t[i]);
        }

        String sen5= "universe- world- asia- nepal- kathmandu- dhapasi";
        String u []= sen5.split("-");
        for (int i= 0; i < u.length; i++) {
            //System.out.println(i);
            System.out.println(u[i]);
        }

        String str1 = "23/78/45/78/2099";
        String a1 []= str1.split("/",3);
        for(int i= 0; i < a1.length; i++) {
           // System.out.println(i);
            System.out.println(a1[i]);
        }

        String str2 = "23/78/45/78/2099";
        String a2 []= str2.split("/");
        for(int i= 0; i < a2.length; i++) {
            // System.out.println(i);
            System.out.println(a2[i]);
        }

        String str3 = "23/78/45/78/2099";
        String a3 []= str3.split("/");
            // System.out.println(i);
        System.out.println(Arrays.toString(a3));
        System.out.println(a3[1]);










































        }




    }

