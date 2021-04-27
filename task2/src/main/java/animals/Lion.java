package animals;

public class Lion extends Carnivorous implements Voice, Run{
    public void runFast() {
        System.out.println("The lion is running");
        food_level -= 10;
    }

    public String voice() {
        return "RRAAAARRRR";
    }
}
