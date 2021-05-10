package animals;

public class Fish extends Herbivore implements Swim {

    public void swimDeep() {
        food_level -= 5;
        System.out.println("The fish is swimming. Energy = " + food_level);

    }
}
