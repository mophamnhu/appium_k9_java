package lab_06;

import java.util.Scanner;

public class InputPassword {

    public static void main(String[] args) {
        String myPass = "password123";
        int time = 1;
        do {
            System.out.print("Please input your password:");
            Scanner inputPass = new Scanner(System.in);
            String inputPass1 = inputPass.nextLine();

            if(inputPass1.equals(myPass)) {
                System.out.println("Correct Password!");
                break;
            }
            else
            {
                System.out.println("Please try again. Remain times: " + (3 - time));
                time ++;
            }

        } while (time <= 3 );



    }

}
