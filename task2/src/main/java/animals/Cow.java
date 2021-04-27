package animals;

public class Cow extends Herbivore implements Voice, Run {


    public String voice() {
        return "Moo - moo";
    }

    public void runFast() {
        food_level -= 5;
        System.out.println("food level - " + food_level);
    }
}
