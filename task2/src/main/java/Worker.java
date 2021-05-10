import animals.Animal;
import animals.Cow;
import animals.Voice;
import food.Food;

import java.io.IOException;

public class Worker {
    void feed(Animal animal, Food food){
        animal.eat(food);
    }

    void getVoice(Animal animal) {
        Voice animalVoice = (Voice) animal;
        System.out.println(animalVoice.voice());
    }

}
