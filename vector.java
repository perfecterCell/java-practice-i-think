import java.util.Vector;
public class vector{
        public static void main(String args []){
            Vector<String> names = new Vector<>();
            names.add("john");
            names.add("anna");
            names.add("seth rogan");
            System.out.println(names.firstElement());
            System.out.println(names.lastElement());
            System.out.println(names.size());
            names.clear();
        }
}