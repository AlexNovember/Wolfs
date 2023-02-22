import java.security.SecureRandom;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Wolf> wolfs = Wolffactory.createWolf(10);
        WolfCage WolfCage = new WolfCage(wolfs);
        var random = new SecureRandom();
        var randomElement = wolfs.get(random.nextInt(10));
        System.out.println("В клетке: ");
        System.out.println(WolfCage);
        System.out.println("Случайное животное ");
        System.out.println(randomElement);
      }
}