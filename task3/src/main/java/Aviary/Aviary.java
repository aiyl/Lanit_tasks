package Aviary;
import animals.Animal;
import java.util.HashMap;
import java.util.Map;

public class Aviary<V extends Animal > {
    private final Map<String, V> animals = new HashMap<String, V>();
    private int aviarySize;
    private Class<?> type = null;

    public Aviary(AviarySize aviarySize){
        this.aviarySize = initAviarySize(aviarySize);
    }

    private int initAviarySize(AviarySize size){
        switch (size){
            case extraSmall:
                return 1;
            case small:
                return 2;
            case medium:
                return 3;
            case large:
                return 4;
        }
        throw new IllegalArgumentException("need AviarySize enum!");
    }

    public void addAnimal(V animal) {
        if (animals.isEmpty()) {
            type = animal.getClass().getSuperclass();
        } else {
            if (!animal.getClass().getSuperclass().equals(type)){
                throw new IllegalArgumentException(animal.getName() + " has another type");
            }
        }

        if (animals.containsKey(animal.getName())){
            throw new IllegalArgumentException(animal.getName() + " is in aviary");
        }

        int animalSize = initAviarySize(animal.getNeedSize());
        if (animalSize > aviarySize)
            throw new IllegalArgumentException(animal.getName() + " is too big for this aviary");
        animals.put(animal.getName(), animal);


    }

    public void deleteAnimal(V animal) {
        animals.remove(animal.getName());
    }

    public V getAnimal(String animalName) {
        if (!animals.containsKey(animalName)){
            throw new IllegalArgumentException("There is no " + animalName);
        }
        return animals.get(animalName);
    }
}

