import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LongestWordLengthTest {

    private LongestWordLength longestLengthFinder = new LongestWordLength();

    @Test
    public void for5Words() {

        assertEquals("voluptate 9", longestLengthFinder.finder("in voluptate velit esse cillum dolore eu fugiat?"));
    }

    @Test
    public void withPunctuations() {
        assertEquals("exercitation 12", longestLengthFinder.finder(" Ut enim ad minim veniam? Quis nostrud exercitation, ullamco laboris; nisi ut aliquip ex ea commodo consequat!"));
    }
    @Test
    public void forEmptyString() {
        assertEquals(" 0", longestLengthFinder.finder(" "));
    }

    @Test
    public void forLongText() {
        assertEquals("reprehenderit 13", longestLengthFinder.finder("Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));

    }
    @Test
    public void forAWord() {
        assertEquals("adipiscing 10", longestLengthFinder.finder("adipiscing"));
    }


}

