package lab_07_2;

import java.security.SecureRandom;

public class Tiger extends Animal {

    public Tiger() {
        setAnimalName(Tiger.class.getSimpleName());
        setSpeed(new SecureRandom().nextInt(90));
    }
}
