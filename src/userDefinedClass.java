public class userDefinedClass {
    public static void main(String[] args) {
// now creating object out of the line from 28 to 35
       Person kashyap = new Person();
       // the default value for the first name last name and age will be sampada pant and 16.
        System.out.println(kashyap.firstName);
        System.out.println(kashyap.lastName);
        System.out.println(kashyap.age);

        // if we create another object, still the value for the first name last name and age will be the same because we hardcoded the value in line no.29,30, 31
        Person sanjay = new Person();
        System.out.println(sanjay.firstName);
        System.out.println(sanjay.lastName);
        System.out.println(sanjay.age);

        //if i want to change the age for kashyap // it is setting the value outside the class
        kashyap.age = 19;
        System.out.println(kashyap.age);

        //if i want to change the last name for sanjay
        sanjay.lastName = "ban";
        System.out.println(sanjay.lastName);

        //Calling the constructor
        PersonA sheela = new PersonA ("sheela","sharma", 18);
        PersonA ashmita = new PersonA ("ashmita","pant", 25);
        PersonA laila = new PersonA ("laila","adhikari", 29);
        System.out.println(sheela.firstName);
        System.out.println(ashmita.firstName);

        String names [] = {"novi","sovi","bobby","robi"};
        PersonA students []= {sheela,ashmita,laila};
        //for loop
        for (int i =0; i< students.length; i++){
            //System.out.println(i);
            //System.out.println(students[i]); //address of memory
            System.out.println(students[i].firstName);
            System.out.println(students[i].lastName);
            System.out.println(students[i].age);
        }
        //for each loop  (to get first name ,last name and age of every property
        for (PersonA a: students) {
            System.out.println(a.firstName);
            System.out.println(a.lastName);
            System.out.println(a.age);
            a.displayName();
        }
        //object of bank
        new Bank ("Martin", "Savings", 123);
        new Bank ("rabin", "Fixed", 456);
        new Bank ("Slesha", "Call", 897);
        Bank retail []= {
                new Bank ("Martin", "Savings", 123),
                new Bank ("rabin", "Fixed", 456),
                new Bank ("Slesha", "Call", 897),


        };
        //for each

        for (Bank b:retail) {
            b.depositAmt(); // calling out method
            System.out.println(b.accName); //printing property
            System.out.println(b.accType); //printing property
            System.out.println(b.accNum);
        }


    }
}

// creating class that is person
class Person {
    String firstName = "sampada";  // creating property
    String lastName = "pant"; //because we have hardcoded the value, now the better approach is we have to set the value at the time of object creation.
    int age = 16; //coming outside and setting the value is not the correct option every time just in the line 17 and 21.

    //writing method
    public void fullName (){
        System.out.println(this.firstName + this.lastName);
    }

}
//use of constructor is setting the value at the time of object creation. It is the function which only return the object.
 class PersonA {
    String firstName; //not setting the value but only defining the string
    String lastName;
    int age;
    //constructor name and class name should be same (no void)
    //when we are defining the constructor, we don't mention the return type.
    public PersonA (String fn, String ln, int ag){ //constructor name should be same as class name.
        //we have three properties defined  and setting three properties to whatever value passed to constructor.
        this.firstName = fn; //ashmita
        this.lastName = ln; //pant
        this.age = ag; //25
        //this value will change to ashmita because we have set the value of this in the memory ashmita
    }
    public void displayName (){
        System.out.println(this.firstName + this.lastName);
    }
}
//bank
class Bank{
    String accName;
    String accType;
    int accNum;
    public Bank (String accName, String accType, int accNum){
        this.accName= accName;
        this.accType= accType;
        this.accNum = accNum;
    }
    public void depositAmt(){
    }
}