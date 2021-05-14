package animals;

public class WrongFoodException extends Exception {
    public String toString()
    {
        return "Error. The animal need another food.";
    }
}
