package lab_03;

public class MergeArray {

    public static void main(String[] args) {

        int[] array1 = {1,4,6,2, 9};
        int[] array2 = {3,7,5,6,2};
        int finalLength = array2.length + array1.length;
        int[] finalArray = new int[finalLength] ;
        int finalIndex = 0;

        for(int index: array1) {
            finalArray[finalIndex] = index;
            finalIndex++;
        }
        for (int index: array2){
            finalArray[finalIndex] = index;
            finalIndex++;
        }

        System.out.print("Array 1: ");
        for (int index =0; index < array1.length;index++)
            System.out.print(array1[index] + "  ");

        System.out.print("\n" + "Array 2: ");
        for (int index =0; index < array2.length;index++)
            System.out.print(array2[index] + "  ");

        System.out.print("\n" + "Array after merge 2 arrays: ");
        for (int index =0; index < finalArray.length;index++)
            System.out.print(finalArray[index] + "  ");

        //Sort final Array
        int temp = 0;
        for (int index1= 0; index1 < finalArray.length - 1; index1++){
            for (int index2 = index1+1; index2< finalArray.length; index2++){
                if (finalArray[index1] > finalArray[index2]){
                    temp = finalArray[index2];
                    finalArray[index2] = finalArray[index1];
                    finalArray[index1] = temp;
                }
            }
        }
        System.out.print("\n" + "Array after sorted elements: ");
        for (int index =0; index < finalArray.length;index++)
            System.out.print(finalArray[index] + "  ");

    }
}
