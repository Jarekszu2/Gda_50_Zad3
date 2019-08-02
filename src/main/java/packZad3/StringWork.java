package packZad3;

public class StringWork {
    public boolean digitParzyste(String word) {
        char[] tab = word.toCharArray();
        int check = 0;
        for (int i = 0; i < tab.length; i+=2) {
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

    public boolean digitNieparzyste(String word) {
        char[] tab = word.toCharArray();
        int check = 0;
        for (int i = 1; i < tab.length; i+=2) {
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

    public boolean letterParzyste(String word) {
        char[] tab = word.toCharArray();
        int check = 0;
        for (int i = 0; i < word.length(); i+=2) {
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

    public boolean letterNieparzyste(String word) {
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

    public void checkIfSpecialFormat_FirstDigit(String word) throws MixedWordsException {
        if (Character.isDigit(word.charAt(0)) && letterNieparzyste(word) && digitParzyste(word)) {
            throw new MixedWordsException();
        }
    }

    public void checkIfSpecialFormat_FirstLetter(String word) throws MixedWordsException {
        if (Character.isLetter(word.charAt(0)) && digitNieparzyste(word) && letterParzyste(word)) {
            throw new MixedWordsException();
        }
    }
}
