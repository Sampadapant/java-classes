public class stringDay3 {
    public static void main(String[] args) {
        //program 1
        String city = "bhairahawa";
        String city2 = new String("nagpur");
        System.out.println(city);
        System.out.println(city2);

        for (int i = 0; i < city.length(); i++) {
            //System.out.println(i);
            System.out.println(city.charAt(i));
        }
        for (int i = city.length() - 1; i >= 0; i--) {
            //System.out.println(i);
            System.out.println(city.charAt(i));

        }

        String country = "nepal";
        String rev = "";
        for (int i = 0; i < country.length(); i++) {
            //System.out.println(i);
            System.out.println(country.charAt(i));

            rev = country.charAt(i) + rev;

            //     "n"   + ""    =======> n
            //     "e"   + "en"  =======> en
            //     "p"   + "pen" =======> pen
            //     "a"   + "apen" =====> apen
            //     "l"   + "lapen" =====> lapen

        }

        System.out.println(rev);

        String city3 = "wardha";
        String rev2 = "";
        for (int i = city3.length() - 1; i >= 0; i--) {
            //System.out.println(i);
            //System.out.println(city3.charAt(i));
            rev2 = rev2 + city3.charAt(i);
        }
        System.out.println(rev2);

        String object = "timeMachine";
        String rev3 = "";
        for (int i1 = 0; i1 < object.length(); i1++) {
            //System.out.println(i1);
            System.out.println(object.charAt(i1));

            rev3 = object.charAt(i1) + rev3;

            // ""    +    e  ======>    e
            // "e"   +    n =======>    en
            // "en"  +    i =======>    eni
            //  "eni" +   h =======>    enih
            // "enih"  +  c =====>      enihc
            //  "enihc"  + a =====>     enihca
            //  "enihca"  + M ====>     enihcaM
            //  "enihcaM"  + e =====>   enihcaMe
            // "enihcaMe"   + m =====>  enihcaMem
            // "enihcaMem"  + i ====>   enihcaMemi
            // "enihcaMemi  + t ====>   enihcaMemit
        }
        System.out.println(rev3);

        String country1 = "America";
        String rev4 = "";

        for (int i = country1.length() - 1; i >= 0; i--) {
            //System.out.println(i);
            //System.out.println(country1.charAt(i));
            rev4 = rev4 + country1.charAt(i);
        }
        System.out.println(rev4);

        String fruits = "apple, mango, banana, grapes, papaya";
        String userInput = "orange";

        if (fruits.contains(userInput)) {
            System.out.println("fruit is available");
        } else {
            System.out.println("fruit is not available");
        }

        String fruits1 = "apple, mango, banana, grapes, orange, papaya";
        String userInput1 = "mango";

        if (fruits1.contains(userInput1)) {
            System.out.println("fruit is available");
        } else {
            System.out.println("fruit is not available");
        }

        String fruits2 = "apple, mango, banana, grapes, orange, papaya";
        String userInput2 = "BANANA";

        if (fruits2.contains(userInput2)) {
            System.out.println("fruit is available");
        } else {
            System.out.println("fruit is not available");
        }

        String fruits3 = "apple, mango, banana, grapes, orange, papaya";
        String userInput3 = "apple";

        if (!fruits3.contains(userInput3)) {
            System.out.println("fruit is not available");
        } else {
            System.out.println("fruit is available");
        }

        String fruits4 = "apple, mango, banana, grapes, orange, papaya";
        String userInput4 = "apPle";

        if (!fruits4.contains(userInput4)) {
            System.out.println("fruit is not available");
        } else {
            System.out.println("fruit is available");
        }

        String firstName = "sampada";
        int count = 0;

        for (int i = 0; i < firstName.length(); i++) {
            System.out.println(firstName.charAt(i));

            if (firstName.charAt(i) == 'a' || firstName.charAt(i) == 'e' || firstName.charAt(i) == 'i' || firstName.charAt(i) == 'o' || firstName.charAt(i) == 'u') {
                count = count +1;


            }


        }

        System.out.println(count);
    }
}
