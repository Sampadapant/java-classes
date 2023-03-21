package Collection;

import java.util.HashMap;

public class hashMapKeyValue {
    public static void main(String[] args) {
        //creating hashmap object that store String keys and String values
        HashMap<String, String> flowerColor= new HashMap<String, String>();
        //add (.put)
        flowerColor.put("Rose","Pink"); //Rose is key and Pink is value
        flowerColor.put("Lily","Yellow");
        flowerColor.put("Daisy","White");
        flowerColor.put("Mimosa", "Purple");
        flowerColor.put("Quince", "Red");
        System.out.println(flowerColor);

        //retrieve // .get gives you value
        flowerColor.get("Lily");
        System.out.println(flowerColor.get("Lily"));
        System.out.println(flowerColor.get("Daisy"));
        System.out.println(flowerColor.get("Mimosa"));

        //update
        flowerColor.put("Daisy","Orange");
        System.out.println(flowerColor.get("Daisy"));
        flowerColor.put("Rose", "Black");
        System.out.println(flowerColor.get("Rose"));
        System.out.println(flowerColor);

        //remove
        flowerColor.remove("Quince");
        System.out.println(flowerColor);

        //size
        flowerColor.size();
        System.out.println(flowerColor.size());

        //clear
        //flowerColor.clear();
        //System.out.println(flowerColor.size());

        flowerColor.keySet(); //gives you key
        System.out.println(flowerColor.keySet());

        System.out.println(flowerColor.values()); //gives you values

        //for each loop
       for(String a :flowerColor.keySet()){
           System.out.println(a);
       }
       for (String b: flowerColor.values()){
           System.out.println(b);
       }
       for(String c: flowerColor.keySet()){
           System.out.println(c+ " "+ flowerColor.get(c));
       }

    }
}

//hashmap stores item in key/value
//key values gives you more readability