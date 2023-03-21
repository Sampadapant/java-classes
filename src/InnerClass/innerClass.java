package InnerClass;

public class innerClass {
    public static void main(String[] args) {
        University11 u = new University11();
        System.out.println(u.studentName);

        University11.department d = u.new department();
        System.out.println(d.ECA);
        System.out.println(d.courses);
        d.displayEca();

        University11.departmentNext dd = u.new departmentNext();
        System.out.println(dd.courses);
        System.out.println(dd.ECA);
        dd.displayEca();

    }
}
class University11{
    String studentName = "Sampada Pant";

    class department{
        String courses = "Physics";
        String ECA = "sing";

        public void displayEca() {
            System.out.println("ECA called");;
        }

    }
    class departmentNext{
        String courses = "Chemistry";
        String ECA = "sports";

        public void displayEca() {
            System.out.println("ECA has been called");
        }
    }

}