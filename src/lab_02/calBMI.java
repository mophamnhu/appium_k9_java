package lab_02;

import java.util.Scanner;

public class calBMI {
    public static void main(String[] args) {
        //Input Height
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please input your height (cm): ");
        double yourHeight = scanner1.nextFloat()/100;

        //Input weight
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please input your weight (kg): ");
        double yourWeight = scanner2.nextFloat();


        //calBMI
        double calBMI = yourWeight / (Math.pow(yourHeight, 2));
        double resultFinal = Math.ceil(calBMI*10)/10;
        System.out.println("Your BMI is " + resultFinal);

        //Print out the advice
        if ( resultFinal <= 18.5F){
            System.out.println("You are underweight. You should increase your weight");
        }
        if (resultFinal >18.5F && resultFinal <=24.9F){
            System.out.println("You are normal weight. You should keep your weight");
        }
        if (resultFinal >24.9F && resultFinal <=29.9F){
            System.out.println("You are overweight. You should decrease your weight");
        }
        if (resultFinal >=30){
            System.out.println("You are obesity. You should decrease your weight");
        }
    }
}
