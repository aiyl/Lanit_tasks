package animals;
import food.Food;
import food.Meat;
public abstract class Carnivorous extends Animal {
    @Override
    public void eat(Food food){
        if (food instanceof Meat){
            food_level += Meat.food_energy;
            System.out.println("Animal has eat food. Energy = " + food_level);
        } else {
            System.out.println("The animal need another food!");
        }

    }

}
