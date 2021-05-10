package animals;
import food.Food;
import food.Grass;
import food.Meat;

public abstract class Herbivore extends Animal {
    @Override
    public void eat(Food food){
        if (food instanceof Grass){
            food_level += Grass.food_energy;
            System.out.println("Animal has eat food. Animal Energy = " + food_level);
        }
        else {
            System.out.println("The animal need another food!");
        }
    }
}
