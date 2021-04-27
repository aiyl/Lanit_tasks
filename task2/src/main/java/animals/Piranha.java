package animals;

public class Piranha extends Carnivorous implements Swim {

    public void swimDeep() {
        System.out.println("The piranha is running");
        food_level -= 10;
    }
}
