package example.codeclan.com.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 18/04/2017.
 */

public class WordTest {

    Word words;

    @Before
    public void before(){
        words = new Word("Jake Sam James");
    }

    @Test
    public void canSplitWords(){
        String[] splitWordsHard = {"Jake","Sam","James"};
        String[] splitWordsMethod = words.splitToArray();
        assertEquals( splitWordsHard.length, splitWordsMethod.length );
        assertEquals(3, splitWordsHard.length);
    }
}
