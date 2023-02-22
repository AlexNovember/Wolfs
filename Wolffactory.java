import java.util.ArrayList;

public class Wolffactory {
    
    
       
   
    public static ArrayList<Wolf> createWolf(int WolfCount) {
    
    ArrayList<Wolf> WolfCage = new ArrayList<>(WolfCount); 
    
    
    
    for (int i = 0; i < WolfCount; i++) {
        Wolf wolf = new Wolf("Wolf " + i, i, i);
        WolfCage.add(wolf);
        }
        return WolfCage;
        }
    }
