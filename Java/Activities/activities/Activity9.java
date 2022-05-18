package activities;

import java.util.ArrayList;
public class Activity9 {

    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Apple");
        myList.add("Orange");
        myList.add("Banana");
        myList.add(2,"Papaya");
        myList.add(1,"Pineapple");

        System.out.println("Print all the fruits:");
        for (String fruits:myList){
            System.out.println(fruits);
        }
        System.out.println("3rd Fruit in the list is: "+ myList.get(2));
        System.out.println("Is Grapes available in list:" + myList.contains("Grapes"));
        System.out.println("Size of ArrayList:"+ myList.size());

        myList.remove("Papaya");

        System.out.println("New size of ArrayList:"+ myList.size());
    }
}