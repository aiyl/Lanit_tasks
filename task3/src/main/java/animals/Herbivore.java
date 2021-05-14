package animals;

import food.Food;
import food.Grass;
import food.Meat;

public abstract class Herbivore extends Animal {

    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {
        try {
            if (food instanceof Meat) {
                throw new WrongFoodException();
            }
            else {
                food_level += Grass.food_energy;
                System.out.println("Animal has eat food. Energy = " + food_level);
            }
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }

    }
}
