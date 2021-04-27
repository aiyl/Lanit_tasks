package animals;

public class Crocodile extends Carnivorous implements Swim, Voice{

    public String voice() {

        return "Aggghhrrr!!!";
    }

    public void swimDeep() {
        System.out.println("The crocodile is swimming");
        food_level -= 10;
    }
}
