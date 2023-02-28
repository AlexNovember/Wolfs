import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Collectors;





public class WolfCage implements AnimalsCage, Iterable<Wolf> {

protected ArrayList<Wolf> wolfs;

public WolfCage(ArrayList<Wolf> wolfs) {
    this.wolfs = wolfs;
    
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

    public void sortByAge(){
        Collections.sort(wolfs, new WolfComparator());
   }
    public void sortByWeight(){
        Collections.sort(wolfs, new WolfWeightComparator());
}
    public void FullSort(){
        // wolfs.stream()
        // .sorted(Comparator.comparing(Wolf::getWeight)
        //     .thenComparing(Wolf::getAge))
        // .collect(Collectors.toList())
        // .forEach(System.out::println);
        //  wolfs.sort(Comparator.comparing(Wolf:: getAge).thenComparing(Wolf:: getWeight));
        // Collections.sort(wolfs, new WolfComparator().thenComparing(new WolfWeightComparator()));
        Collections.sort(wolfs, new FullComparator());
        
   }

    @Override
    public Iterator<Wolf> iterator() {
        return new WolfIterator(wolfs);
    }
}
