package Lab_02;

import java.util.Scanner;

public class oddEvenNumber {
    public static void main(String[] args) {
        int randomNumber;
        do {
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Please input an integer number: ");
            randomNumber = scanner3.nextInt();

            if (randomNumber % 2 == 0) {
                System.out.println(randomNumber + " is an even number.");
            } else System.out.println(randomNumber + " is an odd number.");
        }while (randomNumber!=0);
    }
}
