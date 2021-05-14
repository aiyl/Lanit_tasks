package animals;
import Aviary.AviarySize;
import food.Food;

public abstract class Animal {
    int food_level = 20;
    private String name;
    AviarySize needSize;

    public Animal(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public AviarySize getNeedSize() {
        return needSize;
    }

    public abstract void eat(Food food);

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Animal other = (Animal) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        return result;
    }
}
