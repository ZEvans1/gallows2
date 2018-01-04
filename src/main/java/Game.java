import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Game {
    private String[] letterList;
    private String letter;

    private ArrayList<String> wordList = new ArrayList<>();
    public ArrayList<String> makeList() {
        wordList.add("jazz");
        wordList.add("galaxy");
        return wordList;
    }

    public Game (String letterGuess) {
        makeList();
        letter = letterGuess;
        Random random = new Random();
        String selectWord = wordList.get(0);
        letterList = selectWord.split("");
//        String selectWord = wordList.get( random.nextInt(wordList.size()) ); //this will show "jazz"
        for (int i = 0; i < selectWord.length(); i++) {
            if (letter.equals(letterList[i])) {
                //command
            } else {
                //other command
            }
        }
    }
}
