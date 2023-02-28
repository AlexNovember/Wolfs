import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;


public class Main {
  
 static int count = 10;

    public static void main(String[] args) {
        ArrayList<Wolf> wolfs = Wolffactory.createWolf(count);
        WolfCage WolfCage = new WolfCage(wolfs);
        System.out.println("------ В клетке: ------- ");
        System.out.println(WolfCage);
        System.out.println("-----Сортировка-----");
        // Comparator<Wolf> aa = new WolfComparator().thenComparing(new WolfWeightComparator());
        // Collections.sort(WolfCage);
        // WolfCage.sort(new WolfComparator());
        WolfCage.FullSort();;
        System.out.println(WolfCage);
        // System.out.println("__________");
        // WolfCage.sortByAge();
        // System.out.println(WolfCage);
        // System.out.println("__________");
        // WolfCage.sortByWeight();
        // System.out.println(WolfCage);
             }
}
// }