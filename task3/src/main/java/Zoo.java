import Aviary.Aviary;
import Aviary.AviarySize;
import animals.*;
import food.Food;
import food.Grass;
import food.Meat;

public class Zoo {

    public static void main(String[] args) throws Exception{

        Lion lion = new Lion("Simba");
        Lion lion1 = new Lion("Leo");
        Cow cow = new Cow("Shelly");
        Animal crocodile = new Crocodile("Gena");
        Duck duck = new Duck("Donald");
        Fish fish = new Fish("Flaunder");
        Piranha piranha = new Piranha("Killer");

        Food meat = new Meat();
        Grass grass = new Grass();

        Worker worker = new Worker();

        Aviary <Animal> aviary1 = new Aviary<Animal>(AviarySize.large);
        Aviary <Animal> aviary2 = new Aviary<Animal>(AviarySize.medium);
        aviary1.addAnimal(duck);
        aviary1.addAnimal(cow);
        //aviary1.addAnimal(lion);
        aviary2.addAnimal(lion);
        aviary2.addAnimal(piranha);
        aviary2.addAnimal(lion1);
        //aviary1.getAnimal("Leo");
        System.out.println(aviary1.getAnimal("Donald"));

         /*worker.getVoice(lion);
        worker.feed(lion, meat);
        //worker.feed(fish, meat);
        worker.feed(fish, grass);
        //worker.getVoice(fish);
        piranha.swimDeep();
        duck.flyFast();
        worker.feed(duck, grass);
        worker.getVoice(cow);

        Animal[] pond = new Animal[]{duck, fish, crocodile};
        for (Animal animal : pond) {
            Swim swimAnimal = (Swim) animal;
            swimAnimal.swimDeep();
        }*/

    }
}
