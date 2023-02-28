

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
        return "{" + this.name + ", age=" + this.age + ", weight=" + this.weight + "}";
    }
 
}
