import java.util.Comparator;


public class WolfComparator implements Comparator<Wolf> {
    
    @Override
    public int compare(Wolf wolf1, Wolf wolf2) {
        return Integer.compare(wolf1.age, wolf2.age);
            
    }
}
    
class WolfWeightComparator implements Comparator<Wolf>{

    @Override
    public int compare(Wolf wolf1, Wolf wolf2) {
        return Integer.compare(wolf1.weight, wolf2.weight);
    }
        
}
class FullComparator implements Comparator<Wolf> {
        @Override
        public int compare(Wolf o1, Wolf o2) {
        if((o1.getWeight() < o2.getWeight()) ||
        (o1.getAge() > o2.getAge()
        )
        //  && (o1.getWeight() == o2.getWeight())
        )
         {
         return 1;
     }
        else if((o1.getWeight() < o2.getWeight()) ||
        (o1.getAge() < o2.getAge()
        ))
        //  && (o1.getWeight() == o2.getWeight()))
        {
         return -1;
     }
     return 0;
    }
    }





