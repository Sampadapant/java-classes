public class getterSetter {
    public static void main(String[] args) {
        chips ch = new chips();
        System.out.println(ch.type);

        breakfast b = new breakfast();
        System.out.println(b.menu);
        b.setMenu("chinese");
        b.getMenu();
    }
}
class chips{
    String type = "hot and chilli";
}

class breakfast{
    String menu = "italian";

    public void setMenu(String mn){
        System.out.println(this.menu);
    }

    public String getMenu(){
        return this. menu;
    }

}