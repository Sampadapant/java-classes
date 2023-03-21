package Interface;

public class interFace2 {
    public static void main(String[] args) {
// interface extends interface
        Weekdays w = new Weekdays();
        w.barbeQue();
        w.clickPictures();
        w.cookDinner();
        w.eatFood();
        w.familyTime();
        w.cruiseDinner();
        w.partyLateNight();
        w.shopPing();
        w.watchMovies();
    }
}
interface Holidays{
    public void clickPictures();
    public void shopPing();
    public void cruiseDinner();
}
interface Festival{
    public void eatFood();
    public void familyTime();
    public void partyLateNight();
}
// we want to implement the set up of holidays and festival to Interface.Weekend. So,to avoid the repetition we have extend the Interface.Weekend
//we don't want to define two interface separately.
// Interface.Weekend will have its own method including of Interface.Holidays and Interface.Festival.
interface Weekend extends Holidays,Festival{ // this is inheritance between the interface
     public void barbeQue();
     public void watchMovies();
     public void cookDinner();
}
class Weekdays implements Weekend{

    @Override
    public void clickPictures() {
        System.out.println("pictures clicked");
    }
    @Override
    public void shopPing() {
        System.out.println("bought groceries and food items");
    }
    @Override
    public void cruiseDinner() {
        System.out.println("attended cruise dinner for 3 days");
    }
    @Override
    public void eatFood() {
        System.out.println("Eating Nepali food is fun");
    }
    @Override
    public void familyTime() {
        System.out.println("spent time together with families");
    }
    @Override
    public void partyLateNight() {
        System.out.println("late night party till 3am");
    }
    @Override
    public void barbeQue() {
        System.out.println("evening barbeque with music is full of Interface.life");
    }
    @Override
    public void watchMovies() {
        System.out.println("watched indian suspense and thriller web series");
    }
    @Override
    public void cookDinner() {
        System.out.println("Cooking dinner with everyone was easy");
    }
}