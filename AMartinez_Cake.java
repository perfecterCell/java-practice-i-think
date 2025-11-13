public class AMartinez_Cake {
    public static void main(String[] args) {
        double x =  Math.floor(Math.random() * 1000 ) + 1 ;
        double z =  Math.floor(Math.random() * 1000 ) + 1;
        double y =  Math.floor(Math.random() * 1000 ) + 1;
        double  α = x * z;

        System.out.println("Slices per guest " + Math.floor(α / y));
        System.out.println("leftover slices " + (α % y ));    
    }
}