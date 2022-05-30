package Lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListMenu {

    public static void main(String[] args) {
        printMenu();
        boolean isSelectValue = true;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> myArrayList = new ArrayList<>();
        do {
            System.out.print("\n Please select a menu to run: ");
            switch (getUserValue()) {
                case 1:
                    System.out.print("Add a value for ArrayList: ");
                    myArrayList = addArrayList(arrayList, getUserValue());
                    break;
                case 2:
                    System.out.println("Your ArrayList: ");
                    printNumber(myArrayList);
                    break;
                case 3:
                    System.out.println("Maximum Number: " + getMaxNumber(myArrayList));
                    break;
                case 4:
                    System.out.println("Minimum Number: " + getMinNumber(myArrayList));
                    break;
                default:
                    System.out.println("Please select a number from 1-4!");
                    isSelectValue = false;
                }
            } while (isSelectValue);
    }

    public static int getUserValue (){
        Scanner scanner = new Scanner(System.in);
        int getUserNumber = scanner.nextInt();
        return getUserNumber;
    }
    public static void printMenu (){
        System.out.print("1. Add number into ArrayList\n" +
                "2. Print numbers\n" +
                "3. Get maximum number\n" +
                "4. Get minimum number\n");
    }
    public static List<Integer> addArrayList (List<Integer> arrayList, int number) {
        arrayList.add(number);
        return arrayList;
    }
    public static void printNumber(List<Integer> arrayList){
        for (int index = 0; index < arrayList.size(); index++) {
            System.out.print(arrayList.get(index) + "   ");
        }
    }
    public static int getMaxNumber(List<Integer> arrayList){
        int maxNumber = 0;
        for(int index= 0; index < arrayList.size();index++){
            if (arrayList.get(index) > maxNumber) {
                maxNumber = arrayList.get(index);
            }
        }
        return maxNumber;
    }
    public static int getMinNumber(List<Integer> arrayList){
        int minNumber = arrayList.get(0);
        for(int index= 0; index < arrayList.size();index++){
            if (arrayList.get(index) < minNumber){
                minNumber =  arrayList.get(index);
            }
        }
        return minNumber;
    }
}
