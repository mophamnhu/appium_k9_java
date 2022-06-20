package lab_07_2;

import java.security.SecureRandom;

public class Horse extends Animal{

    public Horse() {
        setSpeed(new SecureRandom().nextInt(380));
        setAnimalName(Horse.class.getSimpleName());
    }
}
