package animals;
import food.Food;

public abstract class Animal {
    int food_level = 20;
    public abstract void eat(Food food);
}
