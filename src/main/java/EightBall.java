import java.util.ArrayList;
import java.util.Collections;

public class EightBall {

    private ArrayList<String> words;

    public EightBall(ArrayList<String> words){
        this.words = words;
    }

    public String getRandomWord(){
        Collections.shuffle(words);
        return words.get(0);
    }

    public ArrayList<String> getWords(){
        return new ArrayList<>(this.words);
    }

    public void add(String word){
        this.words.add(word);
    }

    public int getWordCount() {
        return this.words.size();
    }

    public void remove(int word){
        this.words.remove(word);
    }
}
