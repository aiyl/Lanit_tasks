package animals;

public class Crocodile extends Carnivorous implements Swim, Voice{

    public String voice() {

        return "Aggghhrrr!!!";
    }

    public void swimDeep() {
        food_level -= 10;
        System.out.println("The crocodile is swimming. Energy = " + food_level);
    }
}
