

public class Main {
    public static void main(String[] args) {
        //string is inbuilt data type
        String fullName = "sampada";
        //now creating the object of type string

        String q = fullName.toUpperCase();
        System.out.println(q);
        //creating instance or object of human class

        Human amol = new Human("amol rao" , 23);
        System.out.println(amol.age);
        System.out.println(amol.fullname);
        amol.talk();
        amol.walk();

        //creating instance or object of human class
        Human sampada = new Human ( "sampada pant", 27) ;
        System.out.println(sampada.age);
        System.out.println(sampada.fullname);
        sampada.walk();
        sampada.talk();
    }
}


        class Human {
            // properties or fields
            String fullname;
            int age;

            // contructor to set property values , field values

            public Human (String fullN, int age) {
                this.fullname = fullN;
                this.age = age;
            }

            // methods
            //talk() and walk()
             public void talk () {
                 System.out.println("I am talking");
             }
             public void walk () {
                System.out.println("I am walking");
             }
}



