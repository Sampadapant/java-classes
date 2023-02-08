public class stringDay4 {
    public static void main(String[] args) {
        //  012345678910
        //  java is fun
        String str2 = "java is fun";
        String q1 = str2.substring(0,4);  //end value is not included
        System.out.println(q1);

        String str1 = "I am taking java classes";
        String q = str1.substring(0, 12);
        System.out.println(q);

        //  01234567891011121314151617181920212223242526
        //  congratulations, I am happy
        String str3 = "Congratulations, I am happy";
        String q2 = str3.substring(17, 27); //to include the end value we have to take one more number
        System.out.println(q2);

        String str4 = "language";
        String q3 = str4.substring(4);
        System.out.println(q3);

        String str5 = "I love Nepali language";
        String q4 = str5.substring(7);
        System.out.println(q4);


        String str6 = "language";
        String q5 = str6.substring(1,7);
        System.out.println(q5);

        //join

        String str7 = "Hello,";
        String str8 = "my name is";
        String str9 = "Sampada Pant.";
        String q6= String.join(" ", str7, str8, str9);
        System.out.println(q6);


        String str10 = "sampada.0721";
        String str11 = "gmail.com";
        String q7 = String.join("@", str10,str11);
        System.out.println(q7);

        String str12 = "I have ";
        String str13 = "4500.";
        String q8 = String.join("$", str12,str13);
        System.out.println(q8);

        String city = "Chainpur";
        // 01234567
        // Chainpur

        int i = city.indexOf("p");
        System.out.println(i);

        String name = "Sampada";
        int i1 = name.indexOf("a"); //just give you first occurance
        System.out.println(i1);

        int i2 = name.indexOf("a", 2);
        System.out.println(i2);

        String sen = "I am Sampada Pant from Nepal";

        for (int i3 = 1 ; i3 < sen.length(); i3++ ){
            if (sen.charAt(i3) == 'a') {
                System.out.println(i3);
            }
        }

        String sen1 = " I am practicing Java ";
        String sen2 = sen1.trim();
        System.out.println(sen2.length()); //20
        System.out.println(sen1.length());  //22

        //if we want to remove the spaces in between

        String sen3 = sen2.replace(" ", "");
        System.out.println(sen3);

        String sen4 = sen1.replace(" ", "");
        System.out.println(sen4);

        String sen5 = "I am learning Java"; // [ "I" , "am", "learning", "java"]
        String [] sen6 = sen5.split(" ");
        System.out.println(sen6);

        String firstName1 = "I live in Arlington, Texas";
        String firstName2 = "";
        boolean q9 = firstName1.isEmpty();
        System.out.println(q9);

        boolean q10 = firstName2.isEmpty();
        System.out.println(q10);















    }
}
