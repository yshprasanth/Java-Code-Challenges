package codewars.core;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestWordTest {
    private ShortestWord shortestWord;

    @Before
    public void setUp() throws Exception {
        shortestWord = new ShortestWord();
    }

    @After
    public void tearDown() throws Exception {
        shortestWord = null;
    }

    @Test
    public void testShortestWord1() {
        shortestWord.setSentence("hello world!!, I am taking up coding challenge");
        int result = shortestWord.getShortestWordLength();
        Assert.assertEquals("Shortest word not found !!", 1, result);
    }
}