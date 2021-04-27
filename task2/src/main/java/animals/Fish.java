package animals;

public class Fish extends Herbivore implements Swim {

    public void swimDeep() {
        System.out.println("The fish is swimming");
        food_level -= 5;
    }
}
