package Collection;

import java.util.HashMap;
import java.util.HashSet;
// create a hashmap object which store String keys and Inter Values
public class hashMapStringInteger {
    public static void main(String[] args) {
        HashMap<String, Integer> nameGrade = new HashMap<String, Integer>();
        // add
        nameGrade.put("Manushi", 38);
        nameGrade.put("Saharsha",47);
        nameGrade.put("Shailee", 12);
        nameGrade.put("Slesha",65);
        nameGrade.put("Nirwan", 55);
        System.out.println(nameGrade);


        //retrieve
        nameGrade.get("Shailee");
        System.out.println(nameGrade.get("Shailee")); //gives values
        System.out.println(nameGrade.get("Nirwan"));

        //update
        nameGrade.put("Slesha",43);
        System.out.println(nameGrade);
        System.out.println(nameGrade.get("Slesha"));

        nameGrade.put("Saharsha",58);
        System.out.println(nameGrade);
        System.out.println(nameGrade.get("Saharsha"));

        //delete
        nameGrade.remove("Manushi");
        System.out.println(nameGrade);

       nameGrade.keySet();
        System.out.println(nameGrade.keySet());

        System.out.println(nameGrade.values());

        //for loop (key)
        for(String n : nameGrade.keySet()){
            System.out.println(n);
        }

       // for loop values
        for(int v : nameGrade.values()){
            System.out.println(v);
        }

        for (String t : nameGrade.keySet()){
            System.out.println(t + " "+ nameGrade.get(t));
        }

    }
}
