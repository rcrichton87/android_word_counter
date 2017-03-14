package com.codeclan.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class WordCounterTest {

    WordCounter wordCounter;
    String string;

    @Before
    public void before(){
        wordCounter = new WordCounter();
        string = "It was the best of times, it was";
    }

    @Test
    public void testWordCountStartsEmpty(){
        assertEquals(0, wordCounter.getWordCountSize());
    }

    @Test
    public void testWordCount(){
        HashMap<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("it",  2);
        expected.put("was",  2);
        expected.put("the",  1);
        expected.put("best",  1);
        expected.put("of",  1);
        expected.put("times",  1);
        HashMap<String, Integer> actual = wordCounter.getWordCount(string);
        assertEquals(expected, actual);


    }

}