package PracticeSession;

public class ReversePractice {
    public static void main(String[] args) {
        String name ="Sampada";
        String rev = "";
        int name1 = name.length();
        for(int i = name1 -1; i >= 0; i--){
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);

        char [] n = {'a','n','j','i','l','a'};
        for(int i = n.length-1; i>=0; i--){
           // System.out.println(i);
            System.out.println(n[i]);
        }

        String n2 = "mouse";
        char [] c1 = n2.toCharArray();
        for(int i = 0; i<c1.length; i++){
            System.out.println(c1[i]);
        }
    }
}
