package packZad3;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        ScannerWork scannerWork = new ScannerWork();
        StringWork stringWork = new StringWork();

        System.out.println("Program wczytuje słowa użytkownika.");
        System.out.println("Jeżeli słowo składa się na przemian z liter i cyfr - pojawi się komunikat.");
        System.out.println("Wpisanie 'quit' kończy pracę programu.");
        System.out.println();

        boolean flag = false;
        do {
            String word = scannerWork.getWord();

            try {
                stringWork.checkIfFirstDigit(word);
            } catch (MixedWordsException e) {
                System.err.println("Uwaga!");
            }

            if (word.equalsIgnoreCase("quit")) {
                flag = true;
            }
        } while (!flag);
//        Character.isDigit(/**/)
//        Character.isLetter(/**/)
    }


}
