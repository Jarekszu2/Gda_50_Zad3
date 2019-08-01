package packZad3;

public class StringWork {
    public boolean digitParzysteOd2(String word) {
        char[] tab = word.toCharArray();
        int check = 0;
        for (int i = 2; i < tab.length; i+=2) {
            if (Character.isDigit(tab[i])) {
                check += 0;
            } else {
                check += 1;
            }
        }
        if (check == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean letterNieparzysteOd1(String word) {
        char[] tab = word.toCharArray();
        int check = 0;
        for (int i = 1; i < word.length(); i+=2) {
            if (Character.isLetter(tab[i])) {
                check += 0;
            } else {
                check += 1;
            }
        }
        if (check == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void checkIfFirstDigit(String word) throws MixedWordsException {
        if (Character.isDigit(word.charAt(0)) && letterNieparzysteOd1(word) && digitParzysteOd2(word)) {
            throw new MixedWordsException();
        }
    }
}
