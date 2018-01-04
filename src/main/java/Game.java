import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Game {
    private ArrayList<String> wordList = new ArrayList<>();
    public ArrayList<String> makeList() {
        wordList.add("jazz");
        wordList.add("galaxy");
        return wordList;
    }

    public Game (String letterguess) {
        makeList();
        Random random = new Random();
        String selectWord = wordList.get(0);
//        String selectWord = wordList.get( random.nextInt(wordList.size()) ); //this will show "jazz"
    }
}
