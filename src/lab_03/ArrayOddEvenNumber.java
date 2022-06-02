package lab_03;

public class ArrayOddEvenNumber {

    public static void main(String[] args) {

        int[] intArr = {1, 2, 3, 4, 5};
        int evenNumber = 0;
        int oddNumber = 0;
        int maxNumber = 0;
        int minNumber = intArr[0];

        //Odd or even number in an array
        for (int index = 0; index < intArr.length; index++) {
            if ((intArr[index] % 2) == 0) {
                evenNumber++;
            } else oddNumber++;
        }
        System.out.println("Even number:" + evenNumber);
        System.out.println("Odd number:" + oddNumber + "\n");

        //Min & max value in an array
        for (int index2 = 0; index2 < (intArr.length); index2++){

            if (intArr[index2] > maxNumber){
                maxNumber = intArr[index2];
            }

            if (intArr[index2] < minNumber){
                minNumber = intArr[index2];
            }
        }
        System.out.println("Max number:" + maxNumber);
        System.out.println("Min number:" + minNumber);

        //Sort items in an array
        int[] intArray2 = {12, 34, 1, 16, 28};
        int temp = 0;

        for (int index= 0; index < intArray2.length - 1; index++){
            for (int index1 = index+1; index1< intArray2.length; index1++){
                if (intArray2[index] > intArray2[index1]){
                    temp = intArray2[index1];
                    intArray2[index1] = intArray2[index];
                    intArray2[index] = temp;
                }
            }
        }

        System.out.print("\n" + "Array is sorted from min to max: ");
        for (int c = 0; c < intArray2.length; c++)
            System.out.print(intArray2[c] + " ");
    }
}
