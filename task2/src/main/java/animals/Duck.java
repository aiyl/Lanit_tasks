package animals;

public class Duck extends Herbivore implements Fly, Voice, Swim{

    public void flyFast() {
        System.out.println("The duck is flying");
        food_level -= 10;
    }

    public void swimDeep() {
        System.out.println("The duck is swimming");
        food_level -= 5;
    }

    public String voice() {
        return "Crya-crya";
    }
}
