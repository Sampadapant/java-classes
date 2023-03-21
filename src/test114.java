public class test114 {
    public static void main(String[] args) {
        String city = "Nepal";
        String rev = "";
        int city1 = city.length();
        for (int i = city1 - 1; i >= 0; i-- ) {
            rev = rev + city.charAt(i);
        }
        System.out.println(rev);
    }
}
//reverse a string of Nepal