package Collection;

import java.util.ArrayList;

public class Collection1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(); // created a array list ; name of arraylist is names which can hold the value of String
        //add
        names.add("Sansa");
        names.add("Arya");
        names.add("Snow");
        names.add("Brandon");
        names.add("Rickon");

        //retrieve: return string //list of method
        String a = names.get(0);
        System.out.println(a);
        String b = names.get(1);
        System.out.println(b);
        String c = names.get(2);
        System.out.println(c);

        //update-- change
        names.set(4,"lynna");
        System.out.println(names.get(4));
        System.out.println(names);

        // delete
        names.remove(2);
        System.out.println(names.get(2));

        //clear
        //names.clear();

        //size of array list
        System.out.println(names.size());

        System.out.println(names);

        //for loop
        for(int i =0; i <names.size(); i ++){
            //System.out.println(i);
            System.out.println(names.get(i));
        }
        //for each loop
        for(String n: names){
            System.out.println(n);
        }
        //array list of integers
        ArrayList<Integer> num1= new ArrayList<Integer>();
        //add
        num1.add(10);
        num1.add(20);
        num1.add(30);
        num1.add(40);
        num1.add(50);
        System.out.println(num1);

        //retrieve
        int aa = num1.get(0);
        System.out.println(aa);
        int bb = num1.get(3);
        System.out.println(bb);

        //update
        int cc = num1.set(1,15);
        System.out.println(num1.get(1));

        //delete
        num1.remove(3);
        System.out.println(num1.get(3));

        num1.size();
        System.out.println(num1.size());

        System.out.println(num1);

        //for loop
        for (int i=0; i < num1.size(); i ++){
            //System.out.println(i);
            System.out.println(num1.get(i));
        }

        //for each loop
        for(int num : num1){
            System.out.println(num);
        }


    }
}
// arrays have fixed length but array list can be modified
//we can modify the size of array list