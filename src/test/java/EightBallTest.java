import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class EightBallTest {

    private EightBall eightBall;

    @Before
    public void before(){
        ArrayList<String> words = new ArrayList<>();
        words.add("Most definetly");
        words.add("Unlikely");
        words.add("Absolutely");
        eightBall = new EightBall(words);
    }

    @Test
    public void canGetRandom(){
        ArrayList results = eightBall.getWords();
        String randomWord = eightBall.getRandomWord();
        assertTrue(results.contains(randomWord));
    }

    @Test
    public void canAddWord(){
        eightBall.add("Not a chance in hell");
        assertEquals(4, eightBall.getWordCount());
    }

    @Test
    public void canRemoveWord(){
        eightBall.remove(0);
        assertEquals(2, eightBall.getWordCount());
    }
}
