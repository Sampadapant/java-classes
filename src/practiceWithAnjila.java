public class practiceWithAnjila {
    public static void main(String[] args) {
        String name = "water melon";
        int count = 0;
        for (int i =0; i <name.length(); i ++){
            //System.out.println(i); //index
            //System.out.println(name.charAt(i));//every elements
            if (name.charAt(i)== 'a'|| name.charAt(i)=='e'|| name.charAt(i)=='i'|| name.charAt(i)=='o'|| name.charAt(i)=='u'){
                System.out.println(name.charAt(i));//every elements
                count = count +1;

            }

        }
        System.out.println(count);

        String name1 = "I am going to visit my parent";
        String name2=name1.replace("am","was");
        System.out.println(name2);

        String name3 = "I like to ";
        String name4 = "practice java with friends";
        String name5 = name3.concat(name4);
        System.out.println(name5);

        String name6 = "today is sunny day";
        String name7 = name6.toUpperCase();
        System.out.println(name7);

        String name8 = "kathmandu";
        System.out.println(name8.length());

    }
}
