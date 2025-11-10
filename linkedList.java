import java.util.*;

public class linkedList{


    public static void main(String [] args){
        //declare list
        List<String> cars = new LinkedList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars);

        cars.get(2);
        System.out.println(cars.get(2));

        cars.set(0, "Waggoner");
        System.out.println(cars);

        int listSize = cars.size();
        System.out.println(listSize);

        cars.remove(2);
        System.out.println(cars);

        cars.clear();
        System.out.println(cars);
    }



    class SingleNode{
        String data;
        SingleNode next;


        SingleNode(String data){
            this.data = data;
            this.next = null;
        }

    }


    class SinglyLinkedList{
        // private Node head;
    }

}


