package day04.hangman;

public class Model {

    private String wordToFind ;
    private String wordFound ;
    private int chances ;

    public Model(String wordToFind, int chances) {
        this.wordToFind = wordToFind;
        wordFound = "_".repeat(wordToFind.length());
        this.chances=chances;
    }

    public String getWordToFind() {
        return wordToFind;
    }

    public String getWordFound() {
        return wordFound;
    }

    public int getChances() {
        return chances;
    }

    public boolean isWinner() {
        return wordFound.equals(wordToFind);
    }

    public boolean hasMoreChance() {
        return chances > 0;
    }

    public boolean Guess(String guess) {
        if (wordToFind.contains(guess)) {
            wordFound = updateWordFound(wordToFind, wordFound, guess);
            return true;
        } else {
            chances--;
            return false;
        }
    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }
}
