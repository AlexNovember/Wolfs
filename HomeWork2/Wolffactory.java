import java.util.ArrayList;
import java.util.Random;

public class Wolffactory {
    
    public static ArrayList<Wolf> createWolf(int WolfCount) {
    
    ArrayList<Wolf> WolfCage = new ArrayList<>(WolfCount); 
    
    for (int i = 1; i < WolfCount; i++) {
        Wolf wolf = new Wolf("Wolf №" + i, new Random().nextInt(1,30), new Random().nextInt(2, 50));
        WolfCage.add(wolf);
        }
        return WolfCage;
        }
    }
