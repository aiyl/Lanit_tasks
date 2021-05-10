import animals.*;
import food.Food;
import food.Grass;
import food.Meat;

public class Zoo {

    public static void main(String[] args) {
        Lion lion = new Lion();
        Cow cow = new Cow();
        Animal crocodile = new Crocodile();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Piranha piranha = new Piranha();

        Food meat = new Meat();
        Grass grass = new Grass();

        Worker worker = new Worker();
        worker.getVoice(lion);
        worker.feed(lion, meat);
        worker.feed(fish, meat);
        worker.feed(fish, grass);
        //worker.getVoice(fish);
        piranha.swimDeep();
        duck.flyFast();
        worker.feed(duck, grass);
        worker.getVoice(cow);

        Animal[] pond = new Animal[] {duck, fish, crocodile};
        for (Animal animal : pond){
            Swim swimAnimal = (Swim) animal;
            swimAnimal.swimDeep();
        }


    }
}
