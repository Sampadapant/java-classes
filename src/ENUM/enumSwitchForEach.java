package ENUM;

enum Week{
    SUN, MON, TUE, WED, THU, FRI, SAT;
}

public class enumSwitchForEach {
    public static void main(String[] args) {
        WeekTest wt = new WeekTest(Week.FRI);
        wt.getWeekDays();

        Week [] days1 = Week .values();
        for (Week w: days1){
            System.out.println(w.ordinal()); //index
            System.out.println(w); //elements of array
        }


    }
}

class WeekTest{
    Week days;

    public WeekTest (Week days){
        this.days = days;
    }
    public void getWeekDays(){
        switch (days){
            case SUN:
                System.out.println("it is off");
                break;
            case MON:
                System.out.println("STARTS");
                break;
            case TUE:
                System.out.println("SECOND");
                break;
            case WED:
                System.out.println("MID WEEK");
                break;
            case THU:
                System.out.println("WEEKEND IS ALMOST THERE");
                break;
            case FRI:
                System.out.println("WEEKEND IS HERE");
                break;
            case SAT:
                System.out.println("LET'S ENJOY");
                break;
        }
    }
}
