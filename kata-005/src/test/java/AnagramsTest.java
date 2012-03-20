import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class AnagramsTest {

    private final Anagrams anagrams = new Anagrams();

    private Set<String> aliasAnagrams = new HashSet<String>();
    private Set<String> qwertyAnagrams = new HashSet<String>();
    private Set<String> emptySet = new HashSet<String>();


    @Before
    public void Setup() {
        aliasAnagrams.add("alisa");
        qwertyAnagrams.add("ytrewq");
        qwertyAnagrams.add("ytreqw");

    }

    @Test
    public void testGetResult() throws Exception {
        assertEquals("alias", aliasAnagrams, anagrams.findAnagrams("alias"));
        assertEquals("ann", emptySet, anagrams.findAnagrams("ann"));
        assertEquals("work", emptySet, anagrams.findAnagrams("work"));
        assertEquals("fun", emptySet, anagrams.findAnagrams("fun"));
        assertEquals("qwerty", qwertyAnagrams, anagrams.findAnagrams("qwerty"));

    }
}
