import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List <String> groceries = new ArrayList<>();
        groceries.add("Cheese");
        groceries.add("Mayo");
        groceries.add("Milk");
        groceries.add(1,"Bacon");
        groceries.set(2,"Eggs");
        groceries.remove(2);
        System.out.println(groceries);
        System.out.println(groceries.get(1));
        System.out.println(groceries.contains("Eggs"));

        //simple long loop
        for(int i = 0; i< groceries.size(); i++){
            System.out.println(("Index: " + i + " Value: " + groceries.get(i)));
        }

        //awesoem shrimple loop
        for (String str : groceries){
            System.out.println(str + " ");
        }
    }
}
