package animals;

import Aviary.AviarySize;

public class Cow extends Herbivore implements Voice, Run {

    public Cow(String name) {
        super(name);
        needSize = AviarySize.large;
    }



    public String voice() {
        return "Moo - moo";
    }

    public void runFast() {
        food_level -= 5;
        System.out.println("Cow is running. food level - " + food_level);
    }
}
