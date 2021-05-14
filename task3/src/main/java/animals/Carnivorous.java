package animals;
import food.Food;
import food.Grass;
import food.Meat;
public abstract class Carnivorous extends Animal {
    public Carnivorous(String s){
        super(s);
    }
    @Override
    public void eat(Food food){
        try {
            if (food instanceof Grass){
                throw new WrongFoodException();
            } else {
                food_level += Meat.food_energy;
                System.out.println("Animal has eat food. Energy = " + food_level);
            }
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
    }

}
