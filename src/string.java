public class string {
    public static void main(String[] args) {
       // creating a string
// program 1
       String subject = "I am learning selenium" ;
        String subject1 = "I am python" ;
        String subject2 = "I am learning java" ;
        System.out.println(subject);
        System.out.println(subject1);
        System.out.println(subject2);

        // string + integer ===> String
        // integer + integer ===> integer
        // Integer + String ===> String
        // String + String ===> String
//Program 2
        System.out.println("2" + 2); //"22"
        System.out.println(3 + 2);
        System.out.println(3 + "2");
        System.out.println("3" + "3");
// Program 3
     // Length () of string
      String greet = "I am learning java" ;
      int a1 = greet.length ();
        System.out.println(a1);
        System.out.println(greet.length());

        int x1 = 90;
        System.out.println(x1); //90
        System.out.println("x1"); //x1


        //program 4
        String first = "Python";
        String second = "Learning";
        System.out.println(first + second);
        System.out.println(first +" " +second);

        //program 5
        String three = "I am learning ";
        String four = "java !";
        String five= three.concat (four);
        System.out.println(five);


        // Program 6
        String city = new String ("pune");
        System.out.println(city);

        // program 7

        String city1 = "Nagpur";
        String cityU = city1.toUpperCase();
        System.out.println(cityU);

        String city2 = "Mumbai";
        String cityL = city2.toLowerCase();
        System.out.println(cityL);

        String city3 = "kathmandu";
        System.out.println(city3.length());

        String country = "Nepal";
        int q2 = country.toUpperCase().toLowerCase().length();
        System.out.println(q2);
    }
}
