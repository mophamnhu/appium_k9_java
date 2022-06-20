package lab_07_2;

import java.security.SecureRandom;

public class Dog extends Animal{

    public Dog() {
        setSpeed(new SecureRandom().nextInt(100));
        setAnimalName(Dog.class.getSimpleName());
    }
}
