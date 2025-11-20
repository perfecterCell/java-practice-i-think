import java.util.*;

public class sets {
    public static void main(String[] args) {
        Scanner scuh = new Scanner(System.in);

        HashSet<String> faves = new HashSet<String>();
        faves.add("Hades");
        faves.add("Risk of Rain 2");
        faves.add("Persona 3 Reloaded");
        faves.add("Helldivers 2");
        faves.add("The Legend of Zelda: Tears of the Kingdom");
        faves.add("The Legend of Zelda: Breath of the Wild");
        faves.add("Marvel Rival");
        
        for(int i = 0; i < 67; i++){
            faves.add("Hades");
        }

        System.out.println(faves);
    }
}

/*  */