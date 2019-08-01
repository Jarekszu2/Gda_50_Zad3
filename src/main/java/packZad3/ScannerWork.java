package packZad3;

import java.util.Scanner;

public class ScannerWork {
    Scanner scanner = new Scanner(System.in);

    public String getWord() {
        System.out.println("Podaj słowo:");
        String word = scanner.next();
        return word;
    }
}
