package animals;
import food.Food;
import food.Meat;
public abstract class Carnivorous extends Animal {
    @Override
    public void eat(Food food){
        if (food instanceof Meat){
            System.out.println("The animal is eating");
            food_level += Meat.food_energy;
        } else {
            System.out.println("The animal need another food!");
        }

    }

}
