import java.text.DateFormat;
import java.util.Date;

public class stringDay2 {
    public static void main(String[] args) {


        //program 1
        String city1= "pune";
        String city2 = "pune";
        String city3 = "mumbai";

        boolean result = city1.equals(city3);
        System.out.println(result);
        if (result) {
            System.out.println("city 1 and city 3 are equal");
        }else {
            System.out.println(" city 1 and  city 3 are not equal");
        }

        //compare city1 and city3 with ternary operator

       String result2 =  city1.equals(city3) ? "equal": "not equal";
        System.out.println(result2);
        //program 2
        //String example = "Best quote is "try try but do not cry"";

        String example = "Best quote is \"try try but do not cry\"";


        //program3
        String city4 = "Nagpur";
        boolean result3 = city4.startsWith("N");
        boolean result4 = city4.startsWith("Nag");
        System.out.println(result3);
        System.out.println(result4);

        String city5 = "Arlington";
        boolean result5 = city5.endsWith("on");
        boolean result6 = city5.endsWith("o");
        System.out.println(result5);
        System.out.println(result6);

        //program3
        String sen1 = "I am learning javascript";
        boolean result7 = sen1.contains("learning");
        System.out.println(result7);

        //program4 change the character
        String sen2= "I am learning javascript and javascript is great";
        String result8 = sen2.replace("j","K");
        System.out.println(result8);

        String result9 = sen2.replaceAll("javascript", "java");
        System.out.println(result9);

        String sen3 = "I am new to this place";
        String result10 = sen3.replaceAll("place", "country");
        System.out.println(result10);

        String result11 = sen2.replaceFirst("javascript", "java");
        System.out.println(result11);

        //program 5

        String city6 = "chandrapur";
        // index starts from zero
        //  0  1  2  3  4  5  6  7  8  9
        //  c  h  a  n  d  r  a  p  u  r
         char a = city6.charAt(4);
        System.out.println(a);
        System.out.println(city6.length());

        // length() -1 is always last index

        String city7 = "jaipur";
        //  0  1  2  3  4  5
        //  j  a  i  p  u  r
        int len = city7.length();
        System.out.println(len);

        for (int i=0; i < len; i++) {
            //System.out.println(i);
            System.out.println(city7.charAt(i));
        }
        //reverse the string
        String city8 = "kathmandu";
        String rev = "";
        int len1 = city8.length(); //9
        for (int i1 = len1 - 1; i1 >= 0; i1-- ) {
            rev = rev + city8.charAt(i1);
        }
        System.out.println(rev);

        Date today = new Date();
        System.out.println(today);


    }
}
