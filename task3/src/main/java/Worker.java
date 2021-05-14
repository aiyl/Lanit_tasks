import animals.Animal;
import animals.Voice;
import food.Food;


public class Worker {
    void feed(Animal animal, Food food){
        animal.eat(food);
    }

    void getVoice(Animal animal) {
        Voice animalVoice = (Voice) animal;
        System.out.println(animalVoice.voice());
    }

}
