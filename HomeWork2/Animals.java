// import java.util.Random;

public abstract class Animals {
   
      
    protected String name;
    protected int age;
    protected int weight;

    
    public Animals(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
}

public String getName() {
    return name;
}
public int getAge() {
    return age;
}
public int getWeight() {
    return weight;
}

@Override
    public String toString() {
        return String.format("%s, Age: %d, Weight: %d", this.name,this.age, this.weight);
    }

}