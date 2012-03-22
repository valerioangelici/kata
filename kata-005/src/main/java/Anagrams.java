import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Anagrams {

    /**
     * You need to read the wordlist common-passwords.txt containing one word per line, find all the
     * anagram of the given word (the word itself excluded) and return a set of the words found
     *
     * @param word the word you have to find the anagrams
     * @return a Set<String> with the anagrams found
     */

    public Set<String> findAnagrams(String word) {
        InputStream in = ClassLoader.getSystemResourceAsStream("common-passwords.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String sortedWord = sortString(word);
        Set<String> result = new HashSet<String>();
        String strLine;
        //Read File Line By Line
        try {
            while ((strLine = br.readLine()) != null) {
                if (sortedWord.equals(sortString(strLine)) && !word.equals(strLine)) {
                    result.add(strLine);
                }
            }

            //Close the input stream
            in.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return result;
    }

    private String sortString(String inputString) {
        char[] content = inputString.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

}
