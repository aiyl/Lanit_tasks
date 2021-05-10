package animals;

public class Piranha extends Carnivorous implements Swim {

    public void swimDeep() {
        food_level -= 10;
        System.out.println("The piranha is swimming. Energy = " + food_level);
    }
}
