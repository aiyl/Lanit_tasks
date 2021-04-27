package animals;
import food.Food;
import food.Grass;
import food.Meat;

public abstract class Herbivore extends Animal {
    @Override
    public void eat(Food food){
        if (food instanceof Grass){
            System.out.println("The animal is eating ");
            food_level += Grass.food_energy;
        }
        else {
            System.out.println("The animal need another food!");
        }
    }
}
