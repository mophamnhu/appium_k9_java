package lab_06;

public class CalculateMinutes {

    public static void main(String[] args) {
        String inputString = "2hrs and 10 minutes";
        int hour = Integer.parseInt(inputString.substring(0,1));
        int minute = Integer.parseInt(inputString.substring(9,11));

        int totalTime = hour*60 + minute;
        System.out.println("Total calculated minutes is" + totalTime);

    }
}
