package lab_07_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();
        Animal winer = new Animal();

        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();

        animalList.add(dog);
        animalList.add(horse);
        animalList.add(tiger);

        System.out.println("Dog Speed: "+ dog.getSpeed());
        System.out.println("Horse Speed: "+ horse.getSpeed());
        System.out.println("Tiger Speed: "+ tiger.getSpeed());
        //Format: Winner is <Animal name>, with speed: <speed>
        winer = FasterAnimal(animalList);
        System.out.println("Winner is "+ winer.getAnimalName() + ", with speed: " + winer.getSpeed());

    }

    public static Animal FasterAnimal (List<Animal> animalList ){

        Animal animal = (Animal)animalList.get(0);

        for (Animal index : animalList) {
           if (index.getSpeed() > animal.getSpeed()){
               animal = index;
           }
        }
        return animal;

    }
}

