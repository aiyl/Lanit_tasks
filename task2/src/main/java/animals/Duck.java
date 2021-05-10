package animals;

public class Duck extends Herbivore implements Fly, Voice, Swim{

    public void flyFast() {
        food_level -= 10;
        System.out.println("The duck is flying. Energy = " + food_level);
    }

    public void swimDeep() {
        food_level -= 5;
        System.out.println("The duck is swimming. Energy = " + food_level);
    }

    public String voice() {
        return "Crya-crya";
    }
}
