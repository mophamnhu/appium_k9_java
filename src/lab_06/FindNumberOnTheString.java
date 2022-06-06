package lab_06;

public class FindNumberOnTheString {
    public static void main(String[] args) {
        String s = "helloThisIsA1234Sample123";
        System.out.println("The original string: " + s);

        String m = new String();
        for(char c: s.toCharArray()){
            if (Character.isDigit(c)) {
                m = m + Character.getNumericValue(c);
            }
        }
        System.out.println("The String after cutting of the alphabet: " + m);

    }
}

