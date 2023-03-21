public class test111 {
    public static void main(String[] args) {
        university u = new university();
        System.out.println(u.studentName);
    }
}
class university{
String studentName = "Sampada Pant";

    class department {
        String courses = "Physics";
        String ECA = "sing";
    }
    public void displayEca(){
        System.out.println("eca called");
    }
}
