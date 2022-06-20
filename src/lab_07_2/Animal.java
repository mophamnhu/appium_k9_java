package lab_07_2;

public class Animal  {

    private int speed;
    private String animalName;

    //constructor none param
    public Animal() {
    }

    //constructor 2 params
    public Animal(String animalName, int speed) {
        this.animalName = animalName;
        this.speed = speed;
    }

    //getter
    public int getSpeed() {
        return speed;
    }

    public String getAnimalName() {
        return animalName;
    }

    //setter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
}
