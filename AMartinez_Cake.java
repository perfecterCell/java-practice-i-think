public class AMartinez_Cake {
    public static void main(String[] args) {
        double x =  Math.floor(Math.random()  );
        double z =  Math.floor(Math.random() );
        double y =  Math.floor(Math.random() );
        double  α = x * z;

        System.out.println("Slices per guest " + (x * z / y));
        System.out.println("leftover slices " + (α % y ));
        
    }
}