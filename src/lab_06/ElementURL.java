package lab_06;

import java.util.Scanner;

public class ElementURL {

    public static void main(String[] args) {
        System.out.print("Input an URL to check HTTP or HTTPS: ");
        Scanner inputURL = new Scanner(System.in);
        String url = inputURL.nextLine();

        System.out.println("URL Protocol: " + url.substring(0, url.indexOf(":")));
        System.out.println("URL domain name: " + url.substring((url.indexOf("//")+2), url.indexOf(".")));
        System.out.println("Domain: " + url.substring(url.indexOf(".")));

    }
}
