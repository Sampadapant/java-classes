public class day13 {
    public static void main(String[] args) {

        //object of logger
Logger log = new Logger ();
log.message();

//OBJECT OF loggerA
loggerA loga = new loggerA();
        //System.out.println(loga.fullName); because of private field
        loga.displayFullName2();

      //object of data
      Data b = new Data ();
      b.flower = "rose";
        System.out.println(b.flower);

        //object of DataA
        DataA set = new DataA();
        set.setFlowerName("jasmine");
        String newFlower = set.getFlowerName();
        System.out.println(newFlower);

        //object for DataB
        DataB set1 = new DataB ("marigold");
        System.out.println(set1.getFlower());

        set1.setflower("water lily");
        System.out.println(set1.getFlower());
    }

    }

    class Logger {
    void message () {
        System.out.println("hello");
    }
    }
    class loggerA {
    private String fullName = "Sampada";

    private void displayFullName () {
        System.out.println(this.fullName);
    }

        void displayFullName2 (){  //we can either just write public or nothing
            this.displayFullName();
        }

    }

    class Data {
     String flower = "lily";
    }

    class DataA {
    private String flower = "jasmine";
    // setter
    //set the new value
    public void setFlowerName (String fN) {
        this.flower = fN;
    }
        // getter
        //get the value for flower outside the class
        public String getFlowerName() {
            return this.flower;
        }

    }

    class DataB {
    private String flower ;
    public DataB (String fl) {
        this.flower = fl;
    }
    //setting the value // update the flower
    void setflower(String flw) {
        this.flower = flw;
    }
     String getFlower() {
        return this.flower;
    }

    }




