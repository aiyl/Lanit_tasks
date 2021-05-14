package animals;

import Aviary.AviarySize;

public class Lion extends Carnivorous implements Voice, Run {

    public Lion(String s) {
        super(s);
        needSize = AviarySize.medium;
    }

    public void runFast() {
        food_level -= 10;
        System.out.println("The lion is running Energy = " + food_level);

    }

    public String voice() {
        return "RRAAAARRRR";
    }
}
