package animals;

import Aviary.AviarySize;

public class Fish extends Herbivore implements Swim {

    public Fish(String name) {
        super(name);
        needSize = AviarySize.extraSmall;
    }

    public void swimDeep() {
        food_level -= 5;
        System.out.println("The fish is swimming. Energy = " + food_level);

    }
}
