package animals;

import Aviary.AviarySize;

public class Piranha extends Carnivorous implements Swim {
    public Piranha(String name){
        super(name);
        needSize = AviarySize.extraSmall;
    }

    public void swimDeep() {
        food_level -= 10;
        System.out.println("The piranha is swimming. Energy = " + food_level);
    }
}
