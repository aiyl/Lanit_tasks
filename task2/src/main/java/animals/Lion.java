package animals;

public class Lion extends Carnivorous implements Voice, Run {
    public void runFast() {
        food_level -= 10;
        System.out.println("The lion is running Energy = " + food_level);

    }

    public String voice() {
        return "RRAAAARRRR";
    }
}
