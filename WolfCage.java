import java.security.SecureRandom;
import java.util.ArrayList;

public class WolfCage implements AnimalsCage {

protected ArrayList<Wolf> wolfs;

public WolfCage(ArrayList<Wolf> wolfs) {
    this.wolfs = wolfs;
    // wolfs = new ArrayList();
}

@Override
public String toString() {
    return "" + wolfs;

}

@Override
    public int addAnimal (Animals animal) {
    wolfs.add((Wolf) animal);
    return wolfs.size();
}

@Override
    public void RandomWolf() {
        var random = new SecureRandom();
        var randomElement = wolfs.get(random.nextInt(10));
        System.out.println(randomElement);
        }
        
        
        // System.out.println("В клетке: ");
        
    // throw new UnsupportedOperationException("Unimplemented method 'RandomWolf'");
}
